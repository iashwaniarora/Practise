import java.util.Scanner;

/**
 * Created by ashwani on 8/13/16.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int integerArray[] = new int[arrayLength];
        for(int j =0;j<integerArray.length;j++)
        {
            integerArray[j]=scanner.nextInt();
        }


        for(int i =integerArray.length-1 ;i>=0;i--)
        {
            System.out.print(integerArray[i] +" ");
        }

    }
}
