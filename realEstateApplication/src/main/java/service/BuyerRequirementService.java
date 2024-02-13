package service;

import entity.BuyerRequirement;
import repository.BuyerRequirementRepository;

public class BuyerRequirementService {
    private final BuyerRequirementRepository requirementRepository;

    public BuyerRequirementService(BuyerRequirementRepository requirementRepository) {
        this.requirementRepository = requirementRepository;
    }

    public void storeBuyerRequirements(int squareFootage, int bedrooms, int bathrooms) {
        BuyerRequirement requirement = new BuyerRequirement(squareFootage, bedrooms, bathrooms);
        requirementRepository.addBuyerRequirement(requirement);
    }
}
