import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int secretNumber = new Random().nextInt(100);
		int userAttempt;

		for (int userAttemptNumber = 4; userAttemptNumber > -1; userAttemptNumber--) {
			System.out.println("Digite um número de 1 a 100:");
			userAttempt = reader.nextInt();

			if (userAttempt == secretNumber) {
				System.out.println("Parabéns, você acertou o número secreto!");
				break;
			} else if (userAttempt > secretNumber) {
				System.out.println(
						userAttempt + " é maior que o número secreto, restam " + userAttemptNumber + " tentativas."
				);
			} else {
				System.out.println(
						userAttempt + " é menor que o número secreto, restam " + userAttemptNumber + " tentativas."
				);
			}

			if (userAttemptNumber == 0) {
				System.out.println("Suas chances acabaram, o número secreto era: " + secretNumber + ".");
				break;
			}
		}
	}
}
