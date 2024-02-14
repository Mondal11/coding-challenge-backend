package service;

import entity.BuyerRequirement;
import repository.BuyerRequirementRepository;

/**
 * Service class for managing buyer requirements.
 */
public class BuyerRequirementService {
    private final BuyerRequirementRepository requirementRepository;

    /**
     * Constructs a new BuyerRequirementService with the specified BuyerRequirementRepository.
     *
     * @param requirementRepository The repository to store buyer requirements.
     */
    public BuyerRequirementService(BuyerRequirementRepository requirementRepository) {
        this.requirementRepository = requirementRepository;
    }

    /**
     * Stores the buyer requirements with the specified square footage, number of bedrooms, and number of bathrooms.
     *
     * @param squareFootage The square footage requirement.
     * @param bedrooms      The number of bedrooms requirement.
     * @param bathrooms     The number of bathrooms requirement.
     */
    public void storeBuyerRequirements(int squareFootage, int bedrooms, int bathrooms) {
        BuyerRequirement requirement = new BuyerRequirement(squareFootage, bedrooms, bathrooms);
        requirementRepository.addBuyerRequirement(requirement);
    }
}
