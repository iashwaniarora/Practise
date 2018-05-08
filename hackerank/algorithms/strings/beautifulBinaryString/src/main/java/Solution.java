import java.util.Scanner;

/**
 * Created by ashwani on 8/7/16.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String len = scanner.nextLine();
        String binaryString = scanner.nextLine();
        //String binaryString="0101010";
        char charArray[]=binaryString.toCharArray();
        int noSteps=0;
        for(int i=0;i<charArray.length-2;i++)
        {
            if(charArray[i]=='0'&&charArray[i+1]=='1'&&charArray[i+2]=='0')
            {

                noSteps++;
               charArray[i+2]='1';
                i=i+2;
            }

        }
        System.out.println(noSteps);

    }
}
