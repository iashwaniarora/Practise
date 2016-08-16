import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ashwani on 8/13/16.
 */
public class Solution {




    public static void main(String[] args) {

/*
        int arr[] = {1,2,3,4,5,6};
        int rotations=3;*/

        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int rotations = scanner.nextInt();

        int arr[] = new int[arrayLength];
        for(int i =0;i<arrayLength;i++)
        {
            arr[i]=scanner.nextInt();
        }

        int tempArr[] = new int[arr.length];
        for(int j=0;j<rotations;j++) {
            for (int i = 0; i < arr.length-1; i++) {

                tempArr[i]=arr[i+1];

            }
            tempArr[arr.length-1]=arr[0];
            arr=tempArr.clone();

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
