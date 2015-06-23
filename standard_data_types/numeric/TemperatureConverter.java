
// Scanner instances provide an interface for finding patterns in data streams.
// Note that using import will push Scanner into the TemperatureConverter
// namespace -- using import is NOT required if you specify
// the full path of the class you're invoking! Java knows how to find it.
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Double fahrenheit;
        Double celsius;
        Scanner input;

        // Since the Scanner is a class in Java, it must be instantiated.
        // It's the class loader's responsibility to both instantiate
        // objects and load classes, NOT the import statement's.
        input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit: ");

        // I think this returns the first parsably-Double string as a Double.
        fahrenheit = input.nextDouble();

        celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println("The temperature in Celsius is: " + celsius);

        // 0 is presumably a return code, similar to how
        // returnless Python functions actually return None.
        System.exit(0);

    }

}
