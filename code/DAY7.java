//PROBLEM - ARRAYS (https://www.hackerrank.com/challenges/30-arrays)
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=a-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
