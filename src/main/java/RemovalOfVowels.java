import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isDigit;

public class RemovalOfVowels {

    public List<String> removeVowels(List<String> countryList)
    {
        if( countryList != null )
        {
            List<String> resString=new ArrayList<>();
            int listLength=countryList.size();
            if( listLength == 0 )
            {
                return null;
            }
            int stringLength;
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

    public static void main(String[] args)
    {
        RemovalOfVowels removalOfVowels=new RemovalOfVowels();
        List<String> string=new ArrayList<>();
        string.add("India");
        string.add("United States");
        string.add("Germany");
        string.add("Egypt");
        string.add("czechoslovakia");
        System.out.println(removalOfVowels.removeVowels(string));
    }
}
