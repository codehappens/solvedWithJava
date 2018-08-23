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