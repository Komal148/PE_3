/**
 * a program to set up an array of places, Loop round and remove the vowels.
 * Display the new words in console
 *  Input:
 *     India
 *     United States
 *     Germany
 *      Egypt
 *      czechoslovakia
 *      Output:
 *     Place Name without Vowels:0 Ind
 *     Place Name without Vowels:1 Untd Stts
 *     Place Name without Vowels:2 Grmny
 *     Place Name without Vowels:3 Egypt
 *     Place Name without Vowels:4 czchslvk
 */
package com.stackroute.PE3;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isDigit;

public class RemovalOfVowels {

    /*
    This method will remove the vowels from the List of Strings excluding
    the first postion vowel.
     */
    public List<String> removeVowels(List<String> countryList)
    {
        //Checking the countryList is null or not
        if( countryList != null )
        {
            List<String> resString=new ArrayList<>();
            int listLength=countryList.size();
            if( listLength == 0 )
            {
                return null;
            }
            int stringLength;
            //Looping through the list and remove the vowels from each entry.
            for(int i=0;i<listLength ;i++ )
            {
                stringLength=countryList.get(i).length();
                String country=countryList.get(i);
                String resCountry="";
                int flag=0;
                for(char ch : country.toCharArray())
                {

                    if( isDigit(ch))
                    {
                        //Return back if digit comes
                        resString.add("Digit is present in String");
                        return resString;

                    }
                    if( ch != 'a' && ch !='A' && ch != 'e' && ch != 'E' && ch != 'i' && ch != 'I' && ch != 'o' && ch !='O' && ch != 'U' && ch !='u' || flag == 0 )
                    {
                        resCountry=resCountry+ch;

                        flag=1;
                    }

                }
                resString.add(resCountry);
            }
            return resString;
        }
        return null;
    }
}
