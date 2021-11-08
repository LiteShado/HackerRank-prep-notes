public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}

/////

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}

////////////////////////////////
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

    if (N % 2 != 0) {
        System.out.println("Weird");
    } else if (N % 2 ==0 && N >= 2 || N <= 5) {
        System.out.println("Not Weird");
    } else if (N % 2 == 0 && N >= 6 || N <= 20) {
        System.out.println("Weird");
    } else if (N % 2 ==0 && N > 20) {
        System.out.println("Not Weird");
    }

    }


}

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);

            }
            System.out.println("================================");

    }
}

////////////////////////////////////////////////////////////////

// Objective
// In this challenge, we're going to use loops to help us do some simple math.

// Task
// Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 1; i <= 10; i++){

            System.out.printf("%d x %d = %d%n", N, i, N*i);
        }
    }
}

// We use the integers , , and  to create the following series:

// You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

// Input Format

// The first line contains an integer, , denoting the number of queries.
// Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = a;
            for(int j=0;j<n;j++){
                c += Math.pow(2, j)*b;
                System.out.printf("%s ",c);
            }
            System.out.println();
        }
        in.close();
    }
}



////
// Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

// A byte is an 8-bit signed integer.
// A short is a 16-bit signed integer.
// An int is a 32-bit signed integer.
// A long is a 64-bit signed integer.
// Given an input integer, you must determine which primitive data types are capable of properly storing that input.

// To get you started, a portion of the solution is provided for you in the editor.


import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            try{
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
                    System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                    System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                    System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
                    System.out.println("* long");
            }
            catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
