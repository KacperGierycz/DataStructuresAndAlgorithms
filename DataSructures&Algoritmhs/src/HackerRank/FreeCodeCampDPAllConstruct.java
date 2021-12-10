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
		
		if(target.equals("")) {
			List<LinkedList<String>> result2=new ArrayList<LinkedList<String>>();
			LinkedList<String>ll=new LinkedList<String>();
			String s=new String("");
		//	ll.add(s);
			result2.add(ll);
			return result2;
		}
		
		List<LinkedList<String>> result=new ArrayList<LinkedList<String>>();
		
		for(int i=1;i<wordBank.length;i++) {
			String word=wordBank[i];
			if(target.indexOf(word)==0) {
				String suffix=target.substring(word.length());
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
