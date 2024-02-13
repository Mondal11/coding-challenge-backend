package client;

import java.util.List;
import java.util.Scanner;

import entity.House;
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
        houseListingService.generateHouseListings(maxLoanAmount, squareFootage, bedrooms, bathrooms);
        boolean regenerate = true;
        while (regenerate) {
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
                    System.out.println("You have chosen to purchase a house.");
                    List<House> houseListings = houseRepository.getAllHouseListings();
                    if (houseListings.isEmpty()) {
                        System.out.println("There are no houses available for purchase.");
                        break;
                    }

                    System.out.println("Available houses for purchase:");
                    for (int i = 0; i < houseListings.size(); i++) {
                        House house = houseListings.get(i);
                        System.out.println("Option: "+(i + 1) );
                        System.out.println("   Purchase Price: $" + house.getPurchasePrice());
                        System.out.println("   Square Footage: " + house.getSquareFootage());
                        System.out.println("   Bedrooms: " + house.getBedrooms());
                        System.out.println("   Bathrooms: " + house.getBathrooms());
                        System.out.println("-------------------------------------");
                    }

                    System.out.print("Enter the option number of the house you want to purchase: ");
                    int purchaseNumber = scanner.nextInt();

                    if (purchaseNumber < 1 || purchaseNumber > houseListings.size()) {
                        System.out.println("-------------------------------------");
                        System.out.println("Invalid house number. Please enter a valid number.");
                        continue;
                    }

                    House selectedHouse = houseListings.get(purchaseNumber - 1);
                    System.out.println("You have purchased the following house:");
                    System.out.println("Purchase Price: $" + selectedHouse.getPurchasePrice());
                    System.out.println("Square Footage: " + selectedHouse.getSquareFootage());
                    System.out.println("Bedrooms: " + selectedHouse.getBedrooms());
                    System.out.println("Bathrooms: " + selectedHouse.getBathrooms());

                    regenerate = false;
                    break;

                case 2:
                    System.out.println("You have chosen to regenerate the house listings.");
                    houseListingService.generateHouseListings(maxLoanAmount, squareFootage, bedrooms, bathrooms);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }
}
