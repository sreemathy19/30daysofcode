//PROBLEM STATEMENT - LOOPS (https://www.hackerrank.com/challenges/30-loops)
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
        bufferedReader.close();
    }
}
