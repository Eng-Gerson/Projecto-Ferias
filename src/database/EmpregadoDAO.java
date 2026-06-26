package database;
import exception.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Empregado;

public class EmpregadoDAO {
	public void add(Empregado emp)throws Exception{
		String sql = "INSERT INTO empregado(nome,apelido,salario,dataNascimento,codDepartamento) VALUES (?,?,?,?,?) ";
		try(Connection conn = DataBase.getConnection();PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, emp.getNome());
			stmt.setString(2, emp.getApelido());
			stmt.setDouble(3, emp.getSalario());
			stmt.setDate(4, emp.getDataNascimento());
			stmt.setInt(5, emp.getDepartamento().getCodDepartamento());
			IO.println("Empregado inserido com sucesso!");
		}catch(SQLException s){
			throw new DbException(s.getMessage());
		}
		
	}
}
