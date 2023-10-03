package principal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import principalDAO.UsuariosDAO;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("========== Bem vindo a REConecta Turismo ==========\n\"========== Ficamos felizes com sua presença! ==========");
        
        UsuariosDAO usuarioDAO = new UsuariosDAO();
        //usuarioDAO.adicionarUsuario();
        //usuarioDAO.excluirUsuario();
        usuarioDAO.atualizarUsuario();


    }
}
