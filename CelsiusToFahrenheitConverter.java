import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        float celsiusTemperature = scanner.nextFloat();

        float fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;
        System.out.println("\nThe temperature in Fahrenheit is: " + fahrenheitTemperature);

        scanner.close();
    }
}

