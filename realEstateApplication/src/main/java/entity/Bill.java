package entity;

/**
 * Represents a bill generated for a house purchase, containing information
 * about the loan, payments, and expenses per month.
 */
public class Bill {
    private House buyingHouse;
    private double totalLoanAmount;
    private double totalPrincipleAmount;
    private double totalLoanInterest;
    private double totalLoanTaxesAndInsurance;

    private double monthlyPayment;
    private double principalPaidMonthly;
    private double interestPaidMonthly;
    private double taxesAndInsurancePaidMonthly;

    /**
     * Getter method for retrieving the house being purchased.
     *
     * @return The house being purchased.
     */
    public House getBuyingHouse() {
        return buyingHouse;
    }

    /**
     * Setter method for setting the house being purchased.
     *
     * @param buyingHouse The house being purchased.
     */
    public void setBuyingHouse(House buyingHouse) {
        this.buyingHouse = buyingHouse;
    }

    /**
     * Getter method for retrieving the total loan amount.
     *
     * @return The total loan amount.
     */
    public double getTotalLoanAmount() {
        return totalLoanAmount;
    }

    /**
     * Setter method for setting the total loan amount.
     *
     * @param  totalLoanAmount The total loan Amount.
     */
    public void setTotalLoanAmount(double totalLoanAmount) {
        this.totalLoanAmount = totalLoanAmount;
    }

    /**
     * Getter method for retrieving the total principal amount paid over the lifetime of the mortgage.
     *
     * @return The total principal amount.
     */
    public double getTotalPrincipleAmount() {
        return totalPrincipleAmount;
    }

    /**
     * Setter method for setting the total principal amount paid over the lifetime of the mortgage.
     *
     * @param totalPrincipleAmount The total principal amount.
     */
    public void setTotalPrincipleAmount(double totalPrincipleAmount) {
        this.totalPrincipleAmount = totalPrincipleAmount;
    }

    /**
     * Getter method for retrieving the total loan interest paid over the lifetime of the mortgage.
     *
     * @return The total loan interest.
     */
    public double getTotalLoanInterest() {
        return totalLoanInterest;
    }

    /**
     * Setter method for setting the total loan interest paid over the lifetime of the mortgage.
     *
     * @param totalLoanInterest The total loan interest.
     */
    public void setTotalLoanInterest(double totalLoanInterest) {
        this.totalLoanInterest = totalLoanInterest;
    }

    /**
     * Getter method for retrieving the total loan taxes and insurance paid over the lifetime of the mortgage.
     *
     * @return The total loan taxes and insurance.
     */
    public double getTotalLoanTaxesAndInsurance() {
        return totalLoanTaxesAndInsurance;
    }

    /**
     * Setter method for setting the total loan taxes and insurance paid over the lifetime of the mortgage.
     *
     * @param totalLoanTaxesAndInsurance The total loan taxes and insurance.
     */
    public void setTotalLoanTaxesAndInsurance(double totalLoanTaxesAndInsurance) {
        this.totalLoanTaxesAndInsurance = totalLoanTaxesAndInsurance;
    }

    /**
     * Getter method for retrieving the monthly payment amount.
     *
     * @return The monthly payment.
     */
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    /**
     * Setter method for setting the monthly payment amount.
     *
     * @param monthlyPayment The monthly payment.
     */
    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    /**
     * Getter method for retrieving the principal amount paid monthly.
     *
     * @return The principal paid monthly.
     */
    public double getPrincipalPaidMonthly() {
        return principalPaidMonthly;
    }

    /**
     * Setter method for setting the principal amount paid monthly.
     *
     * @param principalPaidMonthly The principal paid monthly.
     */
    public void setPrincipalPaidMonthly(double principalPaidMonthly) {
        this.principalPaidMonthly = principalPaidMonthly;
    }

    /**
     * Getter method for retrieving the interest amount paid monthly.
     *
     * @return The interest paid monthly.
     */
    public double getInterestPaidMonthly() {
        return interestPaidMonthly;
    }

    /**
     * Setter method for setting the interest amount paid monthly.
     *
     * @param interestPaidMonthly The interest paid monthly.
     */
    public void setInterestPaidMonthly(double interestPaidMonthly) {
        this.interestPaidMonthly = interestPaidMonthly;
    }

    /**
     * Getter method for retrieving the taxes and insurance amount paid monthly.
     *
     * @return The taxes and insurance paid monthly.
     */
    public double getTaxesAndInsurancePaidMonthly() {
        return taxesAndInsurancePaidMonthly;
    }

    /**
     * Setter method for setting the taxes and insurance amount paid monthly.
     *
     * @param taxesAndInsurancePaidMonthly The taxes and insurance paid monthly.
     */
    public void setTaxesAndInsurancePaidMonthly(double taxesAndInsurancePaidMonthly) {
        this.taxesAndInsurancePaidMonthly = taxesAndInsurancePaidMonthly;
    }
}
