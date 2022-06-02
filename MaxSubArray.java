import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int k =0; k<n;k++)
            a[k] = sc.nextInt();
               System.out.println(maxSubArray(a));
    }
    public  static int maxSubArray(int a[])
    {
        int size = a.length;
        int maxfirst = -2147483648 , maxlast = 0;
        for (int i = 0; i < size; i++)
        {
            maxlast = maxlast + a[i];
            if (maxfirst < maxlast)
                maxfirst = maxlast;
            if (maxlast < 0)
                maxlast = 0;
        }
        return maxfirst;
    }
    }