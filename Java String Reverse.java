import java.io.*;
import java.util.*;

public class Solution {
  
  public static boolean checkPal(String str) {
    int l = str.length();
    for(int i=0,j=l-1;i<j;i++,j--) {
      //System.out.println(str.substring(i,i+1)+" "+str.substring(j,j+1));
      if(!str.substring(i,i+1).equals(str.substring(j,j+1)))
        return false;
    }
    return true;
  }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.print(checkPal(A)?"Yes":"No");
    }
}



