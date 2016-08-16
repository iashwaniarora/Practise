import java.util.Scanner;

/**
 * Created by ashwani on 8/13/16.
 */
public class Solution {
    public static void main(String[] args) {

        /*int a[][] = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, -2, 4, 0}};*/

         int a[][] = {{0, 6, -7, 1, 6, 3},
                 {-8, 2, 8, 3, -2 ,7},
                 {-3 ,3, -6, -3, 0, -6},
                         {5 ,0, 5, -1, -5, 2},
                                 {6 ,2, 8, 1, 3, 0},
                                         {8 ,5, 0, 4, -7 ,4} };


        /*Scanner in = new Scanner(System.in);
        int a[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                a[arr_i][arr_j] = in.nextInt();
            }
        }*/

        int max = 0;
        int sum = 0;
        int maxSUm = -9999;
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {

                sum=sum+a[x][y]+a[x][y+1]+a[x][y+2];
                sum=sum+a[x+1][y+1];
                sum=sum+a[x+2][y]+a[x+2][y+1]+a[x+2][y+2];
                if(sum>maxSUm)
                {
                    maxSUm=sum;
                }
                sum = 0;

            }
        }
        System.out.println(maxSUm);

    }


}
