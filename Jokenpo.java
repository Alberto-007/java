import java.util.Scanner;

public class Jokenpo {
	public String getNomeJogador1() {
		return nomeJogador1;
	}

	public void setNomeJogador1(String nomeJogador1) {
		this.nomeJogador1 = nomeJogador1;
	}

	public String getNomeJogador2() {
		return nomeJogador2;
	}

	public void setNomeJogador2(String nomeJogador2) {
		this.nomeJogador2 = nomeJogador2;
	}

	public int getQtdPartidas() {
		return qtdPartidas;
	}

	public void setQtdPartidas(int qtdPartidas) {
		this.qtdPartidas = qtdPartidas;
	}

	public int getPontuacaoJogador1() {
		return pontuacaoJogador1;
	}

	public void setPontuacaoJogador1(int pontuacaoJogador1) {
		this.pontuacaoJogador1 = pontuacaoJogador1;
	}

	public int getPontuacaoJogador2() {
		return pontuacaoJogador2;
	}

	public void setPontuacaoJogador2(int pontuacaoJogador2) {
		this.pontuacaoJogador2 = pontuacaoJogador2;
	}

	public int getPontuacaoEmpate() {
		return pontuacaoEmpate;
	}

	public void setPontuacaoEmpate(int pontuacaoEmpate) {
		this.pontuacaoEmpate = pontuacaoEmpate;
	}

	public Scanner getEntrada() {
		return entrada;
	}

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}
	String nomeJogador1;
	String nomeJogador2;
	int qtdPartidas;
	int pontuacaoJogador1;
	int pontuacaoJogador2;
	int pontuacaoEmpate;
	
	Scanner entrada = new Scanner(System.in);
	
	public Jokenpo(String nomeJogador1, String nomeJogador2) {
		super();
		this.nomeJogador1 = nomeJogador1;
		this.nomeJogador1 = nomeJogador2;
		telaDeBoasVindas(nomeJogador1, nomeJogador2);
	}
	
	public void telaDeBoasVindas(String jogador1, String jogador2) {
		System.out.println("*** Bem vindos " + jogador1 + " e "+ jogador2);
		escolheQuantidadePartidas();
	}
	
	public void escolheQuantidadePartidas() {		
		char opcao;
		System.out.println("--- Escolha a quantidade de partidas --");
		System.out.println("(1) 5 Partidas");
		System.out.println("(2) 7 Partidas");
		System.out.println("(3) 9 Partidas");
		System.out.println("Escolha a opcao: ");
		opcao = entrada.next().charAt(0);
		
		switch (opcao) {
		case '1':
			qtdPartidas = 5;
			break;
		case '2':
			qtdPartidas = 7;
			break;
		case '3':
			qtdPartidas = 9;
			break;
		default:
			System.out.println("Essa opçao nao existe!");
			break;
		}
	}
	public int validarJogada(int v1, int v2) {
		switch (v1){
			case 1: 
				switch (v2){
					case 1:
						System.out.println("Empate");
						return 3;
					case 2:
						System.out.println("Jogador 2 ganhou"); 
						return 2;
					case 3:
						System.out.println("Jogador 1 ganhou");
						return 1;
				}
			case 2:
				switch(v2) {
					case 1: 
						System.out.println("Jogador 1 ganhou");
						return 1;
					case 2:
						System.out.println(" Empatou");
						return 3;
					case 3:
						System.out.println("Jogador 2 ganhou");
						return 2;
					
				}
			case 3:
				switch(v2) {
						case 1:
							System.out.println("Jogador 2 ganhou");
							return 2;
						case 2:
							System.out.println("Jogador 1 ganhou");
							return 1;
						case 3:
							System.out.println("Empate");
							return 3;
						
				}
		}
		return v2;
	}
	
	
	public void jogar() {
		int qtdRodadas = 1;
		int jogadaJogador1;
		int jogadaJogador2;
		int validador;
		
		while(qtdRodadas <= qtdPartidas) {
			System.out.println("Rodada " + qtdRodadas + " de " + qtdPartidas);
			System.out.println("-- Opcoes de Jogada --");
			System.out.println("(1) Pedra");
			System.out.println("(2) Papel");
			System.out.println("(3) Tesoura");
			
			System.out.println("Jogador 1 - Escolha sua Jogada: ");
			jogadaJogador1 = entrada.nextInt();
			System.out.println("Jogador 2 - Escolha sua Jogada: ");
			jogadaJogador2 = entrada.nextInt();
			
			validador = validarJogada(jogadaJogador1, jogadaJogador2);
			if(validador == 1) {
				pontuacaoJogador1 += 1;
			} else if (validador == 2) {
				pontuacaoJogador2 += 1;
			} else {
				System.out.println("Houve empate na Rodada");
				pontuacaoEmpate += 1;
			}
			
			qtdRodadas += 1;
		}
	}
	
	public void placarFinal() {
		
	}
	public static void main(String[] args) {
		
		Jokenpo jogo = new Jokenpo("Alberto", "Mayara");
		jogo.jogar();
	}

}
