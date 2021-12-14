package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class freeCCDPCanConstructTabulation {

	
	private static boolean allConstruct(String target, String[] wordBank, Object object) {

		boolean [] table=new boolean [target.length()+1];
		
		table[0]=true;
		
		for(int i=0;i<target.length();i++) {
			if(table[i]==true) {
				for(int j=1;j<wordBank.length;j++) {
					String word=wordBank[j];
					if(i+word.length()<=target.length()) {
						String word2=target.substring(i, i+word.length());
					if(word2.equals(word)) {
						table[i+word.length()]=true;
					}
					}
				}
			}
			
		}
		
		return table[target.length()];
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


	        boolean result = freeCCDPCanConstructTabulation.allConstruct(q[0],q,null);
	//new HashMap<Integer,Long>()
	        
	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();
	        
	        
	        bufferedReader.close();
	        bufferedWriter.close();
	        

	}


}
