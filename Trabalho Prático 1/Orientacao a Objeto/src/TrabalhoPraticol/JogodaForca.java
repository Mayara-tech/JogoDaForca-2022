//------------------------------------------------------------------------------------
// Universidade de Bras�lia - UnB;
// Aluna: Mayara Alves de Oliveira;
// Matricula: 200025058
//-------------------------------------------------------------------------------------
	
package TrabalhoPraticol;

import java.util.Scanner; //Bibliotecas
import java.util.Arrays;

	public class JogodaForca {
		public static void main(String[] args) {
			
			//                                           Criando as variav�is 
			int Sair = 0;
			int Opcoes = 0;
			int NovoCliente;


			//                                            Menu de Op��es

	System.out.println(" ------------------ WELCOME TO THE HANGMAN GAME---------------------- \n ");
		System.out.println(" Tente descobrir qual � a palavra oculta antes de esgotar todas as suas tentativas.\n A cada hora aparece uma palavra nova de um tema diferente.\n Voc� � capaz de adivinha? JOGUE GR�TIS AGORA!! \n ");
	
			int  MenudeOpcoes;
			Scanner input = new Scanner(System.in);
			System.out.println("Escolha a op��o desejada: \n\n1. Gerenciar Temas \n2. Gerenciar Palavras \n3. Iniciar Jogo \n0. Sair");    
			MenudeOpcoes = input.nextInt();
			
			do {
				
				//                                Criando estrutura de decis�o

				switch (MenudeOpcoes) {
				case 1: Opcoes = 2;
				continue;

				//                            Op��o Realizar Cadastro de Novo Cliente

				case 0: Opcoes = Sair;

				//                                          OP��O SAIR

				System.out.println(" ------------------ SAIR ---------------------- \n ");

				Scanner ler1 = new Scanner(System.in);
				System.out.println("Tem certeza que deseja sair do Jogo? \n1. Sim \n2. N�o");    
				Sair = ler1.nextInt();
				if(Sair==1) {
					System.out.println(" Jogo encerrado\n At� a pr�xima ");
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
				System.out.println("----------------------------------- ERRO -------------------------8--------- \n");
				System.out.println("Op��o n�o encontrada, por favor recarregue o jogo e insira uma op��o v�lida! ");
			}
			}
			 while (Opcoes!=Sair); 
			}
		}
		
		
