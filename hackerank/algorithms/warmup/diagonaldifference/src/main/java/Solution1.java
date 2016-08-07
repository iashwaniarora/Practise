import java.util.Scanner;

/**
 * Created by ashwani on 8/6/16.
 */
public class Solution1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

        System.out.println(string.length()-string.replaceAll("[A-Z]","").length()+1);
    }
}
