public class PrimeiraClasse {
    public static void main(String[] Args) {
        double celsiusTemp = 22.3;
        double farenheitTemp = (celsiusTemp * 1.8) + 32;
        String firstMessage = String.format(
                "A temperatura %.2f Celsius é equivalente a %.2f Farenheit", celsiusTemp, farenheitTemp
        );
        System.out.println(firstMessage);

        int farenheitTempInt = (int) (farenheitTemp);
        System.out.println("A temperatura de farenheit convertida em int fica: " + farenheitTempInt);
    }
}