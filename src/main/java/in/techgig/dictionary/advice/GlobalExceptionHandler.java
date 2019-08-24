package in.techgig.dictionary.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
 @ExceptionHandler(MyCustomException.class)
 public ResponseEntity<?> customeException(MyCustomException ex, WebRequest request) {
  ErrorDetails errorDetails = new ErrorDetails(HttpStatus.NOT_FOUND, ex.getMessage(), request.getDescription(false));
  return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
 }
 
 
 @ExceptionHandler(Exception.class)
 public ResponseEntity<?> globleExcpetionHandler(Exception ex, WebRequest request) {
  ErrorDetails errorDetails = new ErrorDetails(HttpStatus.BAD_REQUEST, ex.getMessage(), request.getDescription(false));
  return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
 }
 
}