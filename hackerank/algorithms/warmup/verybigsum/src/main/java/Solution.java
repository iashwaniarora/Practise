/**
 * Created by ashwani_arora on 7/6/2016.
 */

import java.util.Scanner;

/**
 * You are given an array of integers of size . You need to print the sum of the elements in the array,
 * keeping in mind that some of those integers may be quite large.

 Input

 The first line of the input consists of an integer . The next line contains  space-separated integers contained in the array.

 Constraints


 Sample Input
 5
 1000000001 1000000002 1000000003 1000000004 1000000005

 Output
 Print a single value equal to the sum of the elements in the array. In the above sample, you would print .

 Note: The range of the 32-bit integer is .
 When we add several integer values, the resulting sum might exceed the above range. You might need to use long long int in C/C++ or long data type in Java to store such sums.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0;arr_i<n;arr_i++)
        {
            arr[arr_i]= in.nextInt();
        }
            long sum=0;
        for(int i =0;i<n;i++)
        {
            sum=sum+arr[i];

        }
        System.out.println(sum);

    }

}
