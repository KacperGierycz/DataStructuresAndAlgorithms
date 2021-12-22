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

class Result23 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    
    float p=0;
    float m=0;
    float z=0;
    float l=(float)arr.size();
    
    for (float i:arr){
        if(i>0)p++;
        if(i<0)m++;
        if(i==0)z++;
    }
    
    System.out.printf("%8.6f%n", p/l);
    System.out.printf("%8.6f%n", m/l);
    System.out.printf("%8.6f%n", z/l);
    

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result23.plusMinus(arr);

        bufferedReader.close();
    }
}

