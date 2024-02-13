package entity;

public class BuyerRequirement {
    private int squareFootage;
    private int bedrooms;
    private int bathrooms;

    public BuyerRequirement(int squareFootage, int bedrooms, int bathrooms) {
        this.squareFootage = squareFootage;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }


    public int getSquareFootage() {
        return squareFootage;
    }
    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getBedrooms() {
        return bedrooms;
    }
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
}
