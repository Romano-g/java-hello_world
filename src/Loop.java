import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner reading = new Scanner(System.in);
		double yourRating;
		double ratingMedia = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Dê uma nota para o filme:");
			yourRating = reading.nextDouble();
			ratingMedia += yourRating;
		}

		System.out.printf("A média das avaliações foi: %.2f%n", ratingMedia/3);
	}
}
