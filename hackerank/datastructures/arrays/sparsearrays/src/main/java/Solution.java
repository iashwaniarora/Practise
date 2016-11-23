import java.util.Scanner;

/**
 * Created by ashwani on 8/15/16.
 */
public class Solution {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfStrings = scanner.nextInt();
        String strArrays[] = new String[numberOfStrings];
        for(int i=0;i<numberOfStrings;i++)
        {
            strArrays[i]=scanner.next();
        }
        int numberOfQueries = scanner.nextInt();
        String []strQueries = new String[numberOfQueries];
        for(int i =0;i<numberOfQueries;i++)
        {
            strQueries[i]=scanner.next();
        }

        /*int numberOfStrings=4;
        String []strArrays= {"aba","baba","aba","xzxb"};
        int numberOfQueries = 3;
        String []strQueries= {"aba","xzxb","ab"};*/

        for(int i =0;i<strQueries.length;i++)
        {
            int count =0;
            for(int j=0;j<strArrays.length;j++)
            {

                if(strQueries[i].equals(strArrays[j]))
                {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
