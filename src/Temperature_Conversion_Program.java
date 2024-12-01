import java.util.*;

public class Temperature_Conversion_Program {

//    Function to convert C into F && K
    public static void CelsiusToFahrenheitAndKelvin(double Celsius){
        double Fahrenheit = Celsius * (9.0/5.0) + 32;
        double Kelvin = Celsius + 273.15;

        // to show output, Conversion of units.
        System.out.println("Celsius into Fahrenheit = " + Fahrenheit);
        System.out.println("Celsius into Kelvin = " + Kelvin);
    }

    // Function to convert F into C && K
    public static void FahrenheitToCelsiusAndKelvin(double Fahrenheit){
        double Celsius = (Fahrenheit - 32) * (5.0/9.0);
        double Kelvin = Celsius + 273.15;

        // to show output, Conversion of units.
        System.out.println("Fahrenheit into Celsius = " + Celsius);
        System.out.println("Kelvin into Celsius = " + Kelvin);
    }

    public static void KelvinToCelsiusAndFahrenheit(double Kelvin){
        double Celsius = Kelvin - 273.15;
        double Fahrenheit = Celsius * (9.0/5.0) + 32;

        // to show output, Conversion of units.
        System.out.println("Fahrenheit into Celsius = " + Celsius);
        System.out.println("Kelvin into Celsius = " + Kelvin);
    }

    public static void main(String[] args){
        //To take user input.
        Scanner s = new Scanner(System.in);

        System.out.println("Please put the temperature :");
        double Temperature = s.nextDouble();

        System.out.println("Enter the unit of the temperature (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char unit = s.next().toUpperCase().charAt(0);

        // Call appropriate conversion method based on user input
        switch (unit) {
            case 'C':
                CelsiusToFahrenheitAndKelvin(Temperature);
                break;
            case 'F':
                FahrenheitToCelsiusAndKelvin(Temperature);
                break;
            case 'K':
                KelvinToCelsiusAndFahrenheit(Temperature);
                break;
            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
        }

        s.close();

    }
}
