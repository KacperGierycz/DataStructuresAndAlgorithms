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

class RoadsandLibraries {

    /*
     * Complete the 'roadsAndLibraries' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER c_lib
     *  3. INTEGER c_road
     *  4. 2D_INTEGER_ARRAY cities
     */
	
	private static Map<Integer, List<Integer>> createGraphChar(List<List<Integer>> cities){
		Map<Integer, List<Integer>> myMap = new HashMap<Integer, List<Integer>>();
		
		for(List<Integer> l:cities) {
			
			Integer c1=l.get(0);
			Integer c2=l.get(1);
			
			if (!myMap.containsKey(c1)) myMap.put(c1, new ArrayList<Integer>());
			if (!myMap.containsKey(c2)) myMap.put(c2, new ArrayList<Integer>());
			
			myMap.get(c1).add(c2);
			myMap.get(c2).add(c1);			
			
		}
		
		return myMap;		
	}
	
	private static HashMap<Integer,ArrayList<Integer>> largestCConnectedComponent(Map<Integer, List<Integer>> graph) {
	//	System.out.println("start");
		HashSet<Integer> visited=new HashSet<Integer>();
		HashMap<Integer,ArrayList<Integer>>ConnectedComponents=new  HashMap<Integer,ArrayList<Integer>>();
		ArrayList<Integer>components = null;
		
		int nrOfConnectedComponent=0;
		for (Integer node:graph.keySet()) {
		//	System.out.println(node);
			if (!visited.contains(node)) {
				ConnectedComponents.put(node,new ArrayList<Integer>());
				components=ConnectedComponents.get(node);
			}
			exploreSizeConnectedComponent(graph,node,visited,components,nrOfConnectedComponent);

		}		
		return ConnectedComponents;
	}
	
	private static int exploreSizeConnectedComponent(
			Map<Integer, List<Integer>> graph, Integer node, HashSet<Integer> visited,
			ArrayList<Integer>components,int nrOfConnectedComponent) {
			
	        if(visited.contains(node)) {
	            return 0;
	        }
	        
	        visited.add(node);
	        components.add(node);
	        
	//        System.out.println(node);
			
			for(Integer neighbor:graph.get(node)) {
				exploreSizeConnectedComponent(graph, neighbor, visited,components,nrOfConnectedComponent);
				
			}
			
			return 000000;
		}

    public static long roadsAndLibraries(int n, int c_lib, int c_road, List<List<Integer>> cities) {
    	
    	Map<Integer, List<Integer>> graph=createGraphChar(cities);
    	
    	HashMap<Integer,ArrayList<Integer>>ConnectedComponents=largestCConnectedComponent(graph);
    	
    //	System.out.println(ConnectedComponents);
    	long CCSize=ConnectedComponents.size();
    	
    	long ans=0;
    	
    	if (c_lib>c_road) {
    		long j=0;
    		long k=0;
    		for(ArrayList<Integer> i:ConnectedComponents.values()) {
    			if(i.size()>1) {
    		j+=(long)i.size()-1;
    		k+=(long)i.size();
    		}
    			else {
    				j+=1;
    			}
    			}
    	ans=	(long)CCSize*(long)c_lib+j*(long)c_road+((long)n-k)*(long)c_lib;
    	
    	}
    	else {
    		long k=0;
    		long j=0;
    		for(ArrayList<Integer> i:ConnectedComponents.values()) {
    			
    			j+= (long)i.size();
    			k+=(long)i.size();
    			}
    		
    		
    		ans=(long)j*(long)c_lib+((long)n-(long)k)*(long)c_lib;
    	}
    	
		return ans;
    // Write your code here

    }

}


