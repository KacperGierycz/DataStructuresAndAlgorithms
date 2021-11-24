package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GraphFindthenearestclone {
	

	    // Complete the findShortest function below.

	    /*
	     * For the unweighted graph, <name>:
	     *
	     * 1. The number of nodes is <name>Nodes.
	     * 2. The number of edges is <name>Edges.
	     * 3. An edge exists between <name>From[i] to <name>To[i].
	     *
	     */
//	private static Map<Integer, List<Integer>> createGraphChar(List<List<Integer>> cities){
	private static Map<Integer, List<Integer>> createGraphChar(int[] graphFrom, int[] graphTo){

		Map<Integer, List<Integer>> myMap = new HashMap<Integer, List<Integer>>();
		
	//	for(List<Integer> l:cities) {
		for(int i=0;i<graphFrom.length;i++) {
			
			Integer c1=graphFrom[i];
			Integer c2=graphTo[i];
			
			if (!myMap.containsKey(c1)) myMap.put(c1, new ArrayList<Integer>());
			if (!myMap.containsKey(c2)) myMap.put(c2, new ArrayList<Integer>());
			
			myMap.get(c1).add(c2);
			myMap.get(c2).add(c1);			
			
		}
		
		return myMap;		
	}
	
	    static int findShortest(int graphNodes, int[] graphFrom, int[] graphTo, long[] ids, int val) {
		
	    	Map<Integer, List<Integer>> myMap=createGraphChar(graphFrom, graphTo);
	    	
	    	
	    	
	    	
	    	return val;
	        // solve here

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] graphNodesEdges = scanner.nextLine().split(" ");
	        int graphNodes = Integer.parseInt(graphNodesEdges[0].trim());
	        int graphEdges = Integer.parseInt(graphNodesEdges[1].trim());

	        int[] graphFrom = new int[graphEdges];
	        int[] graphTo = new int[graphEdges];

	        for (int i = 0; i < graphEdges; i++) {
	            String[] graphFromTo = scanner.nextLine().split(" ");
	            graphFrom[i] = Integer.parseInt(graphFromTo[0].trim());
	            graphTo[i] = Integer.parseInt(graphFromTo[1].trim());
	        }

	        long[] ids = new long[graphNodes];

	        String[] idsItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < graphNodes; i++) {
	            long idsItem = Long.parseLong(idsItems[i]);
	            ids[i] = idsItem;
	        }

	        int val = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int ans = findShortest(graphNodes, graphFrom, graphTo, ids, val);

	        bufferedWriter.write(String.valueOf(ans));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}

