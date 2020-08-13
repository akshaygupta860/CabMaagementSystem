package org.codejudge.sb.exception;

/**
 * @author akshaygupta01
 */
public class InvalidDriverLocation extends RuntimeException
{
    public InvalidDriverLocation(String str){
        super("InvalidDriverLocation"+str);
    }
}
