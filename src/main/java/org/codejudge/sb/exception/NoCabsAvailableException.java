package org.codejudge.sb.exception;

/**
 * @author akshaygupta01
 */
public class NoCabsAvailableException extends RuntimeException
{
    public NoCabsAvailableException(String str){
        super("No cabs available!"+str);
    }
}
