package repository;

import entity.Bill;

import java.util.ArrayList;
import java.util.List;

public class BillRepository {
    private List<Bill> billList;

    public BillRepository() {
        this.billList = new ArrayList<>();
    }

    public void addBill(Bill bill) {
        billList.add(bill);
    }

    public List<Bill> getAllBills() {
        return billList;
    }
    public void printBills() {
        System.out.println("-------------------------------------");
        System.out.println("Generated Bill:");
        System.out.println("-------------------------------------");
        for (int i = 0; i < billList.size(); i++) {
            Bill bill = billList.get(i);
            System.out.println("  House Details:");
            System.out.println("----------------------");
            System.out.println("    Full Purchase Price: $" + String.format("%.2f", bill.getBuyingHouse().getPurchasePrice()));
            System.out.println("    Square Footage: " + bill.getBuyingHouse().getSquareFootage());
            System.out.println("    Bedrooms: " + bill.getBuyingHouse().getBedrooms());
            System.out.println("    Bathrooms: " + bill.getBuyingHouse().getBathrooms());
            System.out.println("  Loan Lifetime Information:");
            System.out.println("----------------------------");
            System.out.println("    Total amount paid over the lifetime of the mortgage: $" + String.format("%.2f", bill.getTotalLoanAmount()));
            System.out.println("    Amount paid on the balance over the lifetime of the mortgage: $" + String.format("%.2f", bill.getTotalPrincipleAmount()));
            System.out.println("    Amount of interest paid over the lifetime of the mortgage: $" + String.format("%.2f", bill.getTotalLoanInterest()));
            System.out.println("    Amount of taxes & insurance paid over the lifetime of the mortgage: $" + String.format("%.2f", bill.getTotalLoanTaxesAndInsurance()));
            System.out.println("  Loan Monthly Information:");
            System.out.println("---------------------------");
            System.out.println("    Total monthly payment: $" + String.format("%.2f", bill.getMonthlyPayment()));
            System.out.println("    Amount being applied to balance each month: $" + String.format("%.2f", bill.getPrincipalPaidMonthly()));
            System.out.println("    Amount of interest paid each month: $" + String.format("%.2f", bill.getInterestPaidMonthly()));
            System.out.println("    Amount of taxes & insurance paid each month: $" + String.format("%.2f", bill.getTaxesAndInsurancePaidMonthly()));
            System.out.println("-------------------------------------");
        }
    }

}
