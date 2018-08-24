//https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long count=1;
        while(sc.hasNext()){
            //String ns = sc.nextLine();
            //System.out.println(ns);
            StringBuilder s=new StringBuilder(sc.nextLine());
            String inss=Long.toString(count)+" ";
            s.insert(0,inss);
            System.out.println(s);
            
            count++;
        }
           
    }
}

///////////////////////////
//problem creaters code

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line_num = 0;
        while(sc.hasNext())
        	System.out.println(++line_num + " " + sc.nextLine());
        sc.close();

    }
}

///////////////another try catch
//https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
public class Solution {
      
    static void solve(StringBuilder x, StringBuilder y){
        try{
            int a=Integer.parseInt(x.toString());
            int b=Integer.parseInt(y.toString());
            int ans= a/b;
            System.out.println(ans);
        }catch(NumberFormatException e){
            System.out.println("java.util.InputMismatchException");
        }catch(Exception e){
            System.out.println(e);
        }
    } 
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        StringBuilder x=new StringBuilder(sc.nextLine());
        StringBuilder y=new StringBuilder(sc.nextLine()); 
        solve(x,y);
        
    }
}
