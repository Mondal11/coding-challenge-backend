package service;

import entity.Bill;
import entity.House;
import repository.BillRepository;

/**
 * Service class for generating bills based on house purchased by thr user.
 */
public class BillGenerationService {
    private final BillRepository billRepository;

    /**
     * Constructs a new BillGenerationService with the specified BillRepository.
     *
     * @param billRepository The repository to store generated bills.
     */
    public BillGenerationService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    /**
     * Generates a bill for the specified house and stores it in the repository.
     *
     * @param house The house for which the bill is generated.
     */
    public void generateBill(House house) {
        double totalLoanAmount = house.getPurchasePrice();
        Bill bill = new Bill();
        bill.setBuyingHouse(house);

        // Calculate lifetime information
        double totalPrincipal = calculateTotalPrinciple(totalLoanAmount);
        double totalInterest = calculateTotalInterest(totalLoanAmount);
        double totalTaxesAndInsurance = calculateTotalTaxesAndInsurance(totalLoanAmount);

        bill.setTotalLoanAmount(totalLoanAmount);
        bill.setTotalPrincipleAmount(totalPrincipal);
        bill.setTotalLoanInterest(totalInterest);
        bill.setTotalLoanTaxesAndInsurance(totalTaxesAndInsurance);

        // Calculate monthly information
        int totalMonths = 360;
        double monthlyPayment = totalLoanAmount / totalMonths;
        double monthlyPrinciple = totalPrincipal / totalMonths;
        double monthlyInterest = totalInterest / totalMonths;
        double monthlyTaxesAndInsurance = totalTaxesAndInsurance / totalMonths;

        bill.setMonthlyPayment(monthlyPayment);
        bill.setPrincipalPaidMonthly(monthlyPrinciple);
        bill.setInterestPaidMonthly(monthlyInterest);
        bill.setTaxesAndInsurancePaidMonthly(monthlyTaxesAndInsurance);

        billRepository.addBill(bill);

    }

    /**
     * Calculates the total principal amount of the loan.
     *
     * @param totalLoanAmount The total loan amount.
     * @return The total principal amount.
     */
    private double calculateTotalPrinciple(double totalLoanAmount) {
        return totalLoanAmount * 0.5;
    }

    /**
     * Calculates the total interest amount of the loan.
     *
     * @param totalLoanAmount The total loan amount.
     * @return The total interest amount.
     */
    private double calculateTotalInterest(double totalLoanAmount) {
        return totalLoanAmount * 0.3;
    }

    /**
     * Calculates the total taxes and insurance amount of the loan.
     *
     * @param totalLoanAmount The total loan amount.
     * @return The total taxes and insurance amount.
     */
    private double calculateTotalTaxesAndInsurance(double totalLoanAmount) {
        return totalLoanAmount * 0.2;
    }

}
