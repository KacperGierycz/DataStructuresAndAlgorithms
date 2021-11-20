package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class GraphV2 {
	
	private static Map<Character, List<Character>> createGraphChar(){
	
		Map<Character, List<Character>> myMap = new HashMap<Character, List<Character>>();
		
		Scanner sc= new Scanner(new InputStreamReader(System.in));
		sc.useDelimiter("[^a-z0]+");
		while (sc.hasNext()) {
			
//			 String token1 = sc.next();
//			 String token2 = sc.next();
			 Character c1=sc.next().charAt(0);
			 if(c1=='0')break;
			 Character c2=sc.next().charAt(0);

			 //	String sc1=sc.next("[a-z]?");
	//		Character c1=sc.next("[a-z]").charAt(0);
	//		System.out.println(sc1);
//			System.out.println(token1);
//			System.out.println(token2);
			
	//		Character c2=sc.next("[a-z]").charAt(0);
			
			if (!myMap.containsKey(c1)) myMap.put(c1, new ArrayList<Character>());
			if (!myMap.containsKey(c2)) myMap.put(c2, new ArrayList<Character>());
			
			myMap.get(c1).add(c2);
			myMap.get(c2).add(c1);
			
		}
		sc.close();
		
		return myMap;		
	}
	
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
	
	private static int largestCConnectedComponent(Map<Integer, List<Integer>> graph) {
		System.out.println("start");
		HashSet<Integer> visited=new HashSet<Integer>();
		List<ArrayList<Integer>>ConnectedComponents=new  ArrayList<ArrayList<Integer>>();
		
		int nrOfConnectedComponent=0;
		for (Integer node:graph.keySet()) {
			System.out.println(node);
			int size=exploreSizeConnectedComponent(graph,node,visited,ConnectedComponents,nrOfConnectedComponent);
			if(size==1) {
				nrOfConnectedComponent++;
			}
		}		
		return ConnectedComponents.size();
	}
		
	private static int exploreSizeConnectedComponent(
		Map<Integer, List<Integer>> graph, Integer node, HashSet<Integer> visited,
		List<ArrayList<Integer>> ConnectedComponents,int nrOfConnectedComponent) {

		if(ConnectedComponents.size()>0){
	        ArrayList<Integer>connectedComponent=ConnectedComponents.get(nrOfConnectedComponent);
	}
	else{ArrayList<Integer>connectedComponent=new ArrayList<Integer>();
	    
	}
		
        if(visited.contains(node)) {
            return 0;
        }
        
        visited.add(node);
        connectedComponent.add(node);
        System.out.println(node);
        
        if(ConnectedComponents.size()==0){
            ConnectedComponents.add(connectedComponent);
        }
	//	int size=1;
		
		for(Integer neighbor:graph.get(node)) {
			exploreSizeConnectedComponent(graph, neighbor, visited,ConnectedComponents,nrOfConnectedComponent);
			
		}
		
		return 1;
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
	
	public class Distance {
		
		public Character name;
		public int distance;

		Distance(Character a, int i){
		
		 this.name=a;
		this.distance=i;
		}
	}
	
	private static int shortestPath(Map<Character, List<Character>> graphChar, Character c, Character d) {

	//	Queue<HashMap<Character, Integer>> queue=new LinkedList<>();
		Queue<Distance> queue1=new LinkedList<>();
		
	//	queue.add(new HashMap(c,0));
		GraphV2 gd= new GraphV2();
	//	GraphV2.Distance d1= gd.new Distance(c,0);
	//	queue1.add(new Distance(c,0));
		queue1.add(gd.new Distance(c,0));
	//	System.out.println(queue1.peek().name);
		
		HashSet<Character>visited=new HashSet<>();
		visited.add(c);
		
		while(queue1.size()>0) {
			
	//		HashMap<Character, Integer> current =queue.poll();
			Distance current1=queue1.poll();
			Character p=current1.name;
			
			if(current1.name==d) {
				return current1.distance;
	//			return current.get(d);
			}
			
			System.out.println(p);
			System.out.println(graphChar);
			
			for(Character neighbour:graphChar.get(p)) {
				System.out.println(neighbour);
				if(!visited.contains(neighbour)) {
					visited.add(neighbour);
					queue1.add(gd.new Distance (neighbour,current1.distance+1));
				}				
			}			
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException {

	
//		Map<Integer,List<Integer>> graph=createGraphInteger();
//		
//		System.out.println(graph);
//		
//		int largestComponent=largestC(graph);
//		
//		System.out.println(largestComponent);
		
		Map<Character, List<Character>> graphChar = createGraphChar();
		int distance= shortestPath(graphChar, 'w' ,'z' );
		System.out.println(distance);
	//	System.out.println(graphChar);
	
	}







	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
