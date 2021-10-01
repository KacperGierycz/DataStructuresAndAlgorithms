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

class Result {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
    
    HashMap<Character, Integer>mapOfLetersA= new HashMap<Character,Integer>();

    HashMap<Character, Integer>mapOfLetersB= new HashMap<Character,Integer>();
    HashMap<Character, Integer>mapOfLetersX= new HashMap<Character,Integer>();
    int sa=a.length();
    int sb=b.length();
    
     for(int i=0;i<a.length();i++){
         char charA= a.charAt(i);
         if (mapOfLetersA.get(charA)==null){
             mapOfLetersA.put(charA,1);
         }
         else{
             mapOfLetersA.put(charA,mapOfLetersA.get(charA)+1);
         }
         
     }
     
          for(int i=0;i<b.length();i++){
         char charA= b.charAt(i);
         if (mapOfLetersB.get(charA)==null){
             mapOfLetersB.put(charA,1);
         }
         else{
             mapOfLetersB.put(charA,mapOfLetersB.get(charA)+1);
         }
         
     }
     
     for (Map.Entry<Character,Integer> set:mapOfLetersA.entrySet()){
         
    	 Character gg=set.getKey();
         char aa=set.getKey();
         int howmany=set.getValue();
         
         if (mapOfLetersB.containsKey(aa)){
             if(mapOfLetersA.get(aa)>mapOfLetersB.get(aa)){
            	 mapOfLetersX.put(aa,mapOfLetersA.get(aa)-mapOfLetersB.get(aa));
             }
             if(mapOfLetersA.get(aa)<mapOfLetersB.get(aa)){
            	 mapOfLetersX.put(aa,mapOfLetersB.get(aa)-mapOfLetersA.get(aa));
             }
             if(mapOfLetersA.get(aa).equals(mapOfLetersB.get(aa))){
            	 mapOfLetersX.put(aa,0);
             }
         }
         else{
        	 mapOfLetersX.put(aa,mapOfLetersA.get(aa));
         }
         
     }
     
     for (Map.Entry<Character,Integer> set:mapOfLetersB.entrySet()){
         char aa=set.getKey();
         int howmany=set.getValue();
         
     if(!mapOfLetersX.containsKey(aa)){
         mapOfLetersX.put(aa, mapOfLetersB.get(aa));
     }
        
    }
    
    int ans=0;
    
    for (Map.Entry<Character,Integer> set:mapOfLetersX.entrySet()){
    
    ans=ans+set.getValue();
    
        
    }
    return ans;
    }
    
    public static int numberNeeded(String first, String second) {
        int[] freq = new int[26];
        first.chars().forEach((c) -> {
            freq[c - 97]++;
        });
        second.chars().forEach((c) -> {
            freq[c - 97]--;
        });
        return Arrays.stream(freq).map(Math::abs).sum();
}
}

public class Anagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
   //    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
       BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);
      //  System.out.println(res);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
