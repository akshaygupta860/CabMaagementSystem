package org.codejudge.sb;

/**
 * @author akshaygupta01
 */
public class Utility
{
    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.trim().isEmpty())
            return false;
        return true;
    }
}
