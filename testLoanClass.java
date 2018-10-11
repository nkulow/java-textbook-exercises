import java.util.Scanner;

public class testLoanClass {
    // main method //
    public static void main(String[] args) {
        // Scanner //
        Scanner input = new Scanner(System.in);

        // enter annual interest rate //
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        //enter number of years //
        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();

        // enter loan amount //
        System.out.print("Loan amount: ");
        double loanAmount = input.nextDouble();

        // create loan object //
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // display loan date, monthly payment, and total payment //
        System.out.println("\n\nLoan date: " + loan.getLoanDate());
        System.out.printf(
        "\nMonthly payment: %1.2f\nTotal payment: %1.2f\n", loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}
