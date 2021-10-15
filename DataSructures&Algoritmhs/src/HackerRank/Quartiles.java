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

class Result13 {

    /*
     * Complete the 'quartiles' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quartiles(List<Integer> arr) {
        
        // 1 check if odd or not
        // if odd 
        //else
        
        Collections.sort(arr);
        
            int mid=0;
            int midL= 0;
            int midR= 0;
        
        List<Integer> ans= new ArrayList<>();
        
        int odd= arr.size();
        if (odd%2!=0){
            odd=odd/2;
            mid= arr.get(odd);
            midL=(arr.get(odd/2)+arr.get(odd/2-1))/2;
            midR=(arr.get(odd+odd/2)+arr.get(odd+odd/2+1))/2;
          
        }
        else{
             odd=odd/2;
             if (odd%2!=0){
             mid=(arr.get(odd)+arr.get(odd-1))/2;
             midL=arr.get(odd/2);
             midR=arr.get(odd+odd/2);
             }
              else{
                  mid=(arr.get(odd)+arr.get(odd-1))/2;
               //     midL=arr.get(odd/2-1);
                //    midR=arr.get(odd+odd/2);
                  
                  midL=(arr.get(odd/2)+arr.get(odd/2-1))/2;
                  midR=(arr.get(odd+odd/2)+arr.get(odd+odd/2-1))/2;
              }
        }

        ans.add(midL);
        ans.add(mid);
        ans.add(midR);
            
             return ans;
            
        }
        
       

        
    // Write your code here

    

}

public class Quartiles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> data = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> res = Result13.quartiles(data);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

