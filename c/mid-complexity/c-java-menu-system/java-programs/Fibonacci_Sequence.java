import java.util.Scanner;
public class Fibonacci_Sequence {
    public static void main (String[] args) {
        int limit;
        String option = "Y";
        Scanner input = new Scanner(System.in);
        while (option.equalsIgnoreCase("Y")) {
            System.out.println("\nInput a number to establish the limit of the sequence: ");
            limit = input.nextInt();
            int element0 = 0, element1 = 1, sum = 0;
            System.out.printf("%d, %d", element0, element1);
            while (sum < limit) {
                sum = element0 + element1;
                System.out.printf(", %d", sum);
                element0 = element1;
                element1 = sum;
            }
            option = System.console().readLine("\n\nAgain? Y/N: ");
        }
        System.out.println("Thank you for using the program :)");
        input.close();
    }
}
