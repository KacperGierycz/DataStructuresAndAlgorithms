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

class Result14 {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        
        long[] arr=new long[n+1];
        
            for (List<Integer> l:queries){
            int a=l.get(0)-1;
            int b=l.get(1)-1;
            long k=(long)l.get(2);
        
            arr[a]+=k;
            arr[b+1]-=k;            
            }
            
        long sum=0;
        long hi=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if (sum>hi){
                hi=sum;
            }
        }
        
        return hi;
        
        // long[] arr=new long[n];
        
        // for (List<Integer> l:queries){
        //     int a=l.get(0)-1;
        //     int b=l.get(1)-1;
        //     long k=(long)l.get(2);
        
        // for(int i=a;i<=b;i++){
        //     arr[i]=arr[i]+k;
        // }
        // }
        
        // long hi=0;
        // for(int i=0;i<n;i++){
        //     if (arr[i]>hi){
        //         hi=arr[i];
        //     }
        // }
        
        // return hi;
    }

}

public class AcumulatingSums {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = Result14.arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

