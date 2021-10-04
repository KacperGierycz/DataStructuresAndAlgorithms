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

class Result3 {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
	 public static int alternatingCharacters2(String s) {
    int count=0;
    for (int j = 0; j < s.length()-1; j++) {
        if(s.charAt(j)==s.charAt(j+1))
            count++;
      } 
   
	return count;
}	
	

    public static int alternatingCharacters(String s) {

    	 // to char arr 
        // if the char is same like last mark or delete
        // return delition
        
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int ans =0;
        for(int i=0;i<cs.length;i++){
            if(i>0){
                
                if(cs[i]==cs[i-1]){
                    sb.append(cs[i]);
                   // ans++;
                    while(i<cs.length&&cs[i]==cs[i-1]){
                    	ans++;
                    i++;
                    
                    }
                    
                    
                    
                }
            }
            
        }
        return ans;
    }

}

public class AlternatingCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result3.alternatingCharacters(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}