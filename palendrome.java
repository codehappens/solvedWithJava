/*Java palendrome https://www.hackerrank.com/challenges/java-string-reverse/problem */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder B= new StringBuilder(A);
        String p=B.reverse().toString();
        int s1=p.compareTo(A);
        int s2=p.compareTo(p);
        if(s1==s2){
            System.out.println("Yes");
        }else { System.out.println("No");}
        
    }
}

