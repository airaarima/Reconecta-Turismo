package principalDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import principal.Conexao;
import principal.Destinos;

public class DestinosDAO {
    private Connection conexao = null;
    private PreparedStatement pstm = null;

    public void adicionarDestino()throws SQLException{
        Scanner input = new Scanner(System.in);
        String sql = "INSERT INTO DESTINOS (valor, pais, cidade) VALUES (?, ?, ?)";

        System.out.println("Insira a cidade: ");
        String cidade = input.nextLine().toUpperCase();
        System.out.println("País: ");
        String pais = input.nextLine().toUpperCase();
        System.out.println("Qual o valor unitário da viagem até o destino? R$");
        double valor = input.nextDouble();

        Destinos destino = new Destinos(valor,pais,cidade);

        try {
            conexao=Conexao.criarConexao();
            pstm=conexao.prepareStatement(sql);

            pstm.setDouble(1, destino.getValor());
            pstm.setString(2, destino.getPais());
            pstm.setString(3, destino.getCidade());

            pstm.execute();
            System.out.println("Destino criado com sucesso!");

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

    public void atualizarDestino()throws SQLException{
        Scanner input = new Scanner(System.in);
        String sql = "UPDATE DESTINOS SET cidade = ?, pais = ?, valor = ? WHERE cidade = ?";

        System.out.println("Qual o nome da cidade?");
        String cidade_atualizacao = input.nextLine().toUpperCase();

        System.out.println("========== Atualização de dados ==========");
        System.out.println("Cidade: ");
        String cidade = input.nextLine().toUpperCase();
        System.out.println("Páis: ");
        String pais = input.nextLine().toUpperCase();
        System.out.println("Valor: R$");
        double valor = input.nextDouble();

        Destinos destino = new Destinos(valor, pais, cidade);

        try {
            conexao=Conexao.criarConexao();
            pstm=conexao.prepareStatement(sql);

            pstm.setString(1, destino.getCidade());
            pstm.setString(2, destino.getPais());
            pstm.setDouble(3, destino.getValor());
            pstm.setString(4, cidade_atualizacao);

            pstm.executeUpdate();
            System.out.println("Destino atualizado com sucesso!");

        }catch (Exception ex) {
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

    public void removerDestino()throws SQLException{
        Scanner input = new Scanner(System.in);
        String sql = "DELETE FROM DESTINOs WHERE cidade = ?";

        System.out.println("Qual o nome da cidade? ");
        String cidade_exclusao = input.next().toUpperCase();

        try {
            conexao=Conexao.criarConexao();
            pstm=conexao.prepareStatement(sql);

            pstm.setString(1, cidade_exclusao);

            int linhasAfetadas = pstm.executeUpdate();

            if(linhasAfetadas>0){
                System.out.println("Destino excluído com sucesso!");
            }else{
                System.out.println("Nenhum destino foi encontrado!");
            }

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

    public void mostrarDestinos()throws SQLException{

        String sql = "SELECT * FROM DESTINOS";

        try {
            conexao=Conexao.criarConexao();
            pstm=conexao.prepareStatement(sql);
            ResultSet r = pstm.executeQuery();
            while(r.next()){
                Destinos destino = new Destinos();
                destino.setCidade(r.getString("cidade"));
                destino.setPais(r.getString("pais"));
                destino.setValor(r.getDouble("valor"));

                System.out.printf("%s - %s R$ %.2f\n\n",destino.getCidade(),destino.getPais(),destino.getValor());
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
