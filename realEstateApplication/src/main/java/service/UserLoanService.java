package service;

import entity.UserLoan;
import repository.UserLoanRepository;

public class UserLoanService {
    private final UserLoanRepository userLoanRepository = new UserLoanRepository();
    public void generateMaximumLoan(UserLoan userLoan) {
        double monthlyIncome = userLoan.getAnnualIncome() / 12;
        double maxMonthlyPayment = monthlyIncome / 3;

        double totalLoanAmount = maxMonthlyPayment * 360 * 0.5; // 30 years = 360 months

        double totalLoanInterest = totalLoanAmount * 360 * 0.3;
        double totalLoanInsurance = totalLoanAmount * 360 * 0.2;
        userLoan.setMaxLoanAmount(totalLoanAmount >= 50000 ? totalLoanAmount : 0);
        userLoanRepository.addUserLoanDetails(userLoan);

    }
}
