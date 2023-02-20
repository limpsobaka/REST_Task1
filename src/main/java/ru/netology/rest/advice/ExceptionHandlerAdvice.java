package ru.netology.rest.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.rest.exception.InvalidCredentials;
import ru.netology.rest.exception.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

  @ExceptionHandler(InvalidCredentials.class)
  public ResponseEntity<String> icHandler(InvalidCredentials invalidCredentials) {
    return new ResponseEntity<>(invalidCredentials.getMessage(), HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(UnauthorizedUser.class)
  public ResponseEntity<String> uaHandler(UnauthorizedUser unauthorizedUser) {
    System.out.format("UNAUTHORIZED_USER EXCEPTION: %s", unauthorizedUser.getMessage());
    return new ResponseEntity<>(unauthorizedUser.getMessage(), HttpStatus.UNAUTHORIZED);
  }
}
