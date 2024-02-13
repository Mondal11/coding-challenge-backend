package client;

import entity.UserLoan;
import service.UserLoanService;

import java.util.Scanner;

public class realEstateApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to the Estate Buying Application!");
        gatherUserInfo();
    }

    public static void gatherUserInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your annual income: $ ");

        // Read the user's input for annual income
        double annualIncome = scanner.nextDouble();

        UserLoan userLoan = new UserLoan();

        // Set the annual income obtained from user input
        userLoan.setAnnualIncome(annualIncome);

        // Create an instance of UserLoanService
        UserLoanService loanService = new UserLoanService();

        // Generate the maximum loan amount based on the user's input
        loanService.generateMaximumLoan(userLoan);

        // Display the maximum loan amount calculated
        double maxLoanAmount = userLoan.getMaxLoanAmount();
        System.out.println("Your maximum loan amount is: $" + maxLoanAmount);
    }
}
