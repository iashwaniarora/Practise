import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ashwani on 8/13/16.
 */
public class Solution {




    public static void main(String[] args) {


       /* int arr[] = {1,2,3,4,5,6};
        int rotations=2;
        int arrayLength = arr.length;*/


        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int rotations = scanner.nextInt();
        int arr[] = new int[arrayLength];

        for(int i =0;i<arrayLength;i++)
        {
            arr[i]=scanner.nextInt();
        }


        int tempArr[] = new int[arr.length];
        int delta=arrayLength-rotations;
        for(int j=0;j<arrayLength;j++) {
            // calculate new position
            int newIndex = j-rotations;
            if(newIndex<0)
            {
                newIndex=arrayLength+newIndex;
            }
            tempArr[newIndex]=arr[j];


        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(tempArr[i]+" ");
        }
    }

}
