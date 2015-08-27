
// Reference:
// http://interactivepython.org/
//                    runestone/static/java4python/Java4Python.html#list

// The aim of this program is to create a simple
// histogram of the number of times each numeral
// from 0 to 9 occurs in a supplied file.

public class Histogram {

    public static void main(String[] args) {

        // This time I'm going to use the Java
        // compiler's ability to access classes
        // it knows about without using the
        // import syntax to shorten the reference.

        // The Scanner is initialized with null
        // data because the data is will be given
        // is contained in a file, and we want
        // to catch any potential Exceptions
        // opening that file might create.
        java.util.Scanner datastream = null;

        // This ArrayList's contents are required
        // to be instances of the Integer class.
        // We could leave off the <Type> syntax,
        // but then javac would tell us we have
        // an "unchecked or unsafe operation".
        // Untyped ArrayLists can be used, but
        // objects put in them can't be, unless
        // you "resort to an ugly notation called
        // casting", writ the tutorial.
        java.util.ArrayList<Integer> numeralCounts;

        // This variable is used to figure out which
        // index to increment in the data counter.
        Integer index;

        String dataFilePath;

        dataFilePath = "test.dat";

        // Exception handling works just like Python.
        try {

            // This is why you use imports.
            datastream = new java.util.Scanner(new java.io.File(dataFilePath));

        }

        // "catch" == "except"
        catch (java.io.IOException theException) {

            System.out.println("Unable to open file ".concat(dataFilePath));

            // The stack trace is held in the exception itself.
            // Printing it is like a per-instance opt-in for
            // debugging (so you can remove stack trace printing
            // in sensitive places and leave it in others, perhaps?).
            theException.printStackTrace();

            System.exit(0);

        }

        // Remember how told Java we'd need an ArrayList
        // full of Integers, and that we wanted to name
        // it "count"? Well, it didn't actually exist
        // untill now. This calls the constructor and
        // gives us an ArrayList with ten slots in it.
        numeralCounts = new java.util.ArrayList<Integer>(10);

        // This puts zeroes in each of the ten slots
        // in our ArrayList<Integer>. These zeroes
        // are counters -- we want them to remain
        // zeroes if they are not incremented!
        for (Integer i = 0; i < 10; i++) {
            numeralCounts.add(i, 0);
        }

        // for i in range(2,101,2)
        for (Integer i = 2; i < 101; i += 2) {

            // System.out.println(Integer.toString(i));

        }

        // for i in range(1,100)
        for (Integer i = 1; i < 100; i++) {

            // System.out.println(Integer.toString(i));

        }

        // for i in range(100,0,-1)
        for (Integer i = 100; i > 0; i--) {

            // System.out.println(Integer.toString(i));

        }

        // for x,y in zip(range(10),range(0,20,2))
        for (Integer x = 0, y = 0; (x < 10) && (y < 20); x++, y += 2) {

            // System.out.println(Integer.toString(x).concat(", ").concat(Integer.toString(y)));

        }

        // Note that the Scanner's hasNextInt method
        // is called before attempting to call nextInt.
        // This probably prevents some kind of exception...
        while (datastream.hasNextInt()) {

            index = datastream.nextInt();

            // Note that the index's similarity to the
            // numeral being counted by that spot in the
            // ArrayList is merely a convenient coincidence.
            // In a more complicated problem, index would
            // need to be determined by some sort of mapping,
            // perhaps using a dictionary or other data structure.
            numeralCounts.set(index, (numeralCounts.get(index) + 1));

        }

        // Here, we will repurpose the
        // now-unused variable, index,
        // to iterate over numeralCounts.
        index = 0;

        for (Integer i: numeralCounts) {

            System.out.println(index + " occurred " + i + " times.");
            index++;

        }

    }

}
