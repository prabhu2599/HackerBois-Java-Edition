import java.io.*;
import java.util.*;

public class Solution {
  public static void printIt() {
    Scanner scan = new Scanner(System.in);
    for(int i = 1; scan.hasNext()== true; i++)  
      System.out.println(i + " " + scan.nextLine());
   }

    public static void main(String[] args) {
        printIt();
    }
}
