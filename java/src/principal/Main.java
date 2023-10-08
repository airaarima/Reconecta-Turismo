package principal;
import java.sql.SQLException;
import java.util.Scanner;

import principalDAO.DestinosDAO;
import principalDAO.PassagensDAO;
import principalDAO.UsuariosDAO;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("========== Bem vindo a REConecta Turismo ==========\n\"========== Ficamos felizes com sua presença! ==========");
        
        UsuariosDAO usuarioDAO = new UsuariosDAO();
        DestinosDAO destinoDAO = new DestinosDAO();
        PassagensDAO passagemDAO = new PassagensDAO();
        //usuarioDAO.adicionarUsuario();
        //usuarioDAO.excluirUsuario();
        // usuarioDAO.atualizarUsuario();
        // usuarioDAO.mostrarUsuarios();
        // destinoDAO.adicionarDestino();
        // destinoDAO.atualizarDestino();
        // destinoDAO.removerDestino();
        // destinoDAO.mostrarDestinos();
        // passagemDAO.comprarPassagem();
        passagemDAO.consultarPassagem();
        input.close();
    }
}
