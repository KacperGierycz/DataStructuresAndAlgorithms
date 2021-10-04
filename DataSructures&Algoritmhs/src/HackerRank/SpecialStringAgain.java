package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SpecialStringAgain {

	   // Complete the substrCount function below.
	 static long substrCount(int n, String s) {

	        long ans=0;
	        List <Integer> con=new ArrayList();
	        for(int i=0;i<n;i++){
	            
	            char curChar=s.charAt(i);
	            int conl=1;
	            while(i<n-1&&s.charAt(i+1)==curChar){
	                i++;
	                conl++;                
	            }
	            
	            con.add(conl);
	            
	          // int mid=1; 
	            if(i>0&&i<n-1&&s.charAt(i-1)==s.charAt(i+1)){
	                ans++;
	            //    System.out.println(i);
	           //     i++;
	    
	            for (int j=2;i-j>=0&&i+j<n;j++){
	                if(s.charAt(i-1)==s.charAt(i-j)&&
	                s.charAt(i+1)==s.charAt(i+j)){
	                  //  System.out.println("j "+j);
	                    ans++;
	                }
	                else {
	                	break;
	                }
	                
	            }  
	            }
	        }
	        
	       for(long a:con){
	            // long ss=0;
	            // for(long i=1;i<=a;i++){
	            //     ss=ss+i;
	                
	            // }
	            
	        //    ans=ans+ss;
	            ans=ans+a*(a+1)/2;
	            // if(con.size()>1) {
	            //     ans=ans+ss;    
	            // }
	            // else {
	            //     ans=ans+ss;
	            // }
	            
	        }
	        
	      //  System.out.println(con);
	        
	        return ans;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
