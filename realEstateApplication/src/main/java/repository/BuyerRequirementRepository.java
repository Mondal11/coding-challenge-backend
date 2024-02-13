package repository;

import entity.BuyerRequirement;

import java.util.ArrayList;
import java.util.List;

public class BuyerRequirementRepository {
    private final List<BuyerRequirement> requirementList;

    public BuyerRequirementRepository() {
        this.requirementList = new ArrayList<>();
    }

    public void addBuyerRequirement(BuyerRequirement requirement) {
        requirementList.add(requirement);
    }

    public List<BuyerRequirement> getAllBuyerRequirements() {
        return requirementList;
    }
}
