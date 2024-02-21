package p1;

import java.util.Scanner;

public class q1 {
	String jogador1;
	String jogador2;
	int qntPartidas;
	int placarjogador1;
	int placarjogador2;
	
	public int getPlacarjogador1() {
		return placarjogador1;
	}

	public void setPlacarjogador1(int placarjogador1) {
		this.placarjogador1 = placarjogador1;
	}

	public int getPlacarjogador2() {
		return placarjogador2;
	}

	public void setPlacarjogador2(int placarjogador2) {
		this.placarjogador2 = placarjogador2;
	}

	public int getQntPartidas() {
		return qntPartidas;
	}

	public void setQntPartidas(int qntPartidas) {
		this.qntPartidas = qntPartidas;
	}

	public q1(String jogador1, String jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		boasVindas();
	}
	
	public q1() {
		
	}

	public String getJogador1() {
		return jogador1;
	}

	public void setJogador1(String jogador1) {
		this.jogador1 = jogador1;
	}

	public String getJogador2() {
		return jogador2;
	}

	public void setJogador2(String jogador2) {
		this.jogador2 = jogador2;
	}

	public void boasVindas() {
		System.out.printf("Bem vindos %s e %s ao jogo de Jokenpo%n", getJogador1(), getJogador2());
		escolheQuantidadeDePartidas();
	}
	
	public void escolheQuantidadeDePartidas() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1: 5 partidas");
		System.out.println("2: 7 partidas");
		System.out.println("3: 9 partidas");
		System.out.print("Escolha a quantidade de partidas: ");
		
		int c = sc.next().charAt(0);
		switch (c) {
		case 1:
			System.out.println("5 partidas");
			setQntPartidas(5);
			break;
		case 2:
			System.out.println("7 partidas");
			setQntPartidas(7);
			break;
		case 3:
			System.out.println("9 partidas");
			setQntPartidas(9);
			break;
		}
		sc.close();
	}
	
	public void jogar() {
		Scanner sc = new Scanner(System.in);
		int x = getQntPartidas();
		int y = 1;
		while(x != 0) {
			System.out.printf("Partida de no. %d de %d%n", y, x);
			System.out.print("Jogador 1, digite 'Pedra', 'Papel' ou 'Tesoura': ");
			String jog1 = sc.next().toUpperCase();
			System.out.print("Jogador 2, digite 'Pedra', 'Papel' ou 'Tesoura': ");
			String jog2 = sc.next();
		
			System.out.println(validarJogada(jog1, jog2));
		}
			
		sc.close();
	}
	
	public int validarJogada(String jog1, String jog2) {
		int value = 0;
		if (jog1 == "PEDRA" && jog2 == "TESOURA") {
			value = 1;
		}
		
		else if (jog1 == "PEDRA" && jog2 == "PAPEL") {
			value = 2;
		}
		
		else if(jog1 == "PEDRA" && jog2 == "PEDRA") {
			value = 3;
		}
		
		else if(jog1 == "PAPEL" && jog2 == "TESOURA") {
			value = 2;
		}
		
		else if(jog1 == "PAPEL" && jog2 == "PAPEL") {
			value = 3;
		}
		
		else if(jog1 == "PAPEL" && jog2 == "PEDRA") {
			value = 1;
		}
		
		else if(jog1 == "TESOURA" && jog2 == "PAPEL") {
			value = 1;
		}
		
		else if(jog1 == "TESOURA" && jog2 == "PEDRA") {
			value = 2;
		}
		
		else if(jog1 == "TESOURA" && jog2 == "TESOURA") {
			value = 3;
		}
		
		if (value == 1) {
			this.jogador1 += 1;
		}
		
		else if(value == 2) {
			this.jogador2 += 1;
		}
		
		
		return value;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
