package CalculadoraDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CalculadoraDao {

	private static final String KEY_SQL_SELECT = "SELECT * FROM permissao";

	public static void select(String arg) {
		
		try (Connection conn = (Connection) DbConnect.getConexaoMySQL();) {
    		ResultSet rsConsulta = conn.createStatement().executeQuery(KEY_SQL_SELECT);
    		while (rsConsulta.next()) {
    			System.out.println(rsConsulta.getString(arg));
    		}
		} catch (Exception e) {
			System.out.println("Erro ao executar consulta");
		}
    	
	}
	
	public static void main(String[] args) throws SQLException {
//	select("id");
//	select("descricao");
		Connection conn = (Connection) DbConnect.getConexaoMySQL();
		PreparedStatement stmt = (PreparedStatement) conn.prepareStatement("DROP DATABASE teste;");
		
	}
	
}
