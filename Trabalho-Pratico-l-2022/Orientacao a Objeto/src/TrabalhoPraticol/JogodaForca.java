//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Universidade de Brasília - UnB;
// Aluna: Mayara Alves de Oliveira;
// Matricula: 200025058

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
package TrabalhoPraticol;

import java.util.Scanner; //Bibliotecas
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Random;

	public class JogodaForca {
// ------------------------------------------------------------------------------------------------------------------------------------------------		
//                                            DEFININDO 
		public static String TemaPalavra[][]= new String[51][51];
		public static Random sorteio = new Random();
		public static Scanner scanner = new Scanner(System.in);
		public static ArrayList<String> lista = new ArrayList<>();

		public static void printBoard(ArrayList<String>lista, int vidas) {
			for(String x: lista) {
				System.out.print(x);
			}

			System.out.println(" "+ vidas + " vidas restantes");

		}


		public static boolean checarGanhador(ArrayList<String>lista, String palavra, int vidas) {

			String ganhador = "";

			for(String x: lista) {
				ganhador += x;			
			}


			if(ganhador.equals(palavra)) {
				System.out.println("VOCÊ VENCEU!!!!!");
				
				return false;
			}else if(vidas==0) {
				System.out.println("Sem vidas restantes...");
				System.out.println("FIM DE JOGO!");
				return false;
			}

			return true;
		}

		public static void main(String[] args) {

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			//                                           CRIANDO AS VARIAVÉIS 
			int Opcoes = 0;
			int OpcoesGerenciarTemas = 0;
			int GerenciarTemas = 0;
			int ExcluirTema = 0;
			int GerenciarBancodeTema = 0;
			int GerenciarPalavras = 0;
			int ExcluirPalavra = 0;
			int GerenciarBancoDadosPalavras = 0;
			int CadastrarTema = 0;
			int BancoDadosTema = 0;
			int CadastrarPalavra = 0;
			int OpcoesGerenciarPalavras = 0;
			int Sair = 0;
			int SairGerenciarTema = 0;
			int SairGerenciarPalavra =0;
			String NovoTema;
			String NovaPalavra;
			String ExcluirTemas;
			String DadoTema;
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			//                                          CRIANDO VETOR DE DUAS DIMENSÃO E CARREGANDO BANCO DE DADOS			

			// CADASTRANDO TEMAS 
				TemaPalavra[0][0] = "1. CORES";
				TemaPalavra[1][0] = "2. ANIMAIS";
				TemaPalavra[2][0] = "3. OBJETO";
				TemaPalavra[3][0] = "4. PROFISSÕES";
				TemaPalavra[4][0] = "5. ROUPAS E ACESSÓRIOS";
				TemaPalavra[5][0] = "6. MESES DO ANO";
				TemaPalavra[6][0] = "7. CARROS";
				TemaPalavra[7][0] = "8. PAÍSES DA AMERICA DO SUL";
				TemaPalavra[8][0] = "9. ESTADOS BRASILEIROS";
				TemaPalavra[9][0] = "10.TIMES DO BRASILEIRÃO";
			// CADASTRANDO PALAVRAS
		//   TEMA 1
				TemaPalavra[0][1] = "AMARELO";
				TemaPalavra[0][2] = "AZUL";
				TemaPalavra[0][3] = "VERMELHO";
				TemaPalavra[0][4] = "PRETO";
				TemaPalavra[0][5] = "CINZA";
				TemaPalavra[0][6] = "BRANCO";
				TemaPalavra[0][7] = "ROSA";
				TemaPalavra[0][8] = "ROXO";
				TemaPalavra[0][9] = "VERDE";
				TemaPalavra[0][10] = "GRAFITE";
				
		//   TEMA 2 
				TemaPalavra[1][1] = "ELEFANTE";
				TemaPalavra[1][2] = "CACHORRO";
				TemaPalavra[1][3] = "GATO";
				TemaPalavra[1][4] = "PASSARO";
				TemaPalavra[1][5] = "PEIXE";
				TemaPalavra[1][6] = "URSO";
				TemaPalavra[1][7] = "HIPOPOTAMO";
				TemaPalavra[1][8] = "GARFANHOTO";
				TemaPalavra[1][9] = "HAMSTER";
				TemaPalavra[1][10] = "PORCO";
				
		//   TEMA 3
				TemaPalavra[2][1] = "TESOURA";
				TemaPalavra[2][2] = "LAPIS";
				TemaPalavra[2][3] = "GAIOLA";
				TemaPalavra[2][4] = "COLHER";
				TemaPalavra[2][5] = "PANELA";
				TemaPalavra[2][6] = "TELEVISÃO";
				TemaPalavra[2][7] = "CANETA";
				TemaPalavra[2][8] = "CELULAR";
				TemaPalavra[2][9] = "GELADEIRA";
				TemaPalavra[2][10] = "TECLADO";
				
		// TEMA 4

				TemaPalavra[3][1] = "DENTISTA";
				TemaPalavra[3][2] = "MEDICO";
				TemaPalavra[3][3] = "PADEIRO";
				TemaPalavra[3][4] = "COZINHEIRO";
				TemaPalavra[3][5] = "PEDREIRO";
				TemaPalavra[3][6] = "ADVOGADO";
				TemaPalavra[3][7] = "PSICOLOGO";
				TemaPalavra[3][8] = "NUTRICIONISTA";
				TemaPalavra[3][9] = "ARTISTA";
				TemaPalavra[3][10] = "CANTOR";
				
		// TEMA 5
				TemaPalavra[4][1] = "BLUSA";
				TemaPalavra[4][2] = "CASACO";
				TemaPalavra[4][3] = "TENIS";
				TemaPalavra[4][4] = "CINTO";
				TemaPalavra[4][5] = "CALÇA";
				TemaPalavra[4][6] = "SHORT";
				TemaPalavra[4][7] = "REGATA";
				TemaPalavra[4][8] = "JAQUETA";
				TemaPalavra[4][9] = "OCULOS";
				TemaPalavra[4][10] = "RELOGIO";
				
	   // TEMA 6
				TemaPalavra[5][1] = "JANEIRO";
				TemaPalavra[5][2] = "FEVEREIRO";
				TemaPalavra[5][3] = "MARÇO";
				TemaPalavra[5][4] = "ABRIL";
				TemaPalavra[5][5] = "MAIO";
				TemaPalavra[5][6] = "JUNHO";
				TemaPalavra[5][7] = "JULHO";
				TemaPalavra[5][8] = "AGOSTO";
				TemaPalavra[5][9] = "SETEMBRO";
				TemaPalavra[5][10] = "OUTUBRO";
				TemaPalavra[5][11] = "NOVEMBRO";
				TemaPalavra[5][12] = "DEZEMBRO";
				
		// TEMA 7
				TemaPalavra[6][1] = "GOL";
				TemaPalavra[6][2] = "SIENA";
				TemaPalavra[6][3] = "GOLF";
				TemaPalavra[6][4] = "UNO";
				TemaPalavra[6][5] = "MOBI";
				TemaPalavra[6][6] = "BELINA";
				TemaPalavra[6][7] = "HB20";
				TemaPalavra[6][8] = "FERRARI";
				TemaPalavra[6][9] = "CIVIC";
				TemaPalavra[6][10] = "FUSCA";
				
		// TEMA 8
				TemaPalavra[7][1] = "BRASIL";
				TemaPalavra[7][2] = "ARGENTINA";
				TemaPalavra[7][3] = "PARAGUAI";
				TemaPalavra[7][4] = "BOLIVIA";
				TemaPalavra[7][5] = "CHILE";
				TemaPalavra[7][6] = "EQUADOR";
				TemaPalavra[7][7] = "VENEZUELA";
				TemaPalavra[7][8] = "SURINAME";
				TemaPalavra[7][9] = "COLOMBIA";
				TemaPalavra[7][10] = "PERU";
				
		// TEMA 9 
				TemaPalavra[8][1] = "AMAZONAS";
				TemaPalavra[8][2] = "GOIAS";
				TemaPalavra[8][3] = "AMAPA";
				TemaPalavra[8][4] = "TOCANTINS";
				TemaPalavra[8][5] = "CEARA";
				TemaPalavra[8][6] = "PIAUI";
				TemaPalavra[8][7] = "MARANHAO";
				TemaPalavra[8][8] = "SERGIPE";
				TemaPalavra[8][9] = "RORAIMA";
				TemaPalavra[8][10] = "ACRE";
				
		// TEMA 10
				TemaPalavra[9][1] = "AMAZONAS";
				TemaPalavra[9][2] = "GOIAS";
				TemaPalavra[9][3] = "AMAPA";
				TemaPalavra[9][4] = "TOCANTINS";
				TemaPalavra[9][5] = "CEARA";
				TemaPalavra[9][6] = "PIAUI";
				TemaPalavra[9][7] = "MARANHAO";
				TemaPalavra[9][8] = "SERGIPE";
				TemaPalavra[9][9] = "RORAIMA";
				TemaPalavra[9][10] = "ACRE";
				
				

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			//                                            CRIANDO MENU DE OPÇÕES
			System.out.println(" -------------------------------------------------------------------- ");
			System.out.println(" ------------------ WELCOME TO THE HANGMAN GAME---------------------- \n ");
			System.out.println(" Tente descobrir qual é a palavra oculta antes de esgotar todas as suas tentativas.\n A cada hora aparece uma palavra nova de um tema diferente.\n Você é capaz de adivinhar? JOGUE GRÁTIS AGORA!! \n ");
	
			int  MenudeOpcoes;
			Scanner input = new Scanner(System.in);
			System.out.println("Escolha a opção desejada: \n\n1. Gerenciar Temas \n2. Gerenciar Palavras \n3. Iniciar Jogo \n0. Sair");    
			MenudeOpcoes = input.nextInt();
			
//----------------------------------------------------------------------------------------------------------------------------------------------------- --------------------------------------						

				//                                        CRIANDO ESTRUTURA DE DECISÃO
			do {
				switch (MenudeOpcoes) {
				
// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				
				case 1: Opcoes = GerenciarTemas;
				
				//                                         OPÇÃO GERENCIAR TEMAS
				
				System.out.println(" -------------------------------------------------------------------- ");
				System.out.println(" ------------------ GERENCIAR TEMAS ---------------------- \n ");
				int MenuGerenciarTemas;
				System.out.println("Escolha a opção desejada: \n\n1. Cadastrar novo tema \n2. Excluir tema existente \n3. Gerenciar banco de temas \n0. Sair");    
				MenuGerenciarTemas = input.nextInt();
				 	do {
				 		
				 		switch (MenuGerenciarTemas) {
				 		case 1: OpcoesGerenciarTemas = CadastrarTema;
				 		
	//                                                  Opção cadastrar novo tema
				 		Scanner ler1 = new Scanner(System.in);
						System.out.println(" --------------------------------------------------------------------  ");
						System.out.println(" ------------------ CADASTRAR TEMAS ---------------------- \n ");
						System.out.println(" Deseja cadastrar um novo tema? Lembre- se que para cadastrar\n um novo tema e necessário que este tema nao esteja cadastrado.\n\n1.Sim \n2.Não \n ");
						CadastrarTema = ler1.nextInt();
						if(CadastrarTema==1) {
							Scanner tema = new Scanner(System.in);
							System.out.println("Insira o tema a ser cadastrado:"); 
							NovoTema = tema.nextLine();
						} else {
							System.out.println(" --------------------------------------------------------------------  ");
							System.out.println(" ------------------  PROGRAMA ENCERRADO ---------------------- \n ");
						}
				 		continue;
				 		
				 		case 2: OpcoesGerenciarTemas = ExcluirTema;
	//                                                  Opção excluir tema 
				 		
				 		Scanner ler5 = new Scanner(System.in);
						System.out.println(" --------------------------------------------------------------------  ");
						System.out.println(" -------------------------- EXCLUIR TEMA ---------------------------- \n ");
						System.out.println(" Deseja Excluir tema? Lembre-se que para excluir o tema tem que está no\n nosso banco de dados e não ter nenhuma palavra associado a ele.\n\n1.Sim \n2.Não \n ");
						ExcluirTema = ler5.nextInt();
						if(ExcluirTema==1) {
							Scanner temaExcluir = new Scanner(System.in);
							System.out.println("Insira o tema a ser excluído:"); 
							ExcluirTemas = temaExcluir.nextLine();
						} else {
							System.out.println(" --------------------------------------------------------------------  ");
							System.out.println(" ------------------  PROGRAMA ENCERRADO ---------------------- \n ");
				 		}
				 		continue;
				 		
				 		case 3: OpcoesGerenciarTemas = GerenciarBancodeTema;
	//                                                  Opção Gerenciar banco de tema 
				 		
						Scanner ler6 = new Scanner(System.in);
						System.out.println(" --------------------------------------------------------------------------------  ");
						System.out.println(" -------------------------- GERENCIAR BANCO DE DADOS ---------------------------- \n ");
						System.out.println(" Deseja visualizar todos os tema disponivel no banco de dados?\n\n1.Sim \n2.Não \n ");
						BancoDadosTema = ler6.nextInt();
						if(BancoDadosTema==1) {
							Scanner tema = new Scanner(System.in);
							System.out.println("------------------------TEMAS CADASTRADOS------------------------\n\n"); 
							int j=0;
							for(int i=0; i<TemaPalavra.length; i++) {
								 if( (TemaPalavra[i][i]!= null) && !(TemaPalavra[i][i].isEmpty())){   
									 j=j+1;
										System.out.printf(TemaPalavra[i][0]+"\n");
							}
							}
					
							DadoTema = tema.nextLine();
						} else {
							System.out.println(" --------------------------------------------------------------------  ");
							System.out.println(" ------------------  PROGRAMA ENCERRADO ---------------------- \n ");
						}
				 		continue;
				 		case 0: OpcoesGerenciarTemas = SairGerenciarTema;

						//                          Opção sair do gerenciamento de temas
						System.out.println(" --------------------------------------------------------------------  ");
						System.out.println(" ------------------ SAIR ---------------------- \n ");

						Scanner ler2 = new Scanner(System.in);
						System.out.println("Tem certeza que deseja sair do Jogo? \n1. Sim \n2. Não");    
						SairGerenciarTema = ler2.nextInt();
						if(SairGerenciarTema==1) {
							System.out.println("Jogo encerrado\nAté a próxima ");
							OpcoesGerenciarTemas = SairGerenciarTema;
						} else {
							System.out.println(" -------------------------------------------------------------------- ");
							System.out.println(" ------------------ GERENCIAR TEMAS ---------------------- \n ");
							System.out.println("Escolha a opção desejada: \n\n1. Cadastrar novo tema \n2. Excluir tema existente \n3. Gerenciar banco de temas \n0. Sair");     
							MenuGerenciarTemas = input.nextInt();
						}
				 		
				 		continue;
						default:
					//                            opção inválida do gerenciamento de palavras
						System.out.println(" --------------------------------------------------------------------  ");
						System.out.println("----------------------------------- ERRO ---------------------------------- \n");
						System.out.println("Opção não encontrada, por favor recarregue o jogo e insira uma opção válida! ");
				 		}
					}
						while (OpcoesGerenciarTemas!=SairGerenciarTema);
				 				continue;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				case 2: Opcoes = GerenciarPalavras;
				
				//                                          OPÇÃO GERENCIAR PALAVRAS
				System.out.println(" -------------------------------------------------------------------- ");
				System.out.println(" ------------------ GERENCIAR PALAVRAS ---------------------- \n ");
				int MenuGerenciarPalavras;
				System.out.println("Escolha a opção desejada: \n\n1. Cadastrar nova palavra \n2. Excluir palavra existente \n3. Gerenciar banco de palavras \n0. Sair");    
				MenuGerenciarPalavras = input.nextInt();
				do {
			 		switch (MenuGerenciarPalavras) {
			 		case 1: OpcoesGerenciarPalavras = CadastrarPalavra;
			 		
//                                                  opção cadastrar nova Palavra

					Scanner ler4 = new Scanner(System.in);
					System.out.println(" -------------------------------------------------------------------- ");
					System.out.println(" ------------------ CADASTRAR PALAVRAS ---------------------- \n ");
					System.out.println(" deseja cadastrar uma nova palavra? Lembre- se que para cadastrar\n uma nova palavra e necessário que esta palavra não esteja cadastrado.\n\n1.Sim \n2.Não \n ");
					CadastrarPalavra = ler4.nextInt();
					if(CadastrarPalavra==1) {
						Scanner palavra = new Scanner(System.in);
						System.out.println("Insira o tema onde será cadastrado a palavra:\n"); 
						NovoTema = palavra.nextLine();
						System.out.println("Insira a palavra cadastrada:\n"); 
						NovaPalavra = palavra.nextLine();
						
					} else {
						System.out.println(" --------------------------------------------------------------------  ");
						System.out.println(" ------------------  PROGRAMA ENCERRADO ---------------------- \n ");
					}
			 		continue;
			 		case 2: OpcoesGerenciarPalavras = ExcluirPalavra;
			 		
	//                                                 Opção excluir Palavra

			 		Scanner ler5 = new Scanner(System.in);
					System.out.println(" --------------------------------------------------------------------  ");
					System.out.println(" -------------------------- EXCLUIR PALAVRA ---------------------------- \n ");
					System.out.println(" Deseja Excluir palavra? Lembre-se que para excluir o palavra tem que está no\n nosso banco de dados.\n\n1.Sim \n2.Não \n ");
					ExcluirPalavra = ler5.nextInt();
					if(ExcluirPalavra==1) {
						Scanner PalavraExcluir = new Scanner(System.in);
						System.out.println("Insira a palavra a ser excluído:"); 
						ExcluirTemas = PalavraExcluir.nextLine();
					} else {
						System.out.println(" --------------------------------------------------------------------  ");
						System.out.println(" ------------------  PROGRAMA ENCERRADO ---------------------- \n ");
			 		}
			 		continue;
			 		case 3: OpcoesGerenciarPalavras = GerenciarBancoDadosPalavras;
	//                                                 Opção gerenciar Banco de dados palavras
			 		
						Scanner ler6 = new Scanner(System.in);
					System.out.println(" --------------------------------------------------------------------------------  ");
					System.out.println(" -------------------------- GERENCIAR BANCO DE DADOS PALAVRAS ---------------------------- \n ");
					System.out.println(" Deseja visualizar todas as palavras disponivel no banco de dados?\n\n1.Sim \n2.Não \n ");

					GerenciarBancoDadosPalavras = ler6.nextInt();
					if(GerenciarBancoDadosPalavras==1) {
						Scanner palavra = new Scanner(System.in);
						
						System.out.println("------------------------PALAVRAS CADASTRADAS------------------------\n\n"); 
								 Scanner ler7 = new Scanner(System.in);
								 System.out.printf("TEMAS DISPONIVEIS\n"
								 		+ "1. CORES\r\n"
								 		+ "2. ANIMAIS\r\n"
								 		+ "3. OBJETO\r\n"
								 		+ "4. PROFISSÕES\r\n"
								 		+ "5. ROUPAS E ACESSÓRIOS\r\n"
								 		+ "6. MESES DO ANO\r\n"
								 		+ "7. CARROS\r\n"
								 		+ "8. PAÍSES DA AMERICA DO SUL\r\n"
								 		+ "9. ESTADOS BRASILEIROS\r\n"
								 		+ "10.TIMES DO BRASILEIRÃO\r\n");
								 
								 System.out.printf("\n\nSELECIONE O NUMERO DO TEMA PARA ACESSAR O CONJUNTO DE PALAVRAS RELACIONADOS AO TEMA\n");
								 int NumeroTema = ler7.nextInt();
								 int j=0;
									for(int i=0; i<TemaPalavra.length; i++) {
									 if( (TemaPalavra[NumeroTema-1][i]!= null) && !(TemaPalavra[NumeroTema-1][i].isEmpty())){ 
										 j=j+1;
							 System.out.printf(TemaPalavra[NumeroTema-1][i]+"\n");
								
							 }	 
					}
						
						DadoTema = palavra.nextLine();
						
					} else {
						System.out.println(" --------------------------------------------------------------------  ");
						System.out.println(" ------------------  PROGRAMA ENCERRADO ---------------------- \n ");
			 		}
			 		continue;
			 		
			 		case 0: OpcoesGerenciarPalavras = SairGerenciarPalavra;

					//                          Opção sair do gerenciamento de palavras

					System.out.println(" -------------------------------------------------------------------- ");
					System.out.println(" ------------------ SAIR ---------------------- \n ");

					Scanner ler3 = new Scanner(System.in);
					System.out.println("Tem certeza que deseja sair do Jogo? \n1. Sim \n2. Não");    
					SairGerenciarPalavra = ler3.nextInt();
					if(SairGerenciarPalavra==1) {
						System.out.println(" ------------------------------------------- \n ");
						System.out.println("Jogo encerrado\nAté a próxima ");
						OpcoesGerenciarPalavras = SairGerenciarPalavra;
					} else {
						System.out.println(" -------------------------------------------------------------------- ");
						System.out.println(" ------------------ GERENCIAR PALAVRAS ---------------------- \n ");
						System.out.println("Escolha a opção desejada: \n\n1. Cadastrar nova palavra \n2. Excluir palavra existente \n3. Gerenciar banco de palavras \n0. Sair");    
						MenuGerenciarPalavras = input.nextInt();
					}
			 		
			 		continue;
					default:
				//                            opção inválida do gerenciamento de palavras
					System.out.println(" --------------------------------------------------------------------  ");
					System.out.println("----------------------------------- ERRO ---------------------------------- \n");
					System.out.println("Opção não encontrada, por favor recarregue o jogo e insira uma opção válida! ");
			 		}
				}
					while (OpcoesGerenciarPalavras!=SairGerenciarPalavra);
					continue;
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				case 3: Opcoes = 2;
				
				//                                          OPÇÃO INICIAR JOGO
				
						while(true) {
							String palavra = "";
							lista.clear();

							int vidas = 5;

							System.out.println(" -------------------------------------------------------------------- ");
							System.out.println(" ------------------ WELCOME TO THE HANGMAN GAME---------------------- \n ");
							System.out.println("Digite Play para um novo jogo");
							System.out.println("Digite Quit para sair");
							String menu = scanner.nextLine();

							if(menu.equals("Quit")) {
								System.out.println("");
								break;
							}else if(menu.equals("Play")) {

								int index = sorteio.nextInt(TemaPalavra.length);
								palavra += TemaPalavra[index][index];

								for(int i = 0; i<palavra.length(); i++) {
									lista.add(" _");
								}

								printBoard(lista, vidas);



								while(checarGanhador(lista, palavra, vidas)) {
									System.out.println("Coloque uma letra : (A-Z)");

									String resposta = scanner.nextLine();

									if(!Pattern.matches("[A-Z]", resposta)) {
										System.out.println("Apenas letras maiúsculas");
										continue;
									}


									char letra = resposta.charAt(0);

									if(lista.contains(resposta)) {
										System.out.println("Letra já usada");
									}else {

										for(int i = 0; i<palavra.length(); i++) {
											if(palavra.charAt(i) == letra) {
												lista.remove(i);
												lista.add(i, resposta);
											}
										}

										if(!lista.contains(resposta)) {
											vidas-=1;
										}
									}

									printBoard(lista, vidas);
									System.out.println();
								}

							}else {
								System.out.println("Letra inválida");
								continue;
							}
						}

				
// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				case 0: Opcoes = Sair;

				//                                          OPÇÃO SAIR
				System.out.println(" --------------------------------------------------------------------  ");
				System.out.println(" ------------------ SAIR ---------------------- \n ");

				Scanner ler1 = new Scanner(System.in);
				System.out.println("Tem certeza que deseja sair do Jogo? \n1. Sim \n2. Não");    
				Sair = ler1.nextInt();
				if(Sair==1) {
					System.out.println("Jogo encerrado\nAté a próxima ");
					Opcoes = Sair;
				} else {
					System.out.println(" -------------------------------------------------------------------- ");
					System.out.println(" ------------------ WELCOME TO THE HANGMAN GAME---------------------- \n ");
					System.out.println(" Tente descobrir qual é a palavra oculta antes de esgotar todas as suas tentativas.\n A cada hora aparece uma palavra nova de um tema diferente.\n Você é capaz de adivinhar? JOGUE GRÁTIS AGORA!! \n ");
					System.out.println("Escolha a opção desejada: \n\n1. Gerenciar Temas \n2. Gerenciar Palavras \n3. Iniciar Jogo \n0. Sair");    
					MenudeOpcoes = input.nextInt();
				}
				continue;
				default:
			//                                              OPÇÃO INVÁLIDA
				System.out.println(" --------------------------------------------------------------------  ");
				System.out.println("----------------------------------- ERRO ---------------------------------- \n");
				System.out.println("Opção não encontrada, por favor recarregue o jogo e insira uma opção válida! ");
			}
			}
			 while (Opcoes!=Sair); 
	}
	}
	
		
