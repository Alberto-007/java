import java.util.Random;
import java.util.Scanner;

class Avaliacaopedras {
    @Override
	public String toString() {
		return "Avaliacaopedras []";
	}

	public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do usuário 1 : ");
        final String nome1 = scan.nextLine();
        final Jogadores Jogador1 = new Jogadores();
        Jogador1.nome = nome1;

        System.out.println("Digite o nome do usuário 2 : ");
        final String nome2 = scan.nextLine();
        final Jogadores Jogador2 = new Jogadores();
        Jogador2.nome = nome2;

        System.out.println("Digite o nome do usuário 3 : ");
        final String nome3 = scan.nextLine();
        final Jogadores Jogador3 = new Jogadores();
        Jogador3.nome = nome3;

        final Random random = new Random();
        final int num = random.nextInt(6);
        final int num2 = random.nextInt(6);
        final int num3 = random.nextInt(6);

        System.out.println(nome1 + " Recebeu : " + num);
        System.out.println(nome2 + " Recebeu : " + num2);
        System.out.println(nome3 + " Recebeu : " + num3);

    }

}
