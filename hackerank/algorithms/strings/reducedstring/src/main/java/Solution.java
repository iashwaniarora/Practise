import java.util.Scanner;

/**
 * Created by ashwani_arora on 7/26/2016.
 */
public class Solution {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fullString = scanner.next();
        for(int i=0;i<fullString.length()-1;i++)
        {
            if(fullString.charAt(i)==fullString.charAt(i+1))
            {
              fullString= fullString.substring(0,i)+fullString.substring(i+2,fullString.length());
                 i=-1;;
            }

        }

        if (fullString.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println (fullString);
        }
    }

}
