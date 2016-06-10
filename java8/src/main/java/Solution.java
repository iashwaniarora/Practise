import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = null;
        String inputString=null;
        try {
             scan = new Scanner(System.in); // use the Scanner class to read from stdin
             inputString = scan.nextLine(); // read a line of input and save it to a variable
            scan.close(); // close the scanner
        }catch(InputMismatchException e)
        {
            System.out.println("Invalid value!");
            scan.next(); // this consumes the invalid token
        }

        // Your first line of output goes here

        System.out.println("Hello, World.");

        // Write the second line of output
        System.out.println(inputString);
    }
}