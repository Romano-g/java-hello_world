import java.util.Scanner;

public class LoopInfinito {
	public static void main(String[] args) {
		Scanner reading = new Scanner(System.in);
		double yourRating = 0;
		double ratingMedia = 0;
		int totalRating = 0;

		while (yourRating != -1) {
			System.out.println("Dê uma nota para o filme ou digite -1 para encerrar:");
			yourRating = reading.nextDouble();

			if (yourRating != -1) {
				ratingMedia += yourRating;
				totalRating++;
			}
		}

		System.out.printf("A média das avaliações foi: %.2f%n", ratingMedia/totalRating);
	}
}
