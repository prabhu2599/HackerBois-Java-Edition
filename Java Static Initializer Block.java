import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static Scanner scan = new Scanner(System.in);
static int B = scan.nextInt();
static int H = scan.nextInt(); 
static boolean flag = false;
static {
  try {
  if(B>0) 
    if(H>0) 
      flag=true; 
    else 
      throw new Exception("Breadth and height must be positive");
  else 
    throw new Exception("Breadth and height must be positive");
    
  }
  catch(Exception e) {
    System.out.println(e);
  }
  
}


public static void main(String[] args){
