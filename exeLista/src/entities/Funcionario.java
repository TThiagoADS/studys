package entities;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;
	public static Double tax;
	
	
	
	public Funcionario() {

		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}	
	
	public double aumento(int salario, double tax) {
		return salario * tax;
		
	}
	
	
}
