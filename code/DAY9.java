//PROBLEM - RECURSION (https://www.hackerrank.com/challenges/30-recursion)
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

class Result {
    public static int factorial(int n) {
        int fact=1;
        if(n==0 || n==1){
            fact=1;
        }
        else{
            fact=n*Result.factorial(n-1);
        }
        return fact;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int result = Result.factorial(n);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
