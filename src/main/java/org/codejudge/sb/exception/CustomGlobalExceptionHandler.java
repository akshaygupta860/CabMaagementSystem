package org.codejudge.sb.exception;

import org.codejudge.sb.constant.Status;
import org.codejudge.sb.dto.ErrorDto;
import org.codejudge.sb.dto.MessageDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InvalidRegistrationDetail.class)
    public ResponseEntity<ErrorDto> invalidDriverRegistration(HttpServletResponse response) throws IOException {
        ErrorDto errorDto = new ErrorDto();
        errorDto.setReason("Something went wrong while driver onboarding");
        errorDto.setStatus(Status.failure.toString());
        return new ResponseEntity<>(errorDto,
                new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidDriverLocation.class)
    public ResponseEntity<ErrorDto> invalidDriverLocation(HttpServletResponse response) throws IOException {
        ErrorDto errorDto = new ErrorDto();
        errorDto.setReason("Driver location is not proper");
        errorDto.setStatus(Status.failure.toString());
        return new ResponseEntity<>(errorDto,
                new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoCabsAvailableException.class)
    public ResponseEntity<MessageDto> NoCabsAvailableException(HttpServletResponse response) throws IOException {
        MessageDto messageDto = new MessageDto();
        messageDto.setMessage("No cabs available!");
        return new ResponseEntity<>(messageDto,
                new HttpHeaders(), HttpStatus.OK);
    }

}