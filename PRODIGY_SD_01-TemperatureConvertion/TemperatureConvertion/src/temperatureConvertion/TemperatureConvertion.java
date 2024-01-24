package temperatureConvertion;

import java.util.Scanner;
public class TemperatureConvertion {


	    // Conversion functions
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}

	public static double celsiusToKelvin(double celsius) {
		return celsius + 273.15;
	}

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5/9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9/5) - 459.67;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program!");
        System.out.println("-------------------------------");

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the original unit (Celsius, Fahrenheit, or Kelvin): ");
        String originalUnit = scanner.next().toLowerCase();

        double fahrenheit = 0, kelvin = 0, celsius = 0;

        if (originalUnit.equals("celsius")) {
            fahrenheit = celsiusToFahrenheit(temperature);
            kelvin = celsiusToKelvin(temperature);
        } else if (originalUnit.equals("fahrenheit")) {
            celsius = fahrenheitToCelsius(temperature);
            kelvin = fahrenheitToKelvin(temperature);
        } else if (originalUnit.equals("kelvin")) {
            celsius = kelvinToCelsius(temperature);
            fahrenheit = kelvinToFahrenheit(temperature);
        } else {
            System.out.println("Invalid input. Please enter a valid unit.");
            return;
        }

        System.out.printf("%.2f %s is equivalent to:\n", temperature, originalUnit);
        System.out.printf("%.2f Fahrenheit\n", fahrenheit);
        System.out.printf("%.2f Kelvin\n", kelvin);
        if (celsius != 0) {
            System.out.printf("%.2f Celsius\n", celsius);
        }
    }
}


