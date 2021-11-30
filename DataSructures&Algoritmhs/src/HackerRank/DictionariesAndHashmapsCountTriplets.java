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

public class DictionariesAndHashmapsCountTriplets {
	
		 
	    // Complete the countTriplets function below.
	    static long countTriplets(List<Long> arr, long r) {
	    	long ans=0;
    	HashMap<Long,Long>A= new HashMap<>();	
    	HashMap<Long,Long>B= new HashMap<>();	
	    	
    //	A After initialization
    	for (Long i:arr) {
    		if (!A.containsKey(i)) A.put(i, (long) 0);
    		
    		A.put(i,A.get(i)+1);
    	}
    	
    // iterate of arr of main check	
    	for(long n:arr) {
    		// decrease A
    		A.put(n, A.get(n)-1);
    		// check 1
    		if(n%r==0) {
    			if(B.containsKey(n/r)) {
    				if(A.containsKey(n*r)) {
    					ans+=B.get(n/r)*A.get(n*r);
    				}
    			}
    				
    			
    		}
    		
         
            if (!B.containsKey(n)) B.put(n, (long) 0);
            
            B.put(n,B.get(n)+1);
    		
    	}
	    	
	    	
			return ans;


	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	           BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int n = Integer.parseInt(nr[0]);

	        long r = Long.parseLong(nr[1]);

	        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Long::parseLong)
	            .collect(toList());

	        long ans = countTriplets(arr, r);

	        bufferedWriter.write(String.valueOf(ans));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	

}
