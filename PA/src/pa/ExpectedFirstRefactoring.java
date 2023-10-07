package pa;

import java.util.Scanner;

public class ExpectedFirstRefactoring {

    private static final Scanner console = new Scanner(System.in);

    private static int readInput(String message, int min, int max) {
        int number;
        do {
            System.out.println(message);
            number = console.nextInt();
        } while (number > max || number < min);
        return number;
    }

    public static int readNumberOfTerms() {
        return readInput("Enter the number of terms in the AP:", 2, Integer.MAX_VALUE);
    }

    public static int readFirstTerm() {
        return readInput("Enter the first term of the AP:", 1, Integer.MAX_VALUE);
    }

    public static int readCommonDifference() {
        return readInput("Enter the common difference of the AP:", 1, Integer.MAX_VALUE);
    }

    public static int termOfIndex(int firstTerm, int commonDifference, int index) {
        return firstTerm + (index - 1) * commonDifference;
    }

    public static int sumOfAllTerms(int firstTerm, int commonDifference, int numberOfTerms) {
        int lastTerm = termOfIndex(firstTerm, commonDifference, numberOfTerms);
        return ((firstTerm + lastTerm) * numberOfTerms) / 2;
    }

    public static void printAllTerms(int firstTerm, int commonDifference, int numberOfTerms) {
        for (int i = 1; i <= numberOfTerms; i++) {
            int ithTerm = termOfIndex(firstTerm, commonDifference, i);
            System.out.printf("a%d=%d%n", i, ithTerm);
        }
    }

    public static void main(String[] args) {
        int firstTerm, commonDifference, numberOfTerms;

        firstTerm = readFirstTerm();
        commonDifference = readCommonDifference();
        numberOfTerms = readNumberOfTerms();

        printAllTerms(firstTerm, commonDifference, numberOfTerms);

        int sum = sumOfAllTerms(firstTerm, commonDifference, numberOfTerms);
        System.out.println("Sum: " + sum);
    }
}
