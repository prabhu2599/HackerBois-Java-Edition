import java.io.*;
import java.util.*;

public class Solution {
    public static int getLength(String A, String B) {
      return A.length()+B.length();
    }
  
    public static String getLexi(String A, String B) {
      return A.compareTo(B)>0?"Yes":"No";
    }
    
    public static String capitalPrints(String A, String B) {
      return A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "
      +B.substring(0,1).toUpperCase()+B.substring(1,B.length());
    }
    
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(getLength(A,B));
        System.out.println(getLexi(A,B));
        System.out.println(capitalPrints(A,B));
    }
}



