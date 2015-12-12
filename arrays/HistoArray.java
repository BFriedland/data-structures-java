import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class HistoArray {
    public static void main(String[] args) {
        Scanner data = null;
        // Arrays, with their different capability set, have a lower overhead
        // than ArrayLists do. Here's a simple syntax for initializing an array:
        Integer[] count = {0,0,0,0,0,0,0,0,0,0};
        Integer idx;

        try {
            data = new Scanner(new File("test.dat"));
        }
        catch (IOException e) {
            System.out.println("Unable to open data file.");
            e.printStackTrace();
            System.exit(0);
        }

        // Actually building the histogram, using the usual bracket syntax to
        // index in to the array.
        while (data.hasNextInt()) {
            idx = data.nextInt();
            count[idx] = count[idx] + 1;
        }

        idx = 0;
        for (Integer i: count) {
            System.out.println(idx + " occurred " + i + " times.");
            idx++;
        }
    }
}
