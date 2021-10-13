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

public class FrequencyQueries {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> ans=new ArrayList();
         HashMap<Integer,Integer> nr=new HashMap<>();
         HashMap<Integer,Integer> freq=new HashMap<>();

         for(List<Integer> p:queries){
             //    for(List p:l){
                     int i=p.get(0);
                     int j=p.get(1);
                     int k=0;
                     if(i==1){
                         if (nr.containsKey(j)){
                             k=nr.get(j);
                             nr.put(j,k+1);
                             if(freq.containsKey(k+1)){
                                 if(freq.get(k)==1) {
                                     freq.remove(k);
                                     freq.put(k+1,freq.get(k+1)+1);
                                 }
                                 else {
                                     freq.put(k,freq.get(k)-1);
                                     freq.put(k+1,freq.get(k+1)+1);
                                 }}
                             else{
                                 if(freq.get(k)==1) {
                                     freq.remove(k);
                                     freq.put(k+1,1);
                                 }
                                 else {
                                 freq.put(k,freq.get(k)-1);
                                 freq.put(k+1,1);
                                 
                             }}
                         }
                         else{
                             nr.put(j,1);
                             if(freq.containsKey(1)){
                                 freq.put(1,freq.get(1)+1);
                             }
                             else{
                                 freq.put(1,1);
                             }
                         }
                         
                     }
                     if(i==2){
                         if(nr.containsKey(j)){
                             k=nr.get(j);
                             if (k==1){
                                 nr.remove(j);
                             if(freq.get(1)==1){
                                 freq.remove(1);
                             }
                             else{
                                 freq.put(k,freq.get(k)-1);                       
                             }
                             }
                             else{
                                 if(freq.get(k)==1){
                                     if(freq.containsKey(k-1)){
                                     nr.put(j,nr.get(j)-1);
                                     freq.remove(k);
                                     freq.put(k-1,freq.get(k-1)+1);                  
                                 }
                                 else{
                                 nr.put(j,nr.get(j)-1);
                                 freq.remove(k);
                                 freq.put(k-1,1);  
                                     
                                 }
                                 }
                                 else{
                                 if(freq.containsKey(k-1)){
                                 nr.put(j,nr.get(j)-1);
                                 freq.put(k,freq.get(k)-1);
                                 freq.put(k-1,freq.get(k-1)+1);
                                     
                                 }
                                 else{
                                 nr.put(j,nr.get(j)-1);
                                 freq.put(k,freq.get(k)-1);
                                 freq.put(k-1,1);  
                                     
                                 }

                                 
                             }       
                             }            

                         }
                         
                         
                     }
                     if(i==3){
                         if(freq.containsKey(j)){
                             ans.add(1);
                         }
                         else{
                             ans.add(0);
                         }
                     }
                 }
          //   }
     return ans;

         }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
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

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
            ans.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

