import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DayOfWeek {


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
