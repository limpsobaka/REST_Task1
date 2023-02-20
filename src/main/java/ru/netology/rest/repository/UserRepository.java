package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.enums.Authorities;
import ru.netology.rest.model.User;

import java.util.*;

@Repository
public class UserRepository {
    private final HashMap<String, User> userList;

    public UserRepository() {
        userList = new HashMap<>();
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (userList.containsKey(user) && userList.get(user).getPassword().equals(password)) {
            return userList.get(user).getAuthorities();
        } else {
            return Collections.emptyList();
        }
    }
}