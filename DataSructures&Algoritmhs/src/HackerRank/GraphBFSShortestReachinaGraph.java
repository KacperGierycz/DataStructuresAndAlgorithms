package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class GraphBFSShortestReachinaGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i = 1; i <= q; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
         //   GraphNode g = new GraphNode(n);
            Map<Integer, List<Integer>> myMap = new HashMap<Integer, List<Integer>>();
            for(int j = 1; j <= m; j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
              //  g.addEdge(a-1, b-1);
    			if (!myMap.containsKey(a)) myMap.put(a, new ArrayList<Integer>());
    			if (!myMap.containsKey(b)) myMap.put(b, new ArrayList<Integer>());
    			
    			myMap.get(a).add(b);
    			myMap.get(b).add(a);	
            }
            int s = sc.nextInt();
            int[] results = new int[n];
            Arrays.fill(results, -1);
            getDistance(myMap, results, s);
            for(int k = 0; k < n; k++){
                if(k != s-1) System.out.print(results[k]+ " ");
            }
            
            System.out.println();
        }
    }

	private static void getDistance(Map<Integer, List<Integer>> G, int[] i, int source) {
	if (!G.containsKey(source)) return;

			HashMap<Integer,Integer> visited=new HashMap<Integer,Integer>();
			visited.put(source,0);
			Queue<Integer> queue= new LinkedList<>();
			queue.add(source);
			int dist=6;

			while(queue.size()>0) {
				
				int current=queue.poll();
				if (!visited.containsKey(current)) {

				}
						

				for(Integer neighbour:G.get(current)) {
					if (!visited.containsKey((Integer)neighbour)) {				
												
						queue.add(neighbour);
						visited.put(neighbour,visited.get(current)+6);
						i[neighbour-1]=visited.get(neighbour);
					}
				}
				dist+=6;
				}
			

		}
		
	
}
