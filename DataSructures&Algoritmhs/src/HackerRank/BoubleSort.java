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

class Result2 {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
        
        int swaps=0;
        int n =a.size();
    for (int i = 0; i < n; i++) {
    
    for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a.get(j) > a.get(j + 1)) {
            int as=a.get(j);
            a.set(j,a.get(j+1));
            a.set(j+1,as);
            swaps++;
        }
    }
    
}
// Array is sorted in 3 swaps.
// First Element: 1
// Last Element: 3

System.out.println("Array is sorted in "+ swaps +" swaps.");
System.out.println("First Element: "+a.get(0));
System.out.println("Last Element: "+a.get(a.size()-1));
    }

}

public class BoubleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result2.countSwaps(a);

        bufferedReader.close();
    }
}

