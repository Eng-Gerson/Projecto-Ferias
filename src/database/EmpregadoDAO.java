package database;
import exception.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Empregado;

public class EmpregadoDAO {
	public void add(Empregado emp)throws Exception{
		String sql = "INSERT INTO empregado(nome,apelido,salario,dataNascimento,codDepartamento) VALUES (?,?,?,?,?) ";
		try(Connection conn = DataBase.getConnection();PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, emp.getNome());
			stmt.setString(2, emp.getApelido());
			stmt.setDouble(3, emp.getSalario());
			stmt.setDate(4, emp.getDataNascimento());
			stmt.setInt(5, 1/*emp.getDepartamento().getCodDepartamento()*/);
			stmt.executeUpdate();
			IO.println("Empregado inserido com sucesso!");
		}catch(SQLException s){
			throw new DbException(s.getMessage());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public ArrayList<Empregado> listar(){
		ArrayList<Empregado> lista = new ArrayList<>();
		String sql = "select * from empregado";
		try(Connection conn = DataBase.getConnection();PreparedStatement stmt = conn.prepareStatement(sql);ResultSet rs = stmt.executeQuery()){
			
		}catch(SQLException e){
			
		}
		return lista;
	}
}
