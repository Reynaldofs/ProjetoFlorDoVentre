package plataformaconsulta;

public class ConsultaInfo extends PacienteInfo{

	private int data;
	private String mes;
	private String especialidade;

	

	public ConsultaInfo(String nome, int idade, String rg, String cpf, String planosaude, String celular, int data,
			String mes, String especialidade) {
		super(nome, idade, rg, cpf, planosaude, celular);
		this.data = data;
		this.mes = mes;
		this.especialidade = especialidade;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public void imprimir() {
		System.out.println(getNome()+"\n"+"idade: "+getIdade()+" anos"+"\n"+"Identidade: "+getRg()+"\n"+"CPF: "+getcpf()+"\n"+"Telefone para contato: "+getCelular()+"\n"+"vai dar entrada na clínica como Plano de Saúde ou Particular: "+getPlanosaude());
		System.out.println("Você agendou para data: "+data+" de "+mes+"\n consulta com "+especialidade);
	
	
	}
}
