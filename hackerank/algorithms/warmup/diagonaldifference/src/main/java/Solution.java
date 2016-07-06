import java.util.Scanner;

/**
 * Created by ashwani_arora on 7/6/2016.
 */

/**
 * Question
 * <p>
 * Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.
 * <p>
 * Input Format
 * <p>
 * The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.
 * <p>
 * Output Format
 * <p>
 * Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
 * <p>
 * Sample Input
 * <p>
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 * Sample Output
 * <p>
 * 15
 * Explanation
 * <p>
 * The primary diagonal is:
 * 11
 * 5
 * -12
 * <p>
 * Sum across the primary diagonal: 11 + 5 - 12 = 4
 * <p>
 * The secondary diagonal is:
 * 4
 * 5
 * 10
 * Sum across the secondary diagonal: 4 + 5 + 10 = 19
 * Difference: |4 - 19| = 15
 */

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[n][n];
        /*int n=3;
        int arr[][] = {{11,2,4},{4,5,6},{10,8,-12}};*/
       for (int arr_i = 0; arr_i < n; arr_i++) {
                for (int arr_j = 0; arr_j < n; arr_j++) {
                    arr[arr_i][arr_j] = in.nextInt();
                }
            }
         int sumDiagonal1=0 ;
                 int sumDiagonal2=0;
        //Solution
        int min=0;
        int max=n;
        for(int arr_i=0;arr_i<n;arr_i++)
            for(int arr_j=0;arr_j<n;arr_j++)
            {
               if(arr_i==arr_j) {
                   sumDiagonal1 = sumDiagonal1 + arr[arr_i][arr_j];
               }
                if(arr_i==min&&arr_j==max-1)
               {
                   sumDiagonal2=sumDiagonal2+arr[arr_i][arr_j];
                   min++;
                   max--;
               }

            }
        System.out.println(Math.abs(sumDiagonal1 - sumDiagonal2));
    }
}
