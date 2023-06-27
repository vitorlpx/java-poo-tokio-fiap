package jdbcConnection.aulaConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAO {

	//Pertecente a classe USUARIODAO.
	private Connection conexao;

	//Conexão para essa entidade.
	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	//-----------Operações de CRUD:-----------//
	
	//--Insert--
	//void pq ele não retorna nada.
	public void insert(Usuario usuario) {
		String sql = "insert into usuario (id, nome , senha, dataCadastro) values (?, ?, ?, ?)";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, usuario.getId());
			stmt.setString(2, usuario.getNome());
			stmt.setString(3, usuario.getSenha());
			stmt.setDate(4, usuario.getDataCadastro());
			stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//selectAll
	public List<Usuario> selectAll() {
		
		return null;
		
	}
	
	//selectById
	public Usuario selectById(long id) {
		
		return null;
		
	}
	
	//update
	public void update(Usuario usuario) {
		
	}
	
	//delete
	public void delete(long id) {
/*		String sql = "delete from usuario where id = 1";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.getDe
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		*/
	} 
	
}
