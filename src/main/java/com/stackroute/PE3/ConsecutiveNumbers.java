/**
 * a program to find out if a series of 7 digits are consecutive numbers.
 * To make this easier, assume the digits are a string and use split()
 *  Input: 98,96,95,94,93
 *  Output: 98,96,95,94,93 non consecutive numbers
 *
 *  Input: 54,53,52,51,50,49,48
 *  Output : 54,53,52,51,50,49,48 are consecutive numbers
 */
package com.stackroute.PE3;

import java.util.InputMismatchException;

public class ConsecutiveNumbers {

    /*
    This method will take the string of consecutive Numbers and then split it and
    Check whether the numbers is consecutive or not.
     */
    public int checkConsecutiveNumber(String consecutiveNumber) {

        //If the String is not null
        if (consecutiveNumber != null) {
            //split the String on the basis of ,
            String splitString[] = consecutiveNumber.split(",");

            for( int i=0;i< splitString.length ; i++ )
            {
                try
                {
                    // Parsing the String to Integer
                    Integer.parseInt(splitString[i]);
                }
                catch (NumberFormatException e)
                {
                    System.out.println(e);
                    return 0;
                }
            }

            //Checking the whether they are consecutive in descreasing order
            if (Integer.parseInt(splitString[0]) == Integer.parseInt(splitString[1])+1 )
            {

                for (int i = 1; i < splitString.length; i++) {
                    if (Integer.parseInt(splitString[i]) + 1 != Integer.parseInt(splitString[i - 1])) {

                        return 0;
                    }
                }
                return 1;
            }
            //Checking the whether they are consecutive in increasing order
            else if (Integer.parseInt(splitString[0]) + 1 == Integer.parseInt(splitString[1])) {
                for (int i = 1; i < splitString.length; i++) {
                    if (Integer.parseInt(splitString[i]) != Integer.parseInt(splitString[i - 1]) + 1) {
                        return 0;
                    }
                }
                return 1;
            } else {
                return 0;
            }
        }

        return -1;
    }
}
