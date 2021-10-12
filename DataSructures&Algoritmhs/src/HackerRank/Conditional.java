package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Rsult13{
    
    public static String solve(int n){
        
        if (n%2==0){
            return "Weird";
        }
        else{
            
            if(n>=2&&n<=5){
                return "Weird";
            }
            if(n>=6&&n<=20){
                return "Weird";
            }
            if(n>20){
                return "Not Weird";
            }
            
            
        }
        
        return "Weird";
    }
    
}



public class Conditional {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
         // System.out.println("WTF");
           String res2= Rsult13.solve(N);
            System.out.println(res2);
          

        bufferedReader.close();
    }
}

