package principalDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import principal.Conexao;
import principal.Usuarios;

public class UsuariosDAO {
    private Connection conexao = null;
    private PreparedStatement pstm = null;
    
    public void adicionarUsuario()throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nome completo: ");
        String nome = input.nextLine();

        System.out.println("Digite seu CPF (somente números): ");
        String CPF = input.nextLine();

        System.out.println("Digite seu RG (somente números): ");
        String RG = input.nextLine();

        System.out.println("Data de nascimento (AAAA-MM-DD): ");
        String dataNascimentoString = input.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString);

        System.out.println("E-mail: ");
        String email = input.nextLine();

        System.out.println("Informações de endereço");
        System.out.println("Rua: ");
        String rua = input.nextLine();
        System.out.println("Número: ");
        String numero = input.nextLine();
        System.out.println("Bairro: ");
        String bairro = input.nextLine();
        System.out.println("Cidade: ");
        String cidade = input.nextLine();
        System.out.println("UF: ");
        String uf = input.nextLine();

        Usuarios usuario1 = new Usuarios(nome, CPF, RG, dataNascimento, email, rua, numero, bairro, cidade, uf);
        
        String sql = "INSERT INTO USUARIOS (nome_completo, CPF, RG, data_nascimento, email, senha, rua, numero, bairro, cidade, UF) VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            conexao=Conexao.criarConexao();
            pstm=conexao.prepareStatement(sql);

            pstm.setString(1, usuario1.getNome());
            pstm.setString(2, usuario1.getCPF());
            pstm.setString(3, usuario1.getRG());
            pstm.setObject(4, usuario1.getDataNascimento());
            pstm.setString(5, usuario1.getEmail());
            pstm.setString(6, usuario1.getRua());
            pstm.setString(7, usuario1.getNumero());
            pstm.setString(8, usuario1.getBairro());
            pstm.setString(9, usuario1.getCidade());
            pstm.setString(10, usuario1.getUF());

            pstm.executeUpdate();
            System.out.println("Usuário criado com sucesso!");
            System.out.println("Nome: "+ usuario1.getNome() + " - CPF:" + usuario1.getCPF());

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

    public void excluirUsuario()throws SQLException{
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o CPF do usuario que você deseja excluir");
        String CPF_exclusao = input.nextLine();

        String sql = "DELETE FROM USUARIOS WHERE CPF = ?";

        try {
            conexao=Conexao.criarConexao();
            pstm=conexao.prepareStatement(sql);

            pstm.setString(1, CPF_exclusao);

            int linhasAfetadas = pstm.executeUpdate();

            if(linhasAfetadas>0){
                System.out.println("Usuário excluído com sucesso!");
            }else{
                System.out.println("Nenhum usuário, com este CPF, foi encontrado!");
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

    public void atualizarUsuario()throws SQLException{
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o CPF do usuário que você deseja atualizar?");
        String CPF_atualizacao = input.nextLine();

        System.out.println("========== Atualização de dados ==========");
        System.out.println("Nome completo: ");
        String nome = input.nextLine();

        System.out.println("Digite seu CPF (somente números): ");
        String CPF = input.nextLine();

        System.out.println("Digite seu RG (somente números): ");
        String RG = input.nextLine();

        System.out.println("Data de nascimento (AAAA-MM-DD): ");
        String dataNascimentoString = input.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString);

        System.out.println("E-mail: ");
        String email = input.nextLine();

        System.out.println("Informações de endereço");
        System.out.println("Rua: ");
        String rua = input.nextLine();
        System.out.println("Número: ");
        String numero = input.nextLine();
        System.out.println("Bairro: ");
        String bairro = input.nextLine();
        System.out.println("Cidade: ");
        String cidade = input.nextLine();
        System.out.println("UF: ");
        String uf = input.nextLine();

        Usuarios usuario1 = new Usuarios(nome, CPF, RG, dataNascimento, email, rua, numero, bairro, cidade, uf);

        String sql = "UPDATE USUARIOS SET nome_completo = ?, CPF = ?, RG = ?, data_nascimento = ?, email = ?, rua = ?, numero = ?, bairro = ?, cidade = ?, UF = ? WHERE CPF = ?";

        try {
            conexao=Conexao.criarConexao();
            pstm=conexao.prepareStatement(sql);

            pstm.setString(1, usuario1.getNome());
            pstm.setString(2, usuario1.getCPF());
            pstm.setString(3, usuario1.getRG());
            pstm.setObject(4, usuario1.getDataNascimento());
            pstm.setString(5, usuario1.getEmail());
            pstm.setString(6, usuario1.getRua());
            pstm.setString(7, usuario1.getNumero());
            pstm.setString(8, usuario1.getBairro());
            pstm.setString(9, usuario1.getCidade());
            pstm.setString(10, usuario1.getUF());
            pstm.setString(11, CPF_atualizacao);

            pstm.executeUpdate();
            System.out.println("Usuário atualizado com sucesso!");   

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

    public void mostrarUsuarios()throws SQLException{

        String sql = "SELECT * FROM USUARIOS";

        try {
            conexao=Conexao.criarConexao();
            pstm=conexao.prepareStatement(sql);
 

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
