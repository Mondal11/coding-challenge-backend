package repository;

import entity.UserLoan;

import java.util.ArrayList;
import java.util.List;

public class UserLoanRepository {
    private List<UserLoan> userList;

    public UserLoanRepository() {
        this.userList = new ArrayList<>();
    }

    public void addUserLoanDetails(UserLoan userLoan) {
        userList.add(userLoan);
    }

    public List<UserLoan> getAllUsersLoanDetails() {
        return userList;
    }

}
