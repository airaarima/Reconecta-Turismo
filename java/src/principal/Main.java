package principal;
import java.sql.SQLException;
import java.util.Scanner;

import principalDAO.DestinosDAO;
import principalDAO.FaleConoscoDAO;
import principalDAO.PassagensDAO;
import principalDAO.UsuariosDAO;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        DestinosDAO destinosDAO = new DestinosDAO();
        PassagensDAO passagensDAO = new PassagensDAO();
        FaleConoscoDAO faleConoscoDAO = new FaleConoscoDAO();

        System.out.println("========== Bem vindo a REConecta Turismo ==========\n========== Ficamos felizes com sua presença! ==========");
        do {
            System.out.println("Escolha uma opção:\n1. Criar usuário\n2. Atualizar usuário\n3. Excluir usuário\n4. Mostrar usuários\n5. Adicionar destino\n6. Atualizar destino\n7. Remover destino\n8. Mostrar destinos\n9. Comprar passagem\n10. Mostrar passagens\n11. Enviar mensagem para a Reconecta Turismo\n12. Sair");
            opcao = input.nextInt();
            input.nextLine();
            
            switch (opcao) {
                case 1:
                    usuariosDAO.criarUsuario();
                    break;

                case 2:
                    usuariosDAO.atualizarUsuario();
                    break;

                case 3:
                    usuariosDAO.excluirUsuario();
                    break;

                case 4:
                    usuariosDAO.mostrarUsuarios();
                    break;

                case 5:
                    destinosDAO.adicionarDestino();
                    break;

                case 6:
                    destinosDAO.atualizarDestino();
                    break;

                case 7:
                    destinosDAO.removerDestino();
                    break;

                case 8:
                    destinosDAO.mostrarDestinos();
                    break;

                case 9:
                    passagensDAO.comprarPassagem();
                    break;

                case 10:
                    passagensDAO.mostrarPassagens();
                    break;

                case 11:
                    faleConoscoDAO.enviarMensagem();
                    break;
            
                case 12:
                    System.out.println("Até breve!");
                    break;
            }
        } while (opcao!=12);
        input.close();
    }
}
