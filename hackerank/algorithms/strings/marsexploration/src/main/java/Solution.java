import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ashwani_arora on 8/8/2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         String sosString =scanner.nextLine();
      // String sosString= "SOSOOSOSOSOSOSSOSOSOSOSOSOS";

        List<String> sosSubStrings = new LinkedList<String>();
        int count =0;
       for(int i=0;i<sosString.length()-2;i++)
       {
            if(sosString.charAt(i)!='S')
                count++;
           if(sosString.charAt(i+1)!='O')
               count++;
           if(sosString.charAt(i+2)!='S')
                count++;
           i=i+2;
            }


        System.out.println((count));
    }

}
