import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by ashwani arora on 8/21/2016.
 */
public class Solution {

    static int pairs(int[] a, int k) {
        int count = 0;

        TreeSet treeSet = getTreesSet(a, k);
        for (Object intV : treeSet) {
            System.out.println(treeSet);
            for (int i = 0; i < a.length; i++) {
                if ((Integer) intV - a[i] == k) {
                    count++;
                }
            }

        }

        return count;
    }

    static TreeSet getTreesSet(int[] a, int k) {
        int count = 0;
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > k)
                treeSet.add(a[i]);


        }

        return treeSet;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        String n = in.nextLine();
        String[] n_split = n.split(" ");

        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);

        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

       /* int res;
        int _a[] = {1, 5, 3, 4, 2};
        int _k = 2;*/
        res = pairs(_a, _k);
        System.out.println(res);
    }
}
