import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FirstUnique {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
char [] a = s.toCharArray();
        char c ,d ,e;
        d = a[0];
HashSet<Character> m = new HashSet<>();
int j =0,l=0;
for(int i=0;i< a.length;i++)
{
     c = a[i];
    l=0;
           for(int k =i+1; k < a.length ;k++){  
                if(a[k] == c)
               {  a[k ]='@';
                   l++;}}
               if(l==0 && i!= a.length-1 && a[i] !='@')
               {     j++;
                   System.out.print(i);
                break;
       }
        }
if(j == 0)
{
  System.out.print("-1");
}
    }
}