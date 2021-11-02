package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class DepthFirstTravelsal {
	
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

	private static void undirectedPath(Map<Character, List<Character>> gU, char c, char d) {
		System.out.println(gU);
		
	}
	
	public static void main(String[] args) {
	//	Map<Character, Character[]> G = createMap();
		Map<Character, List<Character>> GU = createMapUndirected();
		undirectedPath(GU,'a','b'); 	
	//	hasPathBFS(G,'b','e' );
	//	hasPathDFS(G,'b','e' );
//		DFS( G,'a');
//		System.out.println("II");
//		BFS(G,'a');
	//	System.out.println("II");
	//	DFSRecusion( G,'a');
	}





}
