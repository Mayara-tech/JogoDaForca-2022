package TrabalhoPraticol;

import java.util.Arrays;

public class Vetor {
	int tamanho;
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//                                          CRIANDO VETOR DE DUAS DIMENS�O E CARREGANDO BANCO DE DADOS
	
	public String[][] temaPalavra = {
			{"CORES" ,"amarelo", "azul", "vermelho","preto", "cinza", "branco", "rosa", "roxo", "verde", "grafite"},
			{"ANIMAIS", "elefante", "cachorro", "gato", "paassaro", "peixe", "urso", "hipopotamo", "garfanhoto", "hamster", "porco"},
			{"OBJETO", "tesoura", "lapis", "gaiola", "colher", "panela", "televis�o", "caneta", "celular", "geladeira", "teclado"},
			{"PROFISS�ES", "dentista", "medico", "padeiro", "cozinheiro", "pedreiro", "advogado", "psicologo", "nutricionista", "artista", "cantor"},
			{"ROUPAS E ACESS�RIOS", "blusa", "casaco", "tenis", "cinto", "cal�a", "short", "regata", "jaqueta", "oculos","saia"},
			{"MESES DO ANO", "Janeiro", "fevereiro", "mar�o", "abril", "maio", "junho", "julho", "agosto", "setembro","outubro", "novembro","dezembro"},
			{"CARROS", "gol", "siena", "golf", "uno", "mobi", "belina", "hb20", "ferrari", "civic","fusca"},
			{"PAISES DA AM�RICA DO SUL", "brasil", "argentina", "paraguai", "bolivia", "chile", "equador", "venezuela", "suriname", "colombia", "peru"},
			{"ESTADOS BRASILEIROS", "amazonas", "goias", "amapa", "tocantins", "ceara", "piaui", "maranhao","sergipe", "roraima", "acre"},
			{"TIMES DO BRASILEIR�O", "corinthians", "flamengo", "vasco", "palmeiras", "santos", "cruzeiro", "fluminense","botafogo","gremio","internacional"}
			};
			public Vetor(int capacidade){
			this.temaPalavra = new String [capacidade][capacidade];
		
}
			//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			//                                          CRIANDO METODO ADICIONAR
	
	public void adiciona (String temaPalavra) throws Exception {
			if (this.tamanho < this.temaPalavra.length) {
					this.temaPalavra [this.tamanho][this.tamanho] = temaPalavra; 
					this.tamanho++;
			}else {
				throw new Exception ("N�o foi possivel adicionar pois atingimos o limite m�ximo de tema/palavras");
			}
			}
			
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//                                          CRIANDO METODO IMPRIMIR VETOR 

	@Override
	public String toString() {
		return Arrays.toString(temaPalavra);
	}
}