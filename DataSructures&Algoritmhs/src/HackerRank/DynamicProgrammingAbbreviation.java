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

class Result20 {

    /*
     * Complete the 'abbreviation' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static String abbreviation(String a, String b) {
    	int al=a.length();
    	int bl=b.length();
    	int[][]dp=new int[al+1][bl+1];
    	char[] ac=a.toCharArray();
    	char[] bc=b.toCharArray();
    	
    
    for(int i=1;i<al+1;i++){
    	 for(int j=1;j<bl+1;j++){
    		
    		 if(Character.isUpperCase(ac[i-1])) {
    			 if(ac[i-1]==bc[j-1]){
    				 dp[i][j]=dp[i-1][j-1]+1;

    				 }
    			 

    		 }
    		 else if(Character.toUpperCase(ac[i-1])==bc[j-1]) {
    			 dp[i][j]=dp[i-1][j-1]+1;
    		 
    		 }
    		 else {
    			 dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
    		 }
		}
    //	Character q=ac[i];

    	}
    System.out.println( "arr"+dp[al][bl]);    
    System.out.println("bl"+bl);    
    
    
    if(dp[al][bl]>=bl) {
    	return "YES";
    }
    else {
    	return "NO";
    }
    

    
    
    
    
    }

}

public class DynamicProgrammingAbbreviation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String a = bufferedReader.readLine();

                String b = bufferedReader.readLine();

                String result = Result20.abbreviation(a, b);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

