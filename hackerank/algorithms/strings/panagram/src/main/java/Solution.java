import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by ashwani on 8/6/16.
 */
public class Solution {

    public static void main(String[] args) {
        //String s = "We promptly judged antique ivory buckles for the next prize";
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean alphabets[] = new boolean[26];
        s=s.toUpperCase();
        for(int i =0;i<s.length();i++)
        {
            if(((int)s.charAt(i))>64&&((int)s.charAt(i))<91)
            {
                alphabets[(int)s.charAt(i)-65]=true;
            }
        }
       /* char a= 'A';
        char Z= 'Z';
        System.out.println((int)(a)+" "+((int) Z ));
       */ boolean result =true;
        for(int j=0;j<alphabets.length;j++)
        {
            if(alphabets[j]==false)
            {
                result=false;
            }
        }
        if(result)
        {
            System.out.println("pangram");
        }
        else
        {
            System.out.println("not pangram");
        }

    }
}
