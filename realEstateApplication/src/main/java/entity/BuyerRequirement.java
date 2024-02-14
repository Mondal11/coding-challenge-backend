package entity;

/**
 * Represents the requirements of a buyer for a house, including square footage, bedrooms, and bathrooms.
 */
public class BuyerRequirement {
    private int squareFootage;
    private int bedrooms;
    private int bathrooms;

    /**
     * Constructs a BuyerRequirement object with the specified square footage, number of bedrooms, and number of bathrooms.
     *
     * @param squareFootage The required square footage.
     * @param bedrooms      The required number of bedrooms.
     * @param bathrooms     The required number of bathrooms.
     */
    public BuyerRequirement(int squareFootage, int bedrooms, int bathrooms) {
        this.squareFootage = squareFootage;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    /**
     * Getter method for retrieving the required square footage.
     *
     * @return The required square footage.
     */
    public int getSquareFootage() {
        return squareFootage;
    }

    /**
     * Setter method for setting the required square footage.
     *
     * @param squareFootage The required square footage.
     */
    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    /**
     * Getter method for retrieving the required number of bedrooms.
     *
     * @return The required number of bedrooms.
     */
    public int getBedrooms() {
        return bedrooms;
    }

    /**
     * Setter method for setting the required number of bedrooms.
     *
     * @param bedrooms The required number of bedrooms.
     */
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    /**
     * Getter method for retrieving the required number of bathrooms.
     *
     * @return The required number of bathrooms.
     */
    public int getBathrooms() {
        return bathrooms;
    }

    /**
     * Setter method for setting the required number of bathrooms.
     *
     * @param bathrooms The required number of bathrooms.
     */
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
}
