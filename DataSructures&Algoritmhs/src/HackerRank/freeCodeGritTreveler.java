package HackerRank;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class freeCodeGritTreveler {
	


		
		private static Long calculate(int n,int m, HashMap<String,Long>memo) {
			if(memo==null)memo=new HashMap<String,Long>();
			String key=n+","+m;
			
			if(memo.containsKey(key))return memo.get(key);
			if(m==1&&n==1)return (long)1;
			if(m==0||n==0)return (long)0;
			
			memo.put(key, calculate(m-1,n,memo)+calculate(m,n-1,memo));
			return memo.get(key);
			
//			
//			if (memo[n-1]!=null)return (long) memo[n-1];
//			if(n<=2)return (long) 1;
//			memo[n-1]=  (calculate(n-1,memo)+calculate(n-2,memo));
//			return memo[n-1];
//			
			
			
			
		}
		
		
		
		
		
		    public static void main(String[] args) throws IOException {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		        int q = Integer.parseInt(bufferedReader.readLine().trim());
		        int p = Integer.parseInt(bufferedReader.readLine().trim());

		        Long result = freeCodeGritTreveler.calculate(q,p, null);
	//new HashMap<Integer,Long>()
		        
	            bufferedWriter.write(String.valueOf(result));
	            bufferedWriter.newLine();
		        
		        
		        bufferedReader.close();
		        bufferedWriter.close();
		        

	}
		


}
