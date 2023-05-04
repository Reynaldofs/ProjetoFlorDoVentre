package plataformaconsulta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import cores.Cores;

public class Plataforma_ConsultaAtualizada {

	public static void main(String[] args) {
		
				Scanner leia = new Scanner(System.in);

				String nome, cpf, rg, Planosaude = null, especialidade = null, mes;
				int idade, x = 0, op, esp, data;
				String celular;

				ConsultaInfo[] lista = new ConsultaInfo[31];

				do {
					System.out.println(Cores.TEXT_RED_BRIGHT + Cores.ANSI_WHITE_BACKGROUND);
					System.out.println(" |*****************************************************|  ");
					System.out.println(" |                Clinica Flor Do Ventre               |  ");
					System.out.println(" |*****************************************************|  ");
					System.out.println(" |                       Menu                          |  ");
					System.out.println(" |                                                     |  ");
					System.out.println(" |               1-Marcar consulta                     |  ");
					System.out.println(" |               2-Desmarcar consulta                  |  ");
					System.out.println(" |               3-Ver especialidades da Clínica       |  ");
					System.out.println(" |               4-Rever Dados Da Consulta             |  ");
					System.out.println(" |               0-Sair                                |  ");
					System.out.println(" |                                                     |  ");
					System.out.println("  *****************************************************   ");
					System.out.println("Digite sua opção:  ");     

					try {	
						op = leia.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("\nDigite Opcão Disponivel !!");
						leia.nextInt();
						op =0;
						
					}	
					
					if (op == 9) {
						System.out.println("\nClinica Flor Do Ventre  !");
						leia.close();
						System.exit(0);
					}
					
				//fiz a validação do cpf e rg como ensinou na ultima aula por numero de caracteres mas não funcionou e não sei porque haha
					switch (op) {
					case 1:
						leia.nextLine();
						System.out.println("\nInsira seu nome: ");
						nome = leia.nextLine();
						System.out.println("\nInsira sua idade: ");
						idade = leia.nextInt();
						rg = leia.nextLine();
						System.out.println("\nInsira sua identidade: ");
						rg = leia.nextLine();
						System.out.println("\nInsira seu CPF: ");
						cpf = leia.nextLine();
						System.out.println("\nVai dar entrada com o Plano de Saúde ou Particular?");
						Planosaude = leia.nextLine();	
				    	System.out.println("\nSe Particular o valor da consulta há de ser vista no dia pessoalmente ");
						System.out.println("\n\nInsira um telefone para contato: +55 11 ");
						celular = leia.nextLine();

						System.out.println("\n*****************************************************\n");

						do {
							System.out.println("\n");
							System.out.println("\nDigite qual especialidade está buscando na clínica: ");
							System.out.println("\nDigite 1 para = Ginecologista, Profissional Ana Vitória Alves");
							System.out.println("\nDigite 2 para= Ginecologista Obstetra, Profissional  Laura Rossi Macena");
							System.out.println("\nDigite 3 para= Fisioterapeuta, Profissional Jorge Mendes Gonçalves");
							System.out.println("\nDigite 4 para= Psicologo, Profisional Marcela Oliveira Ramos");
							System.out.println("\nDigite 5 para= Nutricionista, Profissional Juliana Vitoria Meireles");
							System.out.println("\nDigite 6 para= Consultora de Amamentação, Profissional Jandira Rodrigues Carvalho");
							esp = leia.nextInt();

							switch (esp) {
							case 1:
								especialidade = "Ginecologista, Profissional Ana Vitória Alves";
								break;

							case 2:
								especialidade = "Ginecologista Obstetra, Profissional  Laura Rossi Macena";
								break;

							case 3:
								especialidade = "Fisioterapeuta, Profissional Jorge Mendes Gonçalves";
								break;

							case 4:
								especialidade = "Psicólogo, Profissional Marcela Oliveira Ramos";
								break;

							case 5:
								especialidade = "Nutricionista, Profissional Juliana Vitoria Meireles";
								break;

							case 6:
								especialidade = "Consultoria de Amamentação, Profissional Jandira Rodrigues Carvalho";
								break;

							default:
								System.out.println("Opção inválida!!!");
								break;
							}
						} while (esp <1 || esp>6);

						mes = leia.nextLine();
						System.out.println("\nEscreva o nome do mês que busca atendimento: ");
						mes = leia.nextLine();
						System.out.println("\nColoque o dia que busca atendimento: ");
						data = leia.nextInt();
						
						lista[x] = new ConsultaInfo (nome,idade,rg,cpf,Planosaude,celular,data,mes,especialidade);
						
						
						System.out.println("\n*****************************************************\n");
						System.out.println("\nSua consulta foi agendada com sucesso!! ");
						System.out.println("\nAtendimento por ordem de Chegada");
						System.out.println("\n");
						
						
						lista[x].imprimir();
						
						System.out.println("\nSeu código de consulta é: "+x);
						if (x==30) {
							System.out.println("\nAgenda lotada!");
							break;
						}
						
						x = x+1;
						keyPress();
						break;
					
						//como posso confirmar que realmente o valor foi retirado do vetor?
					case 2:
						leia.nextLine();
						System.out.println("\nPara desmarcar consulta por favor informe seu código de consulta: ");
						x =leia.nextInt();
						if (lista[x] != null) {
							lista[x] =null;
							System.out.println("\nConsulta desmarcada com sucesso!!");
						}else
						lista[x] = null;
						System.out.println("\nConsulta não encontrada, tente com um código válido!");
						
						
						keyPress();
						break;
						
					case 3:
						System.out.println("\nNOSSAS ESPECIALIDADES: "
								+ "\nGinecologia "
								+ "\nGinecologia Obstetra "
								+ "\nFisioterapia"
								+ "\nPsicologia"
								+ "\nNutricionista"
								+ "\nConsultoria de Amamentação");
						keyPress();
						break;
						
					case 4:
						leia.nextLine();
						System.out.println("Insira o código da consulta");
						x =leia.nextInt();
						if(lista[x] != null) {
						lista[x].imprimir();
						
						}else{
							System.out.println("Este código de consulta é inválido");
						}
						keyPress();
						break;
						
						//o case 0 está dando erro não sei porque 
						case 0: 
						 System.out.println("Obrigada por procurar Clínica Flor do Ventre, Volte sempre :)");
							
						break;
						
						//o default está dando erro mas imagino que seja pelo erro de cima do case 0
						default:
						System.out.println("Opção Inválida! Tente novamente... \n");
						keyPress();
						break;
						
					//o laço de repetição não está se cumprindo e quando termino de marcar consulta por exemplo não retorna ao menu 	
				} 

			} while (op != 0);
}
public static void keyPress() {

	try {

		System.out.println("\n\nPressione Enter para Continuar...");
		System.in.read();

	} catch (IOException e) {

		System.out.println("Você pressionou uma tecla diferente de enter!");
	}
}

}

