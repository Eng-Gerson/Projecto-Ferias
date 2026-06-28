package Menu;
import database.EmpregadoDAO;
import input.Input;
import java.sql.Date;
import model.*;
public class MenuEmpregado {
	private static final EmpregadoDAO emp = new EmpregadoDAO();
	private static Input io = new Input();
	private static int op;
	public static void exibir()throws Exception {
		op = io.enterInt("----- Empregado ----- \n1-Adicionar \n2-Remover \n3-Listar");
		switch(op){
			case 1: Inserir();break;
			case 2: Remover();break;
			case 3: Listar();break;
			default: IO.print("Está Nice");break;
		}
	}

	private static void Remover() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	private static void Inserir()throws Exception{
		String nome = io.enterString("Insira o 1º nome");
		String apelido = io.enterString("Insira o apelido");
		Double salario = io.enterDouble("Insira o salário");
		String dt = io.enterString("Insira a data de Nascimento  \"aaaa-mm-dd\"");
		Date data =  Date.valueOf(dt);
		Departamento dep = new Departamento(1,"TI");
		emp.add(new Empregado(nome,apelido,salario,data,dep));
		
	}

	private static void Listar() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
	
}
