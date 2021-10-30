package HackerRank;

import java.util.HashMap;
import java.util.Map;
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
	
	

	private static Map<Character, Character[]> createMap() {
		Character[]aa= {'b','c'},ab={'d'},ac= {'e'},ad= {'f'},ae= {},af= {};

		
	    Map<Character, Character[]> myMap = new HashMap<Character, Character[]>();
	    myMap.put('a', aa);
	    myMap.put('b', ab);
	    myMap.put('c', ac);
	    myMap.put('d', ad);
	    myMap.put('e', ae);
	    myMap.put('f', af);
	    return myMap;
	}

	public static void main(String[] args) {
		Map<Character, Character[]> G = createMap();
		DFS( G,'a');
	}

}
