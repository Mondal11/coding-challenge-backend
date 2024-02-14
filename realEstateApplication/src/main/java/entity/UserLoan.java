package entity;

/**
 * Represents a user's loan information including annual income and maximum loan amount.
 */
public class UserLoan {
    private double annualIncome;
    private double maxLoanAmount;

    /**
     * Constructs a UserLoan object with default values for annual income and maximum loan amount.
     */
    public UserLoan() {
        // Default constructor
    }

    /**
     * Constructs a UserLoan object with the specified annual income and maximum loan amount.
     *
     * @param annualIncome  The annual income of the user.
     * @param maxLoanAmount The maximum loan amount the user is eligible for.
     */
    public UserLoan(double annualIncome, double maxLoanAmount) {
        this.annualIncome = annualIncome;
        this.maxLoanAmount = maxLoanAmount;
    }

    /**
     * Getter method for retrieving the annual income of the user.
     *
     * @return The annual income of the user.
     */
    public double getAnnualIncome() {
        return annualIncome;
    }

    /**
     * Setter method for setting the annual income of the user.
     *
     * @param annualIncome The annual income of the user.
     */
    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    /**
     * Getter method for retrieving the maximum loan amount the user is eligible for.
     *
     * @return The maximum loan amount the user is eligible for.
     */
    public double getMaxLoanAmount() {
        return maxLoanAmount;
    }

    /**
     * Setter method for setting the maximum loan amount the user is eligible for.
     *
     * @param maxLoanAmount The maximum loan amount the user is eligible for.
     */
    public void setMaxLoanAmount(double maxLoanAmount) {
        this.maxLoanAmount = maxLoanAmount;
    }
}
