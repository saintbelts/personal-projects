public class Fractions_Summation {
    public static void main (String[] args) {
        String option = "Y";
        while (option.equalsIgnoreCase("Y")) {
            int limit = Integer.parseInt(System.console().readLine("\nEstablish limit: "));
            double numerator = 1, denominator = 1, summation = 0;
            while (denominator <= limit) {
                summation += numerator / denominator;
                if (denominator < limit) {
                    System.out.printf("%.0f/%.0f + ", numerator, denominator);
                } else {
                    System.out.printf("%.0f/%.0f.", numerator, denominator);
                }
                denominator++;
            }
            System.out.printf("\nSummation: %.2f ", summation);
            option = System.console().readLine("\n\nAgain? Y/N: ");
        }
        System.out.println("Thank you for using the program :)");
    }
}
