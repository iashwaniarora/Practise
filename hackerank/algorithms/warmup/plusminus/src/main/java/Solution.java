import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by ashwani arora on 7/16/2016.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

       // int arr[] ={-4 ,3 ,-9 ,0 ,4 ,1,2};
        findPercentage(arr);

    }

    private static void findPercentage(int[] arr) {
        int len = arr.length;
        double positiveFrequency = 0.000000;
        double negativeFrequency=0.000000;
        for(int i =0; i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                negativeFrequency++;
            }
            else if(arr[i]>0)
            {
                positiveFrequency++;
            }
        }
        double positivePercentage = (positiveFrequency/len);
        double negativePercentage = (negativeFrequency/len);
        double zeroPercentage = (len-positiveFrequency-negativeFrequency)/len;
        DecimalFormat decimalFormat = new DecimalFormat("0.000000");
        System.out.println(decimalFormat.format(positivePercentage));
        System.out.println(decimalFormat.format(negativePercentage));
        System.out.println(decimalFormat.format(zeroPercentage));

    }
}
