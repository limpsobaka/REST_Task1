package ru.netology.rest.model;

import ru.netology.rest.enums.Authorities;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class User {
  @NotBlank
  private String userName;
  @NotBlank
  private String password;
  private List<Authorities> authorities;

  public User() {
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Authorities> getAuthorities() {
    return authorities;
  }

  public void setAuthorities(Authorities authorities) {
    this.authorities.add(authorities);
  }
}
