package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GraphFCC {
	
	public static void DFS(Map<Character, Character[]> G,Character source) {
		Stack<Character>stack=new Stack<Character>();
		stack.add(source);
		
		while(stack.size()>0) {
			Character current=stack.pop();
			System.out.println(current);
		//	Character[]aa=G.get(current);
			for(Character neighbour:G.get(current)) {
			stack.push(neighbour);	
			}
		}
	}
	
	public static void DFSRecusion(Map<Character, Character[]> G,Character source) {
		System.out.println(source);
		for(Character neighbour:G.get(source)) {
			DFSRecusion(G,neighbour);
		}	
	}
	
	public static void BFS(Map<Character, Character[]> G,Character source) {
		Queue<Character> queue= new LinkedList<>();
		queue.add(source);
		while(queue.size()>0) {
			Character current=queue.poll();
			System.out.println(current);
			for(Character neighbour:G.get(current)) {
				queue.add(neighbour);
			}
		}		
	}
	
	public static String hasPathDFS(Map<Character, Character[]> G,Character source,Character dest) {
		Stack<Character>stack=new Stack<Character>();
		stack.add(source);
		
		while(stack.size()>0) {
			Character current=stack.pop();
			System.out.println(current);
		//	Character[]aa=G.get(current);
			
			if (current==dest) {
				System.out.println("Exit Found");
				return "Exit Found";
				
			}
			
			for(Character neighbour:G.get(current)) {
			stack.push(neighbour);	
			
			}
		}
		System.out.println("No Way out");
		return "No Way out";	
	}
	
	public static String hasPathBFS(Map<Character, Character[]> G,Character source,Character dest) {
		Queue<Character> queue= new LinkedList<>();
		queue.add(source);
		while(queue.size()>0) {
			Character current=queue.poll();
			if (current==dest) {
				System.out.println("Exit Found");
				return "Exit Found";
				
			}
			System.out.println(current);
			for(Character neighbour:G.get(current)) {
				queue.add(neighbour);
			}
			}
		System.out.println("No Way out");
		return "No Way out";		
	}
	

	private static Map<Character, Character[]> createMap() {
		Character[]aa= {'c','b'},ab={'d'},ac= {'e'},ad= {'f'},ae= {},af= {};

		
	    Map<Character, Character[]> myMap = new HashMap<Character, Character[]>();
	    myMap.put('a', aa);
	    myMap.put('b', ab);
	    myMap.put('c', ac);
	    myMap.put('d', ad);
	    myMap.put('e', ae);
	    myMap.put('f', af);
	    return myMap;
	}
	private static Map<Character, List<Character>> createMapUndirected() {
	    Map<Character, List<Character>> myMap = new HashMap<Character, List<Character>>();
		Character[][] edges = {
				{'i', 'j'},
				{'k', 'i'},
				{'m', 'k'},
				{'k', 'l'},
				{'o', 'n'}
		};
		for(Character[] c:edges) {
		if(!myMap.containsKey(c[0])){
			myMap.put(c[0], new ArrayList<>());
		}
		if(!myMap.containsKey(c[1])){
			myMap.put(c[1], new ArrayList<>());
		}
		List<Character>cp0=myMap.get(c[0]);
		cp0.add(c[1]);
		List<Character>cp1=myMap.get(c[1]);
		cp1.add(c[0]);
		
		
		}
		
		return myMap;
		
	}

	private static boolean undirectedPath(
			Map<Character, List<Character>> gU, char src, char dest,Set<Character> vis) {
//		Set<Character> set = new HashSet<Character> ();
		
		if (src==dest) {
			System.out.println("true");
			return true;
		}
		
		if (vis.contains(src)) {
			System.out.println("false");
			return false;
		}
		
		vis.add(src);
	// 	System.out.println(src);
		
		for(Character neighbour:gU.get(src)) {
			if(undirectedPath(gU,neighbour,dest,vis)==true) {
				return true;
			}
		}
		
		//System.out.println(gU);
		return false;
		
	}
	
	private static Map<Integer, List<Integer>> createGraphInteger() {
	    Map<Integer, List<Integer>> myMap = new HashMap<Integer, List<Integer>>();

	    
	    Scanner sc=new Scanner(System.in);
	    while(sc.hasNext()) {
	    
		   String s=sc.nextLine().trim(); //Line().trim		   
		   System.out.println(s);
		   String[]ssplit=s.split("[^0-9]+");	
		   if (s.equals(null)||s.equals("")){
			   break;
		   }
//		   for(String i:ssplit) {
//			   System.out.println(i);
//		   }
//		   
//		   
//		   Pattern pattern = Pattern.compile("(\\d+)\\D+");
//		    ArrayList<String> list = new ArrayList<String>();
//		    Matcher matcher = pattern.matcher(s);
//		    while(matcher.find()) {
//		        list.add(matcher.group(1));
//		    }
//		    
//		    // if you really need an array
//		    String[] array = list.toArray(new String[0]);
//		    System.out.println(list);
//		    System.out.println(array[0]);
//		   
//		   System.out.println(ssplit[3]);
	//	   myMap.put(Integer.parseInt(ssplit[0]), new ArrayList<>());
		   int ii=0;
		   for(String si:ssplit) {
			   if (s==null||s=="") {
				   break;
			   }
			   if(ii==0) {
				   myMap.put(Integer.parseInt(si), new ArrayList<Integer>());
			   ii++;
			   }
			   else {
				List<Integer>cp0=myMap.get(Integer.parseInt(ssplit[0]));
				cp0.add(Integer.parseInt(si));
			   
		   }
	    }
	    }
	    sc.close();  

				return myMap;
				}
	
	private static int connectedComponentCount(Map<Integer, List<Integer>> gI) {
		Set<Integer> visited=new HashSet<>();
		int count =0;
		
		for (Integer node:gI.keySet()) {
			if (explore(gI,node,visited)==true) {
				count++;
			}
		}
		return count;
	}
	
	private static boolean explore(Map<Integer, List<Integer>> gI, Integer node, Set<Integer> visited) {
		if (visited.contains(node)) return false;
		
		visited.add(node);
		
		for (Integer neighbour:gI.get(node)) {
			explore(gI,neighbour,visited);
		}
		
		return true;
	}

	public static void main(String[] args) {
	//	Map<Character, Character[]> G = createMap();
	//	Map<Character, List<Character>> GU = createMapUndirected();

	//	undirectedPath(GU,'i','o',new HashSet<Character>()); 	
		Map<Integer,List<Integer>> GI=createGraphInteger();
		int cc=connectedComponentCount(GI);
		System.out.println(cc);
	//	hasPathBFS(G,'b','e' );
	//	hasPathDFS(G,'b','e' );
//		DFS( G,'a');
//		System.out.println("II");
//		BFS(G,'a');
	//	System.out.println("II");
	//	DFSRecusion( G,'a');
	}









}
