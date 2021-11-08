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
