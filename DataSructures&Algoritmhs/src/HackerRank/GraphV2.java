package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class GraphV2 {

	private static Map<Integer, List<Integer>> createGraphInteger() throws IOException {
    Map<Integer, List<Integer>> myMap = new HashMap<Integer, List<Integer>>();
	
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while (( line = bufferedReader.readLine()) != null) { //||line==".*\\d+.*"
    //	System.out.println(line);
    //	line.trim();
    	  String[]ssplit=line.trim().split("[^0-9]+");	
    	  
//    	  for(String i:ssplit) {
//    		  System.out.println("nr:"+i);
//    	  }
		   if (line.equals(null)||line.equals("")){
			   break;
		   }

		   int ii=0;
		   for(String si:ssplit) {
			   System.out.println("nr:"+si);
			   if (si.equals(null)||si.equals("")) {
		//		   System.out.println("wtf"+si);
				   break;
			   }			   
			   if(ii==0) {
		//		   System.out.println("nr:"+si);
				   myMap.put(Integer.parseInt(si), new ArrayList<Integer>());
			   ii++;
			   }
			   else {
				List<Integer>cp0=myMap.get(Integer.parseInt(ssplit[0]));
				cp0.add(Integer.parseInt(si));
			   
		   }
	    }
	    }
    System.out.println("exit");
    bufferedReader.close();
    return myMap;
	}
	
	private static int largestC(Map<Integer, List<Integer>> graph) {
		System.out.println("start");
		HashSet<Integer> visited=new HashSet<Integer>();
		int longest=0;
		for (Integer node:graph.keySet()) {
			System.out.println(node);
			int size=exploreSize(graph,node,visited);
			if(size>longest) {
				longest=size;
			}
		}
		
		
		return longest;
	}
	
	
	
	
	private static int exploreSize(Map<Integer, List<Integer>> graph, Integer node, HashSet<Integer> visited) {


		
		if(visited.contains(node)) {
			return 0;
		}
		
		visited.add(node);
		System.out.println(node);
		
		int size=1;
		
		for(Integer neighbor:graph.get(node)) {
			size+=exploreSize(graph, neighbor, visited);
			
		}
		
		return size;
	}

	public static void main(String[] args) throws IOException {

	
		Map<Integer,List<Integer>> graph=createGraphInteger();
		
		System.out.println(graph);
		
		int largestComponent=largestC(graph);
		
		System.out.println(largestComponent);

	
	}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
