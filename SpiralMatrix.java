import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SpiralMatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner  sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] a = new int[m][n];
        
        int i, j;
        for(i=0;i <m;i ++)
            {
            for(j=0;j<n;j++){
              a[i][j] = sc.nextInt();   }
        }
        
        int top = 0, down = m-1;
        int left  = 0, right  = n -1;
        int d =0;
       while(top <= down && left <=right){
           if(d == 0)
               {
               for(i= left ; i <= right ;i ++)
                  System.out.print(a[top][i]+" ");
                top++;   
                   
           }
         else   if(d == 1)
               {
               for(i= top; i <= down ;i ++)
                  System.out.print(a[i][right]+" ");
            right--;   
                   
           }
        else     if(d == 2)
               {
               for(i= right ; i >= left;i--)
                  System.out.print(a[down][i]+ " ");
                down--;   
                   
           }
      else     if(d == 3)
               {
               for(i= down; i >= top;i --)
                  System.out.print(a[i][left]+" ");
                left++;   
                   
           }
       d = (d+1)%4;             
            }           
             }}