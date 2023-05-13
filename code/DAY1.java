//PROBLEM STATEMENT-DATA TYPES (https://www.hackerrank.com/challenges/30-data-types)
import java.io.*;
import java.util.*;
import java.text.*;
public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int j=scan.nextInt();
        double e=scan.nextDouble();
        scan.nextLine();
        String st=scan.nextLine();
        System.out.print(i+j+"\n");
        System.out.print(d+e+"\n");
        System.out.println(s+st);
        scan.close();
    }
}
