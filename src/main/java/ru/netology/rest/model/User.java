package ru.netology.rest.model;

import ru.netology.rest.enums.Authorities;

import java.util.List;
import java.util.Objects;

public class User {
  private String userName;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user1 = (User) o;
    return Objects.equals(userName, user1.userName) && Objects.equals(password, user1.password) && Objects.equals(authorities, user1.authorities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password, authorities);
  }
}
