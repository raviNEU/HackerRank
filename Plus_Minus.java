/*Given an array of integers, calculate the fractions of its elements that are positive, 
negative, and are zeros. Print the decimal value of each fraction on a new line.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double pos=0.000000,zer= 0.000000,neg= 0.000000;

        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                pos++;
            }
            else if (arr[i]<0)
            {
                neg++;
            }
            else
            {
                zer++;
            }
           

        }
        DecimalFormat numberFormat = new DecimalFormat("#0.000000"); 
        System.out.println(numberFormat.format(pos / arr.length));
        System.out.println(numberFormat.format(neg / arr.length));
        System.out.println(numberFormat.format(zer / arr.length));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
