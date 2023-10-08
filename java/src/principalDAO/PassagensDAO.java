package principalDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import principal.Conexao;
import principal.Destinos;
import principal.Passagens;
import principal.Usuarios;

public class PassagensDAO {
    private Connection conexao = null;
    private PreparedStatement pstm = null;

    public void comprarPassagem()throws SQLException{
        Scanner input = new Scanner(System.in);
        String sql = "INSERT INTO PASSAGENS (local_partida, data_partida, data_retorno, quantidade_passagens, id_usuario, id_destino) VALUES (?, ?, ?, ?, ?, ?)";

        System.out.println("Qual o CPF do usuário?");
        String CPF_usuario = input.nextLine();
        System.out.println("Qual a cidade do destino?");
        String cidade_destino = input.nextLine().toUpperCase();

        System.out.println("Qual o local de partida? ");
        String local_partida = input.nextLine();
        System.out.println("Qual a data de partida? ");
        String dataPartidaString = input.nextLine();
        LocalDate data_partida = LocalDate.parse(dataPartidaString);
        System.out.println("Qual a data de retorno?");
        String dataRetornoString = input.nextLine();
        LocalDate data_retorno = LocalDate.parse(dataRetornoString);
        System.out.println("Quantas passagens?");
        int quantidade_passagens = input.nextInt();

        Passagens passagem = new Passagens(local_partida, data_partida, data_retorno, quantidade_passagens);

        try {
            conexao=Conexao.criarConexao();
            pstm=conexao.prepareStatement(sql);

            String consultaUsurario = "SELECT id_usuario FROM usuarios WHERE CPF = ?";
            String consultaDestino = "SELECT id_destino FROM destinos WHERE cidade = ?";

            PreparedStatement stmUsuario=conexao.prepareStatement(consultaUsurario);
            stmUsuario.setString(1, CPF_usuario);
            ResultSet r = stmUsuario.executeQuery();
            int idUsuario = 0;
            if(r.next()){
                idUsuario=r.getInt("id_usuario");
            }

            PreparedStatement stmDestino=conexao.prepareStatement(consultaDestino);
            stmDestino.setString(1, cidade_destino);
            ResultSet rs = stmDestino.executeQuery();
            int idDestino = 0;
            if(rs.next()){
                idDestino=rs.getInt("id_destino");
            }

            pstm.setString(1, passagem.getLocalPartida());
            pstm.setObject(2, passagem.getDataPartida());
            pstm.setObject(3, passagem.getDataRetorno());
            pstm.setInt(4, passagem.getQuantidadePassagens());
            pstm.setInt(5, idUsuario);
            pstm.setInt(6, idDestino);

            pstm.execute();
            System.out.println("Passagens compradas com sucesso!");
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro\n"+ex.getMessage());
        } finally {
            if(pstm!=null){
                pstm.close();
                input.close();
            }
            if (conexao!=null){
                conexao.close();
            }
        }
    }

    public void adicionarAcompanhante(){
//fazer condição quantidade_passagens > 1
    }

    public void consultarPassagem()throws SQLException{//mostrar acompanhante
        String sql = "SELECT usuarios.nome_completo, destinos.cidade, passagens.local_partida, passagens.data_partida, passagens.data_retorno, passagens.quantidade_passagens FROM passagens INNER JOIN usuarios ON passagens.id_usuario = usuarios.id_usuario INNER JOIN destinos ON passagens.id_destino = destinos.id_destino;";

        try {
            conexao=Conexao.criarConexao();
            pstm=conexao.prepareStatement(sql);
            ResultSet r = pstm.executeQuery();
            System.out.println("========== Informações de Passagem ==========");
            while(r.next()){
                Passagens passagem = new Passagens();
                Usuarios usuario = new Usuarios();
                Destinos destino = new Destinos();
                usuario.setNome(r.getString("nome_completo"));
                destino.setCidade(r.getString("cidade"));
                
                passagem.setUsuario(usuario);
                passagem.setDestino(destino);
                passagem.setLocalPartida(r.getString("local_partida"));
                passagem.setDataPartida(r.getDate("data_partida").toLocalDate());
                passagem.setDataRetorno(r.getDate("data_retorno").toLocalDate());
                passagem.setQuantidadePassagens(r.getInt("quantidade_passagens"));

                System.out.printf("Quantidade de passagens: %d\nUsuário: %s\nDestino: %s\nLocal de partida: %s\nData partida: %s - Data Retorno: %s", passagem.getQuantidadePassagens(),passagem.getUsuario().getNome(), passagem.getDestino().getCidade(),passagem.getLocalPartida(),passagem.getDataPartida(),passagem.getDataRetorno());
            }
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro\n"+ex.getMessage());
        } finally {
            if(pstm!=null){
                pstm.close();
            }
            if (conexao!=null){
                conexao.close();
            }
        }
    }
}
