package ru.netology.rest.service;

import org.springframework.stereotype.Service;
import ru.netology.rest.enums.Authorities;
import ru.netology.rest.exception.InvalidCredentials;
import ru.netology.rest.exception.UnauthorizedUser;
import ru.netology.rest.model.User;
import ru.netology.rest.repository.UserRepository;

import java.util.List;

@Service
public class AuthorizationService {
  UserRepository userRepository;

  public AuthorizationService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<Authorities> getAuthorities(User user) {
    if (isEmpty(user.getUserName()) || isEmpty(user.getPassword())) {
      throw new InvalidCredentials("User name or password is empty");
    }
    List<Authorities> userAuthorities = userRepository.getUserAuthorities(user);
    if (isEmpty(userAuthorities)) {
      throw new UnauthorizedUser("Unknown user " + user.getUserName());
    }
    return userAuthorities;
  }

  private boolean isEmpty(String str) {
    return str == null || str.isEmpty();
  }

  private boolean isEmpty(List<?> str) {
    return str == null || str.isEmpty();
  }
}