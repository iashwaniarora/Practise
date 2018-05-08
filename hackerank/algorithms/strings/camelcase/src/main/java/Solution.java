import java.util.Scanner;

/**
 * Created by ashwani on 8/6/16.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

        char[] charString = string.toCharArray();
        long wordsCount =1;
        for(long i =1;i<charString.length;i++)
        {
            if(65<=(((int)charString[(int)i]))&&(((int)charString[(int)i]))<=90)
            {
                wordsCount++;
            }
        }
        System.out.println(wordsCount);
    }
}
