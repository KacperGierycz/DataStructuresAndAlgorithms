package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class FreecodeFibonacci {
	
	private static Long calculate(int n, Long[]memo) {
		if(memo==null)memo=new Long[n+1] ;
		
		if (memo[n-1]!=null)return (long) memo[n-1];
		if(n<=2)return (long) 1;
		memo[n-1]=  (calculate(n-1,memo)+calculate(n-2,memo));
		return memo[n-1];
		
		
		
		
	}
	
	
	
	
	
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        int q = Integer.parseInt(bufferedReader.readLine().trim());

	        Long result = FreecodeFibonacci.calculate(q, null);
//new HashMap<Integer,Long>()
	        
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
	        
	        
	        bufferedReader.close();
	        bufferedWriter.close();
	        

}
	}
