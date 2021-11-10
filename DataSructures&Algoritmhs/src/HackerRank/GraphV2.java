package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphV2 {

	private static Map<Integer, List<Integer>> createGraphInteger() throws IOException {
    Map<Integer, List<Integer>> myMap = new HashMap<Integer, List<Integer>>();
	
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while (( line = bufferedReader.readLine()) != null) {
    	System.out.println(line);
    	line.trim();
    	  String[]ssplit=line.split("[^0-9]+");	
    	  
    	  for(String i:ssplit) {
    		  System.out.println("nr:"+i);
    	  }
		   if (line.equals(null)||line.equals("")){
			   break;
		   }

		   int ii=0;
		   for(String si:ssplit) {
			   if (si.equals(null)||si.equals("")) {
				   System.out.println("wtf"+si);
				   break;
			   }			   
			   if(ii==0) {
				   System.out.println("nr:"+si);
				   myMap.put(Integer.parseInt(si), new ArrayList<Integer>());
			   ii++;
			   }
			   else {
				List<Integer>cp0=myMap.get(Integer.parseInt(ssplit[0]));
				cp0.add(Integer.parseInt(si));
			   
		   }
	    }
	    }
    bufferedReader.close();
    return myMap;
	}
	
	public static void main(String[] args) throws IOException {

	
		Map<Integer,List<Integer>> GI=createGraphInteger();
		System.out.println(GI);

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
