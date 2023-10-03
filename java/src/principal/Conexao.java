package principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/reconectaturismo";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection criarConexao() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
