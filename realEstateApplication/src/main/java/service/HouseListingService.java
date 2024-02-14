package service;

import entity.BuyerRequirement;
import entity.House;
import repository.BuyerRequirementRepository;
import repository.HouseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Service class for generating house listings based on buyer requirements.
 */
public class HouseListingService {
    private final HouseRepository houseRepository;

    /**
     * Constructs a new HouseListingService with the specified HouseRepository.
     *
     * @param houseRepository The repository to store house listings.
     */
    public HouseListingService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;

    }

    /**
     * Generates house listings based on the maximum loan amount and buyer requirements.
     *
     * @param maxLoanAmount         The maximum loan amount.
     * @param squareFootageRequirement The square footage requirement.
     * @param bedroomsRequirement      The number of bedrooms requirement.
     * @param bathroomsRequirement     The number of bathrooms requirement.
     */

    public void generateHouseListings(double maxLoanAmount, int squareFootageRequirement, int bedroomsRequirement, int bathroomsRequirement) {
        houseRepository.clearListings();
        if (squareFootageRequirement < 250 || maxLoanAmount < 50000) {
            System.out.println("Your requirements do not meet the minimum criteria.");
            System.exit(0);
        }

        double maxSquareFootage = maxLoanAmount / 0.0125;

        if (squareFootageRequirement > maxSquareFootage) {
            System.out.println("Your square footage requirement exceeds the maximum allowed based on your loan amount.");
            System.exit(0);
        }

        int maxBedrooms = squareFootageRequirement / 400;

        if (bedroomsRequirement > maxBedrooms) {
            System.out.println("Your number of bedrooms requirement exceeds the maximum allowed based on your square footage requirement.");
            System.exit(0);
        }

        List<House> houseList = new ArrayList<>();
        Random random = new Random();


        int numberOfHouses = random.nextInt(11) + 2;

        double markupOrDiscount = 0.0;
        if (numberOfHouses < 7) {
            markupOrDiscount = 0.1;
        } else if (numberOfHouses > 10) {
            markupOrDiscount = -0.1;
        }

        while (houseList.size() < numberOfHouses) {
            double basePrice = maxLoanAmount * (1 + markupOrDiscount) * (random.nextDouble() * 0.2 + 0.9);
            if (basePrice > maxLoanAmount) {
                continue;
            }
            int squareFootage = random.nextInt((int) (basePrice / 1.0125) - 250) + 250;
            int maxBedroomsForHouse = squareFootage / 400;
            int bedrooms = Math.min(maxBedroomsForHouse, random.nextInt(maxBedroomsForHouse) + 1);
            int maxBathrooms = Math.min(bedrooms, squareFootage / 250);
            int bathrooms = random.nextInt(maxBathrooms) + 1;

            if (squareFootage < 250 ||
                    basePrice < 50000 ||
                    squareFootage > basePrice * 0.0125 ||
                    bedrooms > squareFootage / 400 ||
                    bathrooms > bedrooms ) {
                continue;
            }

            // Create a new house object and add it to the list
            House house = new House(basePrice, squareFootage, bedrooms, bathrooms);
            houseList.add(house);
        }

        // Add generated house listings to the repository
        houseRepository.addHouseListings(houseList);
    }

    /**
     * Prints the current house listings.
     */
    public void printHouseListing() {
        List<House> houseListings = houseRepository.getAllHouseListings();
        for (House house : houseListings) {
            System.out.println("Purchase Price: $" + house.getPurchasePrice());
            System.out.println("Square Footage: " + house.getSquareFootage());
            System.out.println("Bedrooms: " + house.getBedrooms());
            System.out.println("Bathrooms: " + house.getBathrooms());
            System.out.println("-------------------------------------");
        }
    }
}
