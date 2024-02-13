package client;

import java.util.Scanner;
import entity.UserLoan;
import repository.BuyerRequirementRepository;
import repository.HouseRepository;
import service.BuyerRequirementService;
import service.HouseListingService;
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
            gatherBuyerRequirements(scanner, maxLoanAmount);
        } else {
            System.out.println("Sorry, your maximum loan amount is not sufficient to proceed with the buying process.");
        }
    }

    public static void gatherBuyerRequirements(Scanner scanner, double maxLoanAmount) {
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

        HouseRepository houseRepository = new HouseRepository();
        HouseListingService houseListingService = new HouseListingService(houseRepository);
        boolean regenerate = true;
        while (regenerate) {
            houseListingService.generateHouseListings(maxLoanAmount, squareFootage, bedrooms, bathrooms);
            System.out.println("-------------------------------------");
            System.out.println("House listings have been generated based on your requirements.");
            System.out.println("-------------------------------------");
            houseListingService.printHouseListing();

            System.out.println("Do you want to purchase a house or regenerate the listings?");
            System.out.println("1. Purchase a house");
            System.out.println("2. Regenerate listings");
            System.out.print("Enter your choice (1 or 2): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // lefy to implement house purchase logic
                    System.out.println("Purchase logic");
                    System.out.println("You have chosen to purchase a house.");
                    regenerate = false;
                    break;
                case 2:
                    System.out.println("You have chosen to regenerate the house listings.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }

    }
}
