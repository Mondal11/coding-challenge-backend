package repository;

import entity.BuyerRequirement;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository class for managing buyer requirements for house purchases.
 */
public class BuyerRequirementRepository {
    private final List<BuyerRequirement> requirementList;

    /**
     * Constructs a new BuyerRequirementRepository object with an empty list of buyer requirements.
     */
    public BuyerRequirementRepository() {
        this.requirementList = new ArrayList<>();
    }

    /**
     * Adds a buyer requirement to the repository.
     *
     * @param requirement The buyer requirement to be added.
     */
    public void addBuyerRequirement(BuyerRequirement requirement) {
        requirementList.add(requirement);
    }

    /**
     * Retrieves all the buyer requirements stored in the repository.
     *
     * @return A list of all buyer requirements stored in the repository.
     */
    public List<BuyerRequirement> getAllBuyerRequirements() {
        return requirementList;
    }
}
