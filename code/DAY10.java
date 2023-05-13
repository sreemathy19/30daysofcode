//PROBLEM - BINARY NUMBERS (https://www.hackerrank.com/challenges/30-binary-numbers)
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] a=Integer.toBinaryString(n).toCharArray();
        int c=0,tc=0;
        for(int i=0;i<a.length;i++){
            tc=(a[i]=='0'?0:tc+1);
            c=(tc>c?tc:c);
        }
        System.out.println(c);
    }
}
