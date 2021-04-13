//In Java exercises, create a class, JavaIIIWarmUp, and include the following. You will also need to create a main method to test it.
//Create a static method, sameFirstAndLast, that takes in a string and returns true if the first and last character match (not case sensitive).
//Examples:
//  Input  - “Bob”
//  Output - true
//  Input  - “Steve”
//  Output - false
//  Input  - “refrigerator”
//  Output - true
//  Input  - “q2kdj3vq”
//  Output - true



public class JavaIIIWarmUp {
    public static void main(String[] args) {
        System.out.println(sameFirstAndLast("Bob"));
        System.out.println(sameFirstAndLast("steve"));
        System.out.println(sameFirstAndLast("refrigerator"));
        System.out.println(sameFirstAndLast("q2kdj3vq"));
    }
    public static boolean sameFirstAndLast(String input) {
        char first = Character.toLowerCase(input.charAt(0));
        char last = Character.toLowerCase(input.charAt(input.length() - 1));
        return first == last;
    }
}

