package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FreeCodeCampDPAllConstruct {	
	
	private static List<LinkedList<String>> allConstruct(String target, String[] wordBank
			, Object object) {
		
		if(target=="") return new ArrayList<LinkedList<String>>();
		
		List<LinkedList<String>> result=new ArrayList<>();
		
		for(int i=1;i<wordBank.length;i++) {
			String word=wordBank[i];
			if(target.indexOf(wordBank[i])==0) {
				String suffix=target.substring(wordBank[i].length());
				List<LinkedList<String>> suffixWays = allConstruct(suffix,wordBank,null);
				List<LinkedList<String>> targetWays=new ArrayList<LinkedList<String>>();
				
				targetWays.addAll(suffixWays);
				targetWays.forEach(l->l.addFirst(word));
				result.addAll(targetWays);
				
			}
			
		}
		
		
		return result;
	}
	
	   public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        String sq = (bufferedReader.readLine().trim());
	        
	        String[]q=sq.split(" ");
//	        int []qi=new int[q.length];
//	        for(int i=0; i<q.length; i++) {
//	        	qi[i]=Integer.parseInt(q[i]);
//	        }
	        
	       // int q = Integer.parseInt(bufferedReader.readLine().trim());


	        List<LinkedList<String>> result = FreeCodeCampDPAllConstruct.allConstruct(q[0],q,null);
	//new HashMap<Integer,Long>()
	        
	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();
	        
	        
	        bufferedReader.close();
	        bufferedWriter.close();
	        

	}



}
