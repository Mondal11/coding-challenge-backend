package entity;

/**
 * Represents a house with attributes such as purchase price, square footage, number of bedrooms, and number of bathrooms.
 */
public class House {
    private double purchasePrice;
    private int squareFootage;
    private int bedrooms;
    private int bathrooms;

    /**
     * Constructs a House object with the specified purchase price, square footage, number of bedrooms, and number of bathrooms.
     *
     * @param purchasePrice The purchase price of the house.
     * @param squareFootage The square footage of the house.
     * @param bedrooms      The number of bedrooms in the house.
     * @param bathrooms     The number of bathrooms in the house.
     */
    public House(double purchasePrice, int squareFootage, int bedrooms, int bathrooms) {
        this.purchasePrice = purchasePrice;
        this.squareFootage = squareFootage;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    /**
     * Getter method for retrieving the purchase price of the house.
     *
     * @return The purchase price of the house.
     */
    public double getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Setter method for setting the purchase price of the house.
     *
     * @param purchasePrice The purchase price of the house.
     */
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * Getter method for retrieving the square footage of the house.
     *
     * @return The square footage of the house.
     */
    public int getSquareFootage() {
        return squareFootage;
    }

    /**
     * Setter method for setting the square footage of the house.
     *
     * @param squareFootage The square footage of the house.
     */
    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    /**
     * Getter method for retrieving the number of bedrooms in the house.
     *
     * @return The number of bedrooms in the house.
     */
    public int getBedrooms() {
        return bedrooms;
    }

    /**
     * Setter method for setting the number of bedrooms in the house.
     *
     * @param bedrooms The number of bedrooms in the house.
     */
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    /**
     * Getter method for retrieving the number of bathrooms in the house.
     *
     * @return The number of bathrooms in the house.
     */
    public int getBathrooms() {
        return bathrooms;
    }

    /**
     * Setter method for setting the number of bathrooms in the house.
     *
     * @param bathrooms The number of bathrooms in the house.
     */
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
}
