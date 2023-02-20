package ru.netology.rest.model;

import ru.netology.rest.enums.Authorities;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Objects;

public class User {
  @NotBlank
  private String user;
  @NotBlank
  private String password;
  private List<Authorities> authorities;

  public User() {
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
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
    return Objects.equals(user, user1.user) && Objects.equals(password, user1.password) && Objects.equals(authorities, user1.authorities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, password, authorities);
  }
}
