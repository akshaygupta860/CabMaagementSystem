package org.codejudge.sb.validator;

import org.codejudge.sb.dto.Request;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface Validator
{
   // public boolean isValid(Request request);
    public boolean isValidEmail(String email);
    public boolean isValidMobile(BigInteger mobile);
}
