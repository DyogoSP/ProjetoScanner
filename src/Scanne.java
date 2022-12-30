import java.util.Scanner;

public class Scanne {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Qual o seu nome: ");
		
		String nome = sc1.nextLine();
		System.out.println("Seja bem vindo " +nome+ " !");
	}
}
