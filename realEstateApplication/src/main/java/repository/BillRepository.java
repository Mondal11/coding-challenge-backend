package repository;

import entity.Bill;

import java.util.ArrayList;
import java.util.List;
/**
 * Repository class for managing bills generated for house purchases.
 */
public class BillRepository {
    private List<Bill> billList;

    /**
     * Constructs a new BillRepository object with an empty list of bills.
     */
    public BillRepository() {
        this.billList = new ArrayList<>();
    }

    /**
     * Adds a bill to the repository.
     *
     * @param bill The bill to be added.
     */
    public void addBill(Bill bill) {
        billList.add(bill);
    }

    /**
     * Retrieves all the bills stored in the repository in our case
     * there is only one bill every time the application is run.
     *
     * @return A list of all bills stored in the repository.
     */
    public List<Bill> getAllBills() {
        return billList;
    }


    /**
     * Retrieves all the bills stored in the repository in our case
     * there is only one bill every time the application is run.
     *
     * Print the bill generated for the user buying the house.
     */
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
