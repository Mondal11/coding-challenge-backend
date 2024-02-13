package entity;

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

    public House getBuyingHouse() {
        return buyingHouse;
    }

    public void setBuyingHouse(House buyingHouse) {
        this.buyingHouse = buyingHouse;
    }

    public double getTotalLoanAmount() {
        return totalLoanAmount;
    }

    public void setTotalLoanAmount(double totalLoanAmount) {
        this.totalLoanAmount = totalLoanAmount;
    }

    public double getTotalPrincipleAmount() {
        return totalPrincipleAmount;
    }

    public void setTotalPrincipleAmount(double totalPrincipleAmount) {
        this.totalPrincipleAmount = totalPrincipleAmount;
    }

    public double getTotalLoanInterest() {
        return totalLoanInterest;
    }

    public void setTotalLoanInterest(double totalLoanInterest) {
        this.totalLoanInterest = totalLoanInterest;
    }

    public double getTotalLoanTaxesAndInsurance() {
        return totalLoanTaxesAndInsurance;
    }

    public void setTotalLoanTaxesAndInsurance(double totalLoanTaxesAndInsurance) {
        this.totalLoanTaxesAndInsurance = totalLoanTaxesAndInsurance;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getPrincipalPaidMonthly() {
        return principalPaidMonthly;
    }

    public void setPrincipalPaidMonthly(double principalPaidMonthly) {
        this.principalPaidMonthly = principalPaidMonthly;
    }

    public double getInterestPaidMonthly() {
        return interestPaidMonthly;
    }

    public void setInterestPaidMonthly(double interestPaidMonthly) {
        this.interestPaidMonthly = interestPaidMonthly;
    }

    public double getTaxesAndInsurancePaidMonthly() {
        return taxesAndInsurancePaidMonthly;
    }

    public void setTaxesAndInsurancePaidMonthly(double taxesAndInsurancePaidMonthly) {
        this.taxesAndInsurancePaidMonthly = taxesAndInsurancePaidMonthly;
    }
}
