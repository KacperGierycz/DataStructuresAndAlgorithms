package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;

public class freeCCampDPCanConstruct {
	
	
	private static boolean canConstruct(String target,String[] q
			,HashMap<String,Boolean>memo) {

		if(memo==null)memo=new HashMap<String,Boolean>();
		if(memo.containsKey(target)) return memo.get(target);
		
	//	String target =q[0];
		if (target.equals(""))return true;
		
//		StringBuffer suffix=null;
//		StringBuilder sss=null;
		for(int i=1;i<q.length;i++) {
			if (target.indexOf(q[i])==0) {
			String	suffix2=target.substring(q[i].length());
			//	target.substring(q[i].length());
			
		//	target=suffix2;
			
			if(canConstruct(suffix2,q,memo)==true) {
				memo.put(target, true);
				return true;
			}
			}
		}
		memo.put(target, false);
		return false;
		
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


	        boolean result = freeCCampDPCanConstruct.canConstruct(q[0],q,null);
	//new HashMap<Integer,Long>()
	        
	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();
	        
	        
	        bufferedReader.close();
	        bufferedWriter.close();
	        

	}



}
