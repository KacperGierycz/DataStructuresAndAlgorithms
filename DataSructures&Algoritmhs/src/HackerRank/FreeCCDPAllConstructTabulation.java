package HackerRank;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;

public class FreeCCDPAllConstructTabulation {
	
	private static ArrayList<LinkedList<String>> allConstruct(String target, String[] wordBank, Object object) {

		ArrayList<LinkedList<String>> table=new ArrayList<LinkedList<String>>(10);
		ArrayList<LinkedList<String>> table2=new ArrayList<LinkedList<String>>();
		LinkedList<String> table3[] = new LinkedList[target.length()];
		ArrayList<LinkedList<String>> table4[] = new ArrayList[target.length()+1];
		ArrayList<LinkedList<String>>n=new ArrayList<LinkedList<String>>();
		LinkedList<String>h=new LinkedList<>();

		n.add(h);
		//table3[0]=n;
	//	table.add(n);
		table4[0]=n;
		
		for(int i=0;i<=target.length();i++) {
			for(int j=1;j<wordBank.length;j++) {
				String word=wordBank[j];
				if(target.length()>=i+word.length()) {
				String slice=target.substring(i,i+word.length());
				if(slice.equals(word)) {
//					if (	table4[i+word.length()]==null) {
//						//	table.get(i+word.length())==null) {
//						ArrayList<LinkedList<String>>p=table4[i];
//						LinkedList<String>m=new LinkedList<String>();
//						m.add(word);
//						p.add(m);
//					//	table.set(i+word.length(), m);
//						table4[i+word.length()]= p;
//					}
//					else {
						ArrayList<LinkedList<String>> l=new ArrayList<>();
						
						l=table4[i];
						if(l.isEmpty()) {
							LinkedList<String>h1=new LinkedList<>();
							h1.add(word);
							l.add(h1);
						}
						else {
						l.forEach(q->q.add(word));
						ArrayList<LinkedList<String>> lk=new ArrayList<>();
							lk=	table4[i+word.length()];
							if(lk!=null) {
						lk.addAll(l);
						table4[i+word.length()]=lk;
					}}

							}
			//	}
					
				}
				
			}
			
			
		}
		
		return table4[target.length()];
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


	        ArrayList<LinkedList<String>> result = FreeCCDPAllConstructTabulation.allConstruct(q[0],q,null);
	//new HashMap<Integer,Long>()
	        
	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();
	        
	        
	        bufferedReader.close();
	        bufferedWriter.close();
	        

	}


}
