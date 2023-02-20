package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.enums.Authorities;
import ru.netology.rest.model.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserRepository {
  private HashMap<String, User> userList;

  public UserRepository() {
    userList = new HashMap<>();
  }

  public List<Authorities> getUserAuthorities(User user) {
    if (userList.containsKey(user.getUser()) && userList.get(user.getUser()).equals(user.getPassword())) {
      return userList.get(user.getUser()).getAuthorities();
    } else {
      return Collections.emptyList();
    }
  }
}