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

class Result4 {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

	
	static String isValid2(String s) {
	    final String GOOD = "YES";
	    final String BAD = "NO";

	    if(s.isEmpty()) return BAD;
	    if(s.length() <= 3) return GOOD;

	    int[] letters = new int[26];
	    for(int i = 0; i < s.length(); i++){
	        letters[s.charAt(i) - 'a']++;
	    }
	    Arrays.sort(letters);
	    int i=0;
	    while(letters[i]==0){
	        i++;
	    }
	    //System.out.println(Arrays.toString(letters));
	    int min = letters[i];   //the smallest frequency of some letter
	    int max = letters[25]; // the largest frequency of some letter
	    String ret = BAD;
	    if(min == max) ret = GOOD;
	    else{
	        // remove one letter at higher frequency or the lower frequency 
	        if(((max - min == 1) && (max > letters[24])) ||
	            (min == 1) && (letters[i+1] == max))
	            ret = GOOD;
	    }
	    return ret;
	}

    	
        public static String isValid(String s) {

            int[] cs =new int[26];
            
            for(char c:s.toCharArray()){
                cs[c - 97]++;
            }
            
             boolean one=true;
            for(int i=0;i<cs.length-1;i++){
                if (cs[i]==0||cs[i+1]==0||cs[i]==cs[i+1]||((cs[i]+1==cs[i+1]||
                cs[i]-1==cs[i+1])&&one)){
                    if ((cs[i]+1==cs[i+1]||cs[i]-1==cs[i+1])&&one){
                    	cs[i+1]=cs[i];
                    	one=false;
                    }
                    }
                else return "NO"; 
                    
                }
            
            return "YES" ;
            
            
          
        }

}

public class SherlockandtheValidString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result4.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
