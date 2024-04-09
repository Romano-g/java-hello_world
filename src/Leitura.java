import java.util.Scanner;

public class Leitura {
	public static void main(String[] args) {
		Scanner reading = new Scanner(System.in);

		System.out.println("Digite seu filme favorito:");
		String movie = reading.nextLine();
		System.out.println("Qual o ano de lançamento?");
		int releaseYear = reading.nextInt();
		System.out.println("Dê uma nota para o filme:");
		double yourRating = reading.nextDouble();

		System.out.println(movie);
		System.out.println(releaseYear);
		System.out.println(yourRating);

		reading.close();
	}
}
