//PROBLEM - EXCEPTIONS:STRING TO INTEGER(https://www.hackerrank.com/challenges/30-exceptions-string-to-integer)
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        int i = 0;
        try {
            i = Integer.parseInt(S);
            System.out.println(i);
        } 
        catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
