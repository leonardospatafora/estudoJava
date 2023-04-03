package CalculadoraDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnect {
	private static final String KEY_SQL_SELECT = "SELECT * FROM permissao";
    public static String status = "Não conectou...";
    public DbConnect() {
    }

    public static java.sql.Connection getConexaoMySQL() {
        Connection connection = null;          //atributo do tipo Connection
        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);

            String serverName = "localhost";    //caminho do servidor do BD
            String mydatabase = "calculadora";        //nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";        //nome de um usuário de seu BD      
            String password = "root";      //sua senha de acesso

            connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return connection;
        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }

    }


    public static String statusConection() {
        return status;
    }

    public static boolean FecharConexao() {
        try {
            DbConnect.getConexaoMySQL().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }


    public static java.sql.Connection ReiniciarConexao() {
        FecharConexao();
        return DbConnect.getConexaoMySQL();
    }
    
//    public static void main(String[] args) {
//    	
//    	try (Connection conn = DbConnect.getConexaoMySQL();) {
//    		ResultSet rsConsulta = conn.createStatement().executeQuery(KEY_SQL_SELECT);
//    		while (rsConsulta.next()) {
//    			System.out.println(rsConsulta.getString("descricao"));
//    		}
//		} catch (Exception e) {
//			System.out.println("Erro ao executar consulta");
//		}
//    	
//	}
}