import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static String checkIt(int n) {
        if(n%2 != 0 || n==3 || n==5)
            return "Weird";
        // yahan se sirf even hi bacha hai
        if((n>2 && n <5) || n>20)
            return "Not Weird";
        return "Weird"; 
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        System.out.println(checkIt(N));
    }
}
