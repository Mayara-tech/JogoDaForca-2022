//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Universidade de Bras�lia - UnB;
// Aluna: Mayara Alves de Oliveira;
// Matricula: 200025058

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
package TrabalhoPraticol;

import java.util.Scanner; //Bibliotecas
import java.util.Arrays;

	public class JogodaForca {
		public static void main(String[] args) {

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			//                                           CRIANDO AS VARIAV�IS 
			int Opcoes = 0;
			int OpcoesGerenciarTemas = 0;
			int GerenciarTemas = 0;
			int ExcluirTema = 0;
			int GerenciarBancodeTema = 0;
			int GerenciarPalavras = 0;
			int CadastrarTema = 0;
			int CadastrarPalavra = 0;
			int OpcoesGerenciarPalavras = 0;
			int Sair = 0;
			int SairGerenciarTema = 0;
			int SairGerenciarPalavra =0;
			String NovoTema;
			String NovaPalavra;
			Vetor vetor = new Vetor(51);

			
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			//                                            CRIANDO MENU DE OP��ES

	System.out.println(" ------------------ WELCOME TO THE HANGMAN GAME---------------------- \n ");
		System.out.println(" Tente descobrir qual � a palavra oculta antes de esgotar todas as suas tentativas.\n A cada hora aparece uma palavra nova de um tema diferente.\n Voc� � capaz de adivinha? JOGUE GR�TIS AGORA!! \n ");
	
			int  MenudeOpcoes;
			Scanner input = new Scanner(System.in);
			System.out.println("Escolha a op��o desejada: \n\n1. Gerenciar Temas \n2. Gerenciar Palavras \n3. Iniciar Jogo \n0. Sair");    
			MenudeOpcoes = input.nextInt();
			
//----------------------------------------------------------------------------------------------------------------------------------------------------- --------------------------------------						

				//                                        CRIANDO ESTRUTURA DE DECIS�O
			do {
				switch (MenudeOpcoes) {
				
// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				
				case 1: Opcoes = GerenciarTemas;
				
				//                                         OP��O GERENCIAR TEMAS
				
				System.out.println(" ------------------ GERENCIAR TEMAS ---------------------- \n ");
				int MenuGerenciarTemas;
				System.out.println("Escolha a op��o desejada: \n\n1. Cadastrar novo tema \n2. Excluir tema existente \n3. Gerenciar banco de temas \n0. Sair");    
				MenuGerenciarTemas = input.nextInt();
				 	do {
				 		switch (MenuGerenciarTemas) {
				 		case 1: OpcoesGerenciarTemas = CadastrarTema;
				 		
	//                                                  op��o cadastrar novo tema
					do {	Scanner ler1 = new Scanner(System.in);
						System.out.println(" ------------------ CADASTRAR TEMAS ---------------------- \n ");
						System.out.println(" deseja cadastrar um novo tema? Lembre- se que para cadastrar\n um novo tema e necess�rio que este tema nao esteja cadastrado.\n\n1.Sim \n2.N�o \n ");
						CadastrarTema = ler1.nextInt();
						if(CadastrarTema==1) {
							Scanner tema = new Scanner(System.in);
							System.out.println("Insira o tema a ser cadastrado:"); 
							NovoTema = tema.nextLine();
						} else {
							System.out.println(" ------------------ GERENCIAR TEMAS ---------------------- \n ");
							System.out.println("Escolha a op��o desejada: \n\n1. Cadastrar novo tema \n2. Excluir tema existente \n3. Gerenciar banco de temas \n0. Sair");    
							MenuGerenciarTemas = input.nextInt();
						}
					}
				 	while (OpcoesGerenciarTemas!=CadastrarTema);
				 		continue;
				 		
				 		case 2: OpcoesGerenciarTemas = ExcluirTema;
				 		continue;
				 		case 3: OpcoesGerenciarTemas = GerenciarBancodeTema;
				 		System.out.println(vetor.toString());
				 		continue;
				 		case 0: OpcoesGerenciarTemas = SairGerenciarTema;

						//                          Op��o sair do gerenciamento de temas

						System.out.println(" ------------------ SAIR ---------------------- \n ");

						Scanner ler2 = new Scanner(System.in);
						System.out.println("Tem certeza que deseja sair do Jogo? \n1. Sim \n2. N�o");    
						SairGerenciarTema = ler2.nextInt();
						if(SairGerenciarTema==1) {
							System.out.println("Jogo encerrado\nAt� a pr�xima ");
							OpcoesGerenciarTemas = SairGerenciarTema;
						} else {
							System.out.println(" ------------------ GERENCIAR TEMAS ---------------------- \n ");
							System.out.println("Escolha a op��o desejada: \n\n1. Cadastrar novo tema \n2. Excluir tema existente \n3. Gerenciar banco de temas \n0. Sair");    
							MenuGerenciarTemas = input.nextInt();
						}
						continue;
						default:
					//                            op��o inv�lida do gerenciamento de temas
						System.out.println("----------------------------------- ERRO ---------------------------------- \n");
						System.out.println("Op��o n�o encontrada, por favor recarregue o jogo e insira uma op��o v�lida! ");
				 		}
				 	}
					while (OpcoesGerenciarTemas!=SairGerenciarTema);
				continue;
				
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				case 2: Opcoes = GerenciarPalavras;
				
				//                                          OP��O GERENCIAR PALAVRAS
				
				System.out.println(" ------------------ GERENCIAR PALAVRAS ---------------------- \n ");
				int MenuGerenciarPalavras;
				System.out.println("Escolha a op��o desejada: \n\n1. Cadastrar nova palavra \n2. Excluir palavra existente \n3. Gerenciar banco de palavras \n0. Sair");    
				MenuGerenciarPalavras = input.nextInt();
				do {
			 		switch (MenuGerenciarPalavras) {
			 		case 1: OpcoesGerenciarPalavras = CadastrarPalavra;
			 		
//                                                  op��o cadastrar nova Palavra
				do {	Scanner ler4 = new Scanner(System.in);
					System.out.println(" ------------------ CADASTRAR PALAVRAS ---------------------- \n ");
					System.out.println(" deseja cadastrar uma nova palavra? Lembre- se que para cadastrar\n uma nova palavra e necess�rio que esta palavra n�o esteja cadastrado.\n\n1.Sim \n2.N�o \n ");
					CadastrarPalavra = ler4.nextInt();
					if(CadastrarPalavra==1) {
						Scanner palavra = new Scanner(System.in);
						System.out.println("Insira o tema onde ser� cadastrado a palavra:\n"); 
						NovoTema = palavra.nextLine();
						System.out.println("Insira a palavra cadastrada:\n"); 
						NovaPalavra = palavra.nextLine();
						
					} else {
						System.out.println(" ------------------ GERENCIAR PALAVRAS ---------------------- \n ");
						System.out.println("Escolha a op��o desejada: \n\n1. Cadastrar nova palavra \n2. Excluir palavra existente \n3. Gerenciar banco de palavras \n0. Sair");   
						MenuGerenciarPalavras = input.nextInt();
					}
					}
			 	while (OpcoesGerenciarPalavras!=CadastrarPalavra);
			 		continue;
			 		case 2: OpcoesGerenciarPalavras = 3;
			 		continue;
			 		case 3: OpcoesGerenciarPalavras = 4;
			 		continue;
			 		case 0: OpcoesGerenciarPalavras = SairGerenciarPalavra;

					//                          Op��o sair do gerenciamento de palavras

					System.out.println(" ------------------ SAIR ---------------------- \n ");

					Scanner ler3 = new Scanner(System.in);
					System.out.println("Tem certeza que deseja sair do Jogo? \n1. Sim \n2. N�o");    
					SairGerenciarPalavra = ler3.nextInt();
					if(SairGerenciarPalavra==1) {
						System.out.println("Jogo encerrado\nAt� a pr�xima ");
						OpcoesGerenciarPalavras = SairGerenciarPalavra;
					} else {
						System.out.println(" ------------------ GERENCIAR PALAVRAS ---------------------- \n ");
						System.out.println("Escolha a op��o desejada: \n\n1. Cadastrar nova palavra \n2. Excluir palavra existente \n3. Gerenciar banco de palavras \n0. Sair");    
						MenuGerenciarPalavras = input.nextInt();
					}
					continue;
					default:
				//                            op��o inv�lida do gerenciamento de palavras
					System.out.println("----------------------------------- ERRO ---------------------------------- \n");
					System.out.println("Op��o n�o encontrada, por favor recarregue o jogo e insira uma op��o v�lida! ");
			 		}
			 	}
				while (OpcoesGerenciarPalavras!=SairGerenciarPalavra);
			continue;
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				case 3: Opcoes = 2;
				
				//                                          OP��O INICIAR JOGO
				
// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				case 0: Opcoes = Sair;

				//                                          OP��O SAIR

				System.out.println(" ------------------ SAIR ---------------------- \n ");

				Scanner ler1 = new Scanner(System.in);
				System.out.println("Tem certeza que deseja sair do Jogo? \n1. Sim \n2. N�o");    
				Sair = ler1.nextInt();
				if(Sair==1) {
					System.out.println("Jogo encerrado\nAt� a pr�xima ");
					Opcoes = Sair;
				} else {
					System.out.println(" ------------------ WELCOME TO THE HANGMAN GAME---------------------- \n ");
					System.out.println(" Tente descobrir qual � a palavra oculta antes de esgotar todas as suas tentativas.\n A cada hora aparece uma palavra nova de um tema diferente.\n Voc� � capaz de adivinha? JOGUE GR�TIS AGORA!! \n ");
					System.out.println("Escolha a op��o desejada: \n\n1. Gerenciar Temas \n2. Gerenciar Palavras \n3. Iniciar Jogo \n0. Sair");    
					MenudeOpcoes = input.nextInt();
				}
				continue;
				default:
			//                                              OP��O INV�LIDA
				System.out.println("----------------------------------- ERRO ---------------------------------- \n");
				System.out.println("Op��o n�o encontrada, por favor recarregue o jogo e insira uma op��o v�lida! ");
			}
			}
			 while (Opcoes!=Sair); 
		}
	}
	
		
