package principalDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import principal.Conexao;
import principal.FaleConosco;

public class FaleConoscoDAO {
    private Connection conexao = null;
    private PreparedStatement pstm = null;

    public void enviarMensagem()throws SQLException{
        Scanner input = new Scanner(System.in);
        String sql = "INSERT INTO fale_conosco (nome_completo, CPF, email, assunto_contato, mensagem) VALUES (?, ?, ?, ?, ?)";

        System.out.println("Qual seu nome completo? ");
        String nomeCompleto = input.nextLine().toUpperCase();
        System.out.println("CPF: ");
        String CPF = input.nextLine().toUpperCase();
        System.out.println("E-mail: ");
        String email = input.nextLine();
        System.out.println("Assunto: ");
        String assunto = input.nextLine();
        System.out.println("Qual a mensagem que deseja nos enviar? ");
        String mensagem = input.nextLine();

        FaleConosco faleConosco = new FaleConosco(nomeCompleto, CPF, email, assunto, mensagem);

        try {
            conexao=Conexao.criarConexao();
            pstm=conexao.prepareStatement(sql);

            pstm.setString(1, faleConosco.getNome());
            pstm.setString(2, faleConosco.getCPF());
            pstm.setString(3, faleConosco.getEmail());
            pstm.setString(4, faleConosco.getAssunto());
            pstm.setString(5, faleConosco.getMensagem());

            pstm.execute();
            System.out.println("Mensagem enviada com sucesso! Aguarde nosso contato através do e-mail informado.");

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
