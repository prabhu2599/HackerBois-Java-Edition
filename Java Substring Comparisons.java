import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        SortedSet<String> ss = new TreeSet<String>();
        
        for(int i=0;i<s.length()-k;i++) {
          ss.add(s.substring(i,i+k));
        }
        smallest = ss.first();
        largest = ss.last();
        
        return smallest + "\n" + largest;

    }
