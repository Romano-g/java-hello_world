public class Condicional {
	public static void main(String[] args) {
		int releaseYear = 2022;
		boolean includedInSubscription = true;
		double filmMetaNote = 8.5;
		String subscriptionType = "Plus";

		if (releaseYear >= 2022){
			System.out.println("Lançamentos que os clientes estão curtindo!");
		} else {
			System.out.println("Filme retrô que vale a pena assistir!");
		}

		if (includedInSubscription && subscriptionType.equals("Plus")) {
			System.out.println("Acesso liberado");
		} else {
			System.out.println("O filme custa R$10,00");
		}
	}
}
