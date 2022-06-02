import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ValidBST {
  
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] val = new int[n];
          int [] check = new int[n];
        int s,e,m;
        s = 0;
        e=n-1;
        for(int i = 0; i < n;i++){
            val[i] = sc.nextInt();
        }
        for(int j = 0; j < n;j++){
          check[j] =   val[j] ;
        }
        Arrays.sort(val);
        for(int k = 0; k < n;k++){
          if(check[k] != val[k]){
              s++;
              System.out.println("False");
              break;
          }
        }
        if(s == 0){
            System.out.println("True");
        }
     
        
        
        
        
        
    }
}