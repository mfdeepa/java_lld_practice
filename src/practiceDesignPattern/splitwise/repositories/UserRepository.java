package practiceDesignPattern.splitwise.repositories;

import practiceDesignPattern.splitwise.models.User;

import java.util.ArrayList;
import java.util.List;
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers(List<User> users) {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
