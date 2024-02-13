package service;

import entity.House;
import repository.HouseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HouseListingService {
    private final HouseRepository houseRepository;

    public HouseListingService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public void generateHouseListings(double maxLoanAmount, int squareFootageRequirement, int bedroomsRequirement, int bathroomsRequirement) {
        if (squareFootageRequirement < 250 || maxLoanAmount < 50000) {
            System.out.println("Your requirements do not meet the minimum criteria.");
            return;
        }
        double maxSquareFootage = maxLoanAmount / 0.0125;

        if (squareFootageRequirement > maxSquareFootage) {
            System.out.println("Your square footage requirement exceeds the maximum allowed based on your loan amount.");
            return;
        }

        int maxBedrooms = squareFootageRequirement / 400;
        if (bedroomsRequirement > maxBedrooms) {
            System.out.println("Your number of bedrooms requirement exceeds the maximum allowed based on your square footage requirement.");
            return;
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

        for (int i = 0; i < numberOfHouses; i++) {
            double basePrice = maxLoanAmount * (random.nextDouble() * 0.2 + 0.9);
            int squareFootage = random.nextInt((int) (basePrice / 1.0125) - 250) + 250;
            double pricePerSquareFeet = basePrice / squareFootage;
            int bedrooms = random.nextInt(squareFootage / 400) + 1;
            int maxBathrooms = Math.min(bedrooms, squareFootage / 250);
            int bathrooms = random.nextInt(maxBathrooms) + 1;

            if (squareFootage < 250 || basePrice < 50000 || squareFootage > basePrice * 0.0125 ||
                    bedrooms > squareFootage / 400 || bathrooms > bedrooms) {
                continue;
            }
            House house = new House(basePrice, squareFootage, bedrooms, bathrooms);
            houseList.add(house);
        }
        while(houseList.size() < 2) {
            double basePrice = maxLoanAmount * (1 + markupOrDiscount) * (random.nextDouble() * 0.2 + 0.9);
            int squareFootage = random.nextInt((int) (basePrice / 1.0125) - 250) + 250;
            double pricePerSquareFeet = basePrice / squareFootage;
            int bedrooms = random.nextInt(squareFootage / 400) + 1;
            int maxBathrooms = Math.min(bedrooms, squareFootage / 250);
            int bathrooms = random.nextInt(maxBathrooms) + 1;


            if (squareFootage < 250 || basePrice < 50000 || squareFootage > basePrice * 0.0125 ||
                    bedrooms > squareFootage / 400 || bathrooms > bedrooms) {

                continue;
            }

            House house = new House(basePrice, squareFootage, bedrooms, bathrooms);
            houseList.add(house);
        }

        houseRepository.addHouseListings(houseList);
    }
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
