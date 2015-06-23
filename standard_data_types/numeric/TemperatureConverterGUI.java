
// Contains JOptionPane, for basic GUI things.
import javax.swing.*;

public class TemperatureConverterGUI {

    public static void main(String[] args) {

        String fahrenheitString;
        Double fahrenheit, celsius;

        // An input box with prompt dialog:
        fahrenheitString = JOptionPane.showInputDialog("Enter the temperature in Fahrenheit: ");

        // The Double class has a built-in string converter.
        fahrenheit = new Double(fahrenheitString);

        celsius = (fahrenheit - 32) * 5.0 / 9.0;

        // A message box -- the null means it isn't
        // associated with a "main" program window.
        JOptionPane.showMessageDialog(null, "The temperature in Celsius is " + celsius);

    }

}
