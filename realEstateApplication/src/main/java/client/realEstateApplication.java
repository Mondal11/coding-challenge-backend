package client;

import java.util.Scanner;

public class realEstateApplication {


    public static void main(String[] args) {

        // Prompt to the user to enter their annual income
        System.out.println("Welcome to the Loan Calculator!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your annual income: $");
        double annualIncome = scanner.nextDouble();

        // Calculating maximum loan amount
        double maximumLoanAmount = calculateMaximumLoan(annualIncome);
        System.out.println("Your maximum loan amount is: $" + maximumLoanAmount);
    }

    public static double calculateMaximumLoan(double annualIncome) {
        // Calculating max loan
        double monthlyIncome = annualIncome / 12;
        double maximumMonthlyPayment = monthlyIncome / 3;

        double totalLoanAmount = maximumMonthlyPayment * 0.5 * 12 * 30;
        double totalLoanInterest = maximumMonthlyPayment * 0.3 *12 * 30;
        double totalLoanTax = maximumMonthlyPayment * 0.2 * 12 * 30;

        // Applying loan restrictions
        if (totalLoanAmount < 50000) {
            System.out.println("Annual Income low to get a loan.");
            return 0;
        }

        return totalLoanAmount;
    }
}
