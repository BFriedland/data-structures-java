

public class StringDemo {

    public static void main(String[] args) {

        String testString;
        String[] testStringArray;
        String joinedTestString;

        // Char literals are single quoted.
        // String literals are double quoted.
        testString = "  Hello World Redux  ";

        System.out.println("Contents of testString:");
        System.out.println(testString);

        System.out.println("6th character in the testString:");
        System.out.println(testString.charAt(8));

        System.out.println("8th to 12th characters, inclusive:");
        System.out.println(testString.substring(8, 13));

        System.out.println("testString length:");
        System.out.println(testString.length());

        System.out.println("Index of the first occurence of 'R':");
        System.out.println(testString.indexOf('R'));

        System.out.println("Whitespace-stripped testString:");
        System.out.println(testString.trim());

        System.out.println("testString, split on \"World\" and rejoined:");
        testStringArray = testString.split("World");
        joinedTestString = testStringArray[0].concat(testStringArray[1]);
        System.out.println(joinedTestString);
    }

}





