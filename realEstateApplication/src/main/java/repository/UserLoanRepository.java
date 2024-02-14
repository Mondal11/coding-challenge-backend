package repository;

import entity.UserLoan;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository class for managing user loan details.
 */
public class UserLoanRepository {
    private List<UserLoan> userList;

    /**
     * Constructs a new UserLoanRepository object with an empty list of user loan details.
     */
    public UserLoanRepository() {
        this.userList = new ArrayList<>();
    }

    /**
     * Adds user loan details to the repository.
     *
     * @param userLoan The user loan details to be added.
     */
    public void addUserLoanDetails(UserLoan userLoan) {
        userList.add(userLoan);
    }

    /**
     * Retrieves all the user loan details stored in the repository.
     *
     * @return A list of all user loan details stored in the repository.
     */
    public List<UserLoan> getAllUsersLoanDetails() {
        return userList;
    }

}
