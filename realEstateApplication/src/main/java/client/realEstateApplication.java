package client;

import java.util.Scanner;
import entity.UserLoan;
import repository.BuyerRequirementRepository;
import service.BuyerRequirementService;
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
        double annualIncome = scanner.nextDouble();

        UserLoan userLoan = new UserLoan();
        userLoan.setAnnualIncome(annualIncome);

        // Generate loan to be getting
        UserLoanService loanService = new UserLoanService();
        loanService.generateMaximumLoan(userLoan);

        // Display the maximum loan amount calculated
        double maxLoanAmount = userLoan.getMaxLoanAmount();
        if (maxLoanAmount >= 50000) {
            System.out.println("Your maximum loan amount is: $" + maxLoanAmount);
            gatherBuyerRequirements(scanner);
        } else {
            System.out.println("Sorry, your maximum loan amount is not sufficient to proceed with the buying process.");
        }
    }

    public static void gatherBuyerRequirements(Scanner scanner) {
        System.out.println("Your maximum loan amount is sufficient to proceed.");

        // Gathering user requirements
        System.out.print("Please enter the square footage you are looking for: ");
        int squareFootage = scanner.nextInt();

        System.out.print("Please enter the number of bedrooms you are looking for: ");
        int bedrooms = scanner.nextInt();

        System.out.print("Please enter the number of bathrooms you are looking for: ");
        int bathrooms = scanner.nextInt();

        BuyerRequirementRepository requirementRepository = new BuyerRequirementRepository();
        BuyerRequirementService requirementService = new BuyerRequirementService(requirementRepository);

        //Storing the requirements
        requirementService.storeBuyerRequirements(squareFootage, bedrooms, bathrooms);


        System.out.println("Buyer requirements:");
        System.out.println("Square Footage: " + squareFootage);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + bathrooms);
    }
}
