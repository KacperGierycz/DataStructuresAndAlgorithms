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

class Result9 {

    /*
     * Complete the 'minimumAbsoluteDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minimumAbsoluteDifference(List<Integer> arr) {
    
    Collections.sort(arr);
    
    int s=Math.abs(arr.get(0)-arr.get(1));
    
    for (int i=1;i<arr.size();i++){
    
    s=Math.min(Math.abs(arr.get(i-1)-arr.get(i)),s);
        
    }
    
    
    
    
    // int[] sum=new int[arr.size()];
    
    // for (int i=0;i<arr.size();i++){
    
    // }
    
    
    // for (int i=0;i<arr.size();i++){
    //     for(int j=i+1;j<arr.size();j++){
            
    //         int a=arr.get(i);
    //         int b=arr.get(j);
    //         int c=a-b;
    //         int ca=Math.abs(c);
            
    //         if (ca<s){
    //             s=Math.abs(c);
    //         }
            
    //         if(s==0){
    //             return 0;
    //         }
    //     }        
    // }    
    return s;
    }

}

public class MinAbsoluteDiference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result9.minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
