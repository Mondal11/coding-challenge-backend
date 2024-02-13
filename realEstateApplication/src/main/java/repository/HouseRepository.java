package repository;

import entity.House;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    private final List<House> houseListings;

    public HouseRepository() {
        this.houseListings = new ArrayList<>();
    }

    public void addHouseListings(List<House> houseList) {
        houseListings.addAll(houseList);
    }

    public List<House> getAllHouseListings() {
        return houseListings;
    }
}
