package org.codejudge.sb.exception;

public class InvalidRegistrationDetail extends RuntimeException {

    public InvalidRegistrationDetail(String str){
        super("InvalidRegistrationDetail"+str);
    }
}
