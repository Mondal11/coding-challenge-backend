package entity;

public class UserLoan {
    private double annualIncome;
    private double maxLoanAmount;

    public UserLoan() {
        // Default constructor
    }

    public UserLoan(double annualIncome, double maxLoanAmount) {
        this.annualIncome = annualIncome;
        this.maxLoanAmount = maxLoanAmount;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double getMaxLoanAmount() {
        return maxLoanAmount;
    }

    public void setMaxLoanAmount(double maxLoanAmount) {
        this.maxLoanAmount = maxLoanAmount;
    }
}
