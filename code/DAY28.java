//PROBLEM - RegEx, Patterns, and Intro to Databases (https://www.hackerrank.com/challenges/30-regex-patterns)
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String Regrex=".+@gmail\\.com$";
        List<String> list= new ArrayList();
        Pattern pattern=Pattern.compile(Regrex);
        for(int i=0;i<n;i++){
            String name=sc.next();
            String email=sc.next();
            Matcher matcher=pattern.matcher(email);
            if(matcher.find()){
                list.add(name);
            }
        }
        Collections.sort(list);
        for(String names:list){
            System.out.println(names);
        }
    }
}
