//https://www.hackerrank.com/challenges/java-primality-test/problem
//Jave builtin check if prime

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.BigInteger;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger m = new BigInteger(n);
        boolean ans=m.isProbablePrime(1);
        if(ans==true){System.out.println("prime");}
        else{System.out.println("not prime");}
        
        
        scanner.close();
    }
}
