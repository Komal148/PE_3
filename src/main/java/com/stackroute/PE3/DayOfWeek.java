/**
 * a java program to calculate first and last date of a week.
 *   Output:
 *   First Date of Week:             Mon 24/07/2017
 *   Last date of the week:          Sun 30/07/2017
 */
package com.stackroute.PE3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DayOfWeek {

        /*
        This method will compute the first and last day. and return it in the form String
         */
        public String firstAndLastDay(){
            String firstLastDay="";
            Calendar c = Calendar.getInstance();
            c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEE");
            firstLastDay=df.format(c.getTime())+"\n";
            for (int i = 0; i <6; i++) {
                c.add(Calendar.DATE, 1);
            }
            firstLastDay=firstLastDay+df.format(c.getTime());
            return firstLastDay;
        }

}
