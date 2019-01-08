import java.util.InputMismatchException;

public class ConsecutiveNumbers {
    public int checkConsecutiveNumber(String consecutiveNumber) {
        if (consecutiveNumber != null) {

            String splitString[] = consecutiveNumber.split(",");

            for( int i=0;i< splitString.length ; i++ )
            {
                try
                {
                    Integer.parseInt(splitString[i]);
                }
                catch (NumberFormatException e)
                {
                    System.out.println(e);
                    return 0;
                }
            }

            if (Integer.parseInt(splitString[0]) == Integer.parseInt(splitString[1])+1 )
            {

                for (int i = 1; i < splitString.length; i++) {
                    if (Integer.parseInt(splitString[i]) + 1 != Integer.parseInt(splitString[i - 1])) {

                        return 0;
                    }
                }
                return 1;
            } else if (Integer.parseInt(splitString[0]) + 1 == Integer.parseInt(splitString[1])) {
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
