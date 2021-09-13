import java.util.*;
import java.io.*;

class Solution{
  public static void printIt(int a, int b, int n) {
    int ans = 1;
    for(int i=0;i<n;i++) {
      for(int j=0;j<=i;j++) {
        ans += Math.pow(2,j)*b;
        //System.out.printf("%d %d %f -- ",i,j,Math.pow(2,j));
      }
      System.out.printf("%d ",ans+a-1);
      ans = 1;
    }
    System.out.printf("\n");
  }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printIt(a,b,n);
        }
        in.close();
    }
}
