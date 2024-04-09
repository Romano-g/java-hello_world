import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		// 1
		Scanner reader = new Scanner(System.in);

//		System.out.println("Digite um número: ");
//		int userNumber = reader.nextInt();
//
//		String result = (userNumber > 0) ? "O número é positivo" : "O número é negativo";
//		System.out.println(result);
//
//		// 2
//		System.out.println("Digite um número inteiro:");
//		int userInt1 = reader.nextInt();
//		System.out.println("Digite mais um número inteiro:");
//		int userInt2 = reader.nextInt();
//
//		if (userInt1 == userInt2) {
//			System.out.println("Os números são iguais");
//		} else if (userInt1 > userInt2) {
//			System.out.println("Os números são diferentes, " + userInt1 + " é maior que " + userInt2);
//		} else {
//			System.out.println("Os números são diferentes, " + userInt2 + " é maior que " + userInt1);
//		}

		// 3
//		System.out.println("Digite:");
//		System.out.println("1 - Para calcular a área de um quadrado");
//		System.out.println("2 - Para calcular a área de um círculo");
//		int userOption = reader.nextInt();
//
//		if (userOption == 1) {
//			System.out.println("Digite o tamanho dos lados do quadrado:");
//			double userSquare = reader.nextDouble();
//
//			double userSquareArea = Math.pow(userSquare, 2);
//			System.out.println("A área do seu quadrado é de " + userSquareArea);
//		} else if (userOption == 2) {
//			System.out.println("Digite o raio do círculo");
//			double userCircle = reader.nextDouble();
//
//			double userCircleArea = Math.pow(userCircle, 2) * 3.14159;
//			System.out.println("A área do seu círculo é de " + userCircleArea);
//		} else {
//			System.out.println("Opção inválida!");
//		}

		// 4
//		System.out.println("Digite um número");
//		double userNumberMultiplicationTable = reader.nextDouble();
//
//		for (int i = 1; i < 11; i++) {
//			double resultMultiplication = userNumberMultiplicationTable * i;
//			System.out.println(resultMultiplication);
//		}

		// 5
//		System.out.println("Digite um número Inteiro");
//		int userNumberInt = reader.nextInt();
//
//		System.out.println((userNumberInt % 2 == 0) ? "O número é par" : "O número é ímpar");

		// 6
		System.out.println("Digite um número");
		double userNumberDouble = reader.nextDouble();
		double userResultDouble = 1;

		for (int i = 1; i <= userNumberDouble; i++) {
			userResultDouble *= i;
		}
		System.out.println("O resultado da fatoração foi de " + userResultDouble);
	}
}
