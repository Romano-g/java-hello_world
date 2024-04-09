public class Desafio1 {
	public static void main(String[] Args) {
		double firstDecimal = 10.2;
		double secondDecimal = 2.4;
		double decimalMedia = (firstDecimal + secondDecimal) / 2;
		System.out.println(decimalMedia);

		int decimalMediaInt = (int) decimalMedia;
		System.out.println(decimalMediaInt);

		char r = 'r';
		String olha = "Olha";
		System.out.println(olha + r);

		double productPrice = 12.50;
		int amount = 10;
		System.out.println("Valor total: " + (productPrice * amount));

		double valueInDollars = 569.00;
		double dollarValue = 4.94;
		System.out.println(
				String.format(
						"Valor em dólares: %.2f; valor em reais: %.2f", valueInDollars, (valueInDollars*dollarValue)
				)
		);

		double originalPrice = 1000.00;
		double discountAmount = (double) 10 /100;
		double discountPrice = originalPrice - (originalPrice * discountAmount);
		System.out.println("Preço com desconto: " + discountPrice);
	}
}
