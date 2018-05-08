package com.practise.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ashwani on 6/6/2016.
 */
public class Solution {

    public static void main(String[] args) throws FileNotFoundException {

        int i=4;
        double d = 4.0;
        String s= "HackerRank ";

        Scanner scanner = new Scanner(new FileInputStream("D:\\study\\input.txt"));

        int firstInput = scanner.nextInt();
        System.out.println(i+firstInput);

        double secondInput = new Double(scanner.next());
        System.out.println(d+secondInput);

        String thirdString = new String(scanner.nextLine());
        System.out.println(s+thirdString);
    }
}
