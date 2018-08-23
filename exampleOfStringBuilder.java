//https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.io.*;
import java.util.*;
import java.lang.*;


public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        StringBuilder A=new StringBuilder(sc.next());
        StringBuilder B=new StringBuilder(sc.next());
        
        /*String A=sc.next();
        String B=sc.next(); */
        /* Enter your code here. Print output to STDOUT. */
        //System.out.println(A);
        //System.out.println(B);
        int l=A.length()+B.length();
        System.out.println(l);
        String a=A.toString();
        String b=B.toString();
        int v1=a.compareTo(b);
        int v2=b.compareTo(a);
        //System.out.println(v1);
        if(v1 > v2){
            System.out.println("Yes");
        } else { System.out.println("No");}
        char achar=Character.toUpperCase(A.charAt(0));
        char acharb=Character.toUpperCase(B.charAt(0));
        A.setCharAt(0,achar);
        B.setCharAt(0,acharb);
        A.append(" ");
        A.append(B);
        System.out.println(A);
        
        
    }
}

