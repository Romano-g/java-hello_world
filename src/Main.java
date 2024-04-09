//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match!");
        System.out.println("Filme: Top Gun Maverick");

        int releaseYear = 2022;
        System.out.println("Ano de lançamento: " + releaseYear);

        boolean includedInSubscription = true;
        double filmMetaNote = 8.5;

		// Média calculada com a nota de 3 sites de críticas.
        double mediaNotes = (9.8 + 7.5 + filmMetaNote) / 3;
        System.out.println(mediaNotes);

        String synopsis = "Filme de aventura com um galã dos anos 80.";
        System.out.println(synopsis);

        int rating = (int) (mediaNotes / 2);
        System.out.println(rating);
    }
}