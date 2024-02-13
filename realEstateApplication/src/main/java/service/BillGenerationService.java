package service;

import entity.Bill;
import entity.House;
import repository.BillRepository;

public class BillGenerationService {
    private final BillRepository billRepository;

    public BillGenerationService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

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

    private double calculateTotalPrinciple(double totalLoanAmount) {
        return totalLoanAmount * 0.5;
    }

    private double calculateTotalInterest(double totalLoanAmount) {
        return totalLoanAmount * 0.3;
    }

    private double calculateTotalTaxesAndInsurance(double totalLoanAmount) {
        return totalLoanAmount * 0.2;
    }

}
