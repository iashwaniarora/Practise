/**
 * Created by ashwani on 6/11/2016.
 */
public class Solution {


    public static void main(String[] args) {
        int arr[] = {5, 8, 7, 1, 13, 14};

        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // print sorted array
        System.out.println("Solution.main");
        for (Integer arrValue : arr) {
            System.out.print(" "+arrValue);
        }

    }
}
