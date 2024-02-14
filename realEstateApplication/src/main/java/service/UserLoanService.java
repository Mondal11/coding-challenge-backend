package service;

import entity.UserLoan;
import repository.UserLoanRepository;

/**
 * Service class for generating maximum loan amount based on user's annual income.
 */
public class UserLoanService {

    private final UserLoanRepository userLoanRepository = new UserLoanRepository();

    /**
     * Generates the maximum loan amount based on the user's annual income.
     *
     * @param userLoan The UserLoan object containing the user's annual income.
     */
    public void generateMaximumLoan(UserLoan userLoan) {
        double monthlyIncome = userLoan.getAnnualIncome() / 12;
        double maxMonthlyPayment = monthlyIncome / 3;

        double totalLoanAmount = maxMonthlyPayment * 360 * 0.5;

        double totalLoanInterest = totalLoanAmount * 360 * 0.3;
        double totalLoanInsurance = totalLoanAmount * 360 * 0.2;
        userLoan.setMaxLoanAmount(totalLoanAmount >= 50000 ? totalLoanAmount : 0);
        userLoanRepository.addUserLoanDetails(userLoan);

    }
}
