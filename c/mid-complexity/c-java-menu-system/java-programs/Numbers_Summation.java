import java.util.Scanner;
public class Numbers_Summation {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int limit;
        String option = "Y";
        while (option.equalsIgnoreCase("Y")) {
            int number = 1, summation = 0;
            System.out.println("\nEstablish a limit for the sequence of numbers: "); limit = input.nextInt();
            while (number <= limit) {
                if (number < limit) {
                    System.out.printf("%d + ", number);
                } else {
                    System.out.printf("%d", number);
                }
                summation += number;
                number++;
            }
            System.out.println("\nSummation: " + summation);
            option = System.console().readLine("\nAgain? Y/N: ");
        }
        System.out.println("Thank you for using the program :)");
        input.close();
    }
}
