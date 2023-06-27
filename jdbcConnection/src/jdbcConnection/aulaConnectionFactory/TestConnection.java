package jdbcConnection.aulaConnectionFactory;

public class TestConnection {

	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();
		Usuario vitor = new Usuario(1, "Vitor", "ABC123");
		
		dao.insert(vitor);
		
	}

}
