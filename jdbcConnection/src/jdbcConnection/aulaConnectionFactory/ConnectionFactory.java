package jdbcConnection.aulaConnectionFactory;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionFactory {

	public Connection conectar() {
		
		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "TM_Vitor_Romao", "150306");
		} catch (SQLException e) { 
			System.out.println("Erro de conexão.");
			throw new RuntimeException(e); 
		}
	}

	
}
