package repository;

import entity.House;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository class for managing house listings.
 */
public class HouseRepository {
    private final List<House> houseListings;

    /**
     * Constructs a new HouseRepository object with an empty list of house listings.
     */
    public HouseRepository() {
        this.houseListings = new ArrayList<>();
    }

    /**
     * Adds a list of house listings to the repository.
     *
     * @param houseList The list of house listings to be added.
     */
    public void addHouseListings(List<House> houseList) {
        houseListings.addAll(houseList);
    }

    /**
     * Retrieves all the house listings stored in the repository.
     *
     * @return A list of all house listings stored in the repository.
     */
    public List<House> getAllHouseListings() {
        return houseListings;
    }

    /**
     * Clears all house listings from the repository.
     */
    public void clearListings() {
        houseListings.clear();
    }
}
