/**
 * Created by ashwani_arora on 12/7/2016.
 */
public class Solution {

    public static void main(String[] args) {

        int givenNums[] = {2, 7, 11, 15};
        int target = 18;

        for (int i = 0; i < givenNums.length - 1; i++) {
            for (int j = i + 1; j < givenNums.length; j++) {
                if (givenNums[i] + givenNums[j] == target) {
                    System.out.println("i" + i + "j" + j);
                    return;
                }
            }
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("i" + i + "j" + j);
                    arr[0] = i;
                    arr[1] = j;

                }
            }
        }
        return arr;
    }
}
