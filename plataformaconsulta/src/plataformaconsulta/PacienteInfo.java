package plataformaconsulta;

public class PacienteInfo {

	
	private String nome;
	private int idade;
	private String rg;
	private String cpf;
	private String Planosaude;
	private String celular;
	
	public PacienteInfo (String nome, int idade, String rg,String cpf, String planosaude, String celular) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.Planosaude = planosaude;
		this.celular = celular;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPlanosaude() {
		return Planosaude;
	}

	public void setPlanosaude(String planosaude) {
		Planosaude = planosaude;
	}
	
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
public void validarCpf() {
		
		if(getcpf().length() != 11) {
			System.out.println("\n--CPF Inválido!!!");
		}else {
			System.out.println("\n--CPF Válido!!!");
		}
        }

		public void validarRg() {
			
		if(getRg().length() != 9) {
			System.out.println("\n--Identidade Inválida!!!");
		}else {
			System.out.println("\n--Identidade Válida!!!");
		}
	}
}
