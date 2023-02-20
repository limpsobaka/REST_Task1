package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.enums.Authorities;
import ru.netology.rest.model.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
@Repository
public class UserRepository {
    private HashMap<String, String> userList;
    private HashMap<User, List<Authorities>> authoritiesList;

    public UserRepository() {
        userList = new HashMap<>();
        authoritiesList = new HashMap<>();
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (userList.get(user) != null && userList.get(user).equals(password)) {
            return authoritiesList.get(userList.get(user));
        } else {
            return Collections.emptyList();
        }
    }
}