//PROBLEM - REVIEW ON LOOPS(https://www.hackerrank.com/challenges/30-review-loop)
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.next();
            for(int j=0;j<arr[i].length();j++){
                if(j%2==0){
                    System.out.print(arr[i].charAt(j));
                }
            }
            System.out.print(" ");
            for(int j=0;j<arr[i].length();j++){
                if(j%2!=0){
                    System.out.print(arr[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
