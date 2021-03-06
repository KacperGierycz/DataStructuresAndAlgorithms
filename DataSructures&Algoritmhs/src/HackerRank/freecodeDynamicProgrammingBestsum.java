package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class freecodeDynamicProgrammingBestsum {

	public static List<Integer> bestSum(int targetSum, int[] numbers,
			HashMap<Integer,List<Integer>>memo) {
		
		if(memo==null)memo=new HashMap<Integer,List<Integer>>();
		if(memo.containsKey(targetSum)) return memo.get(targetSum);
		if (targetSum==0)return new ArrayList<Integer>();
		if(targetSum<0)return null;

		
		List<Integer> shortestCompbination=null;
		
		for(int i =1;i<numbers.length;i++) {
			int remainder=targetSum-numbers[i];
			List<Integer> remainderCombination=bestSum(remainder,numbers,memo);
			if(remainderCombination!=null) {
			//	List<Integer>combination =remainderCombination;
			//	combination.add(numbers[i]);
			//	remainderCombination.add(numbers[i]);
				
				ArrayList<Integer> combination=new ArrayList<Integer>();
				combination.addAll(remainderCombination);
				combination.add(numbers[i]);
				if(shortestCompbination==null || combination.size()<shortestCompbination.size()) {
					shortestCompbination= combination;
				}	
			}
			}

		memo.put(targetSum, shortestCompbination);
		
		
		return shortestCompbination;
	}
	
	
	
	
	   public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        String sq = (bufferedReader.readLine().trim());
	        
	        String[]q=sq.split(" ");
	        int []qi=new int[q.length];
	        for(int i=0; i<q.length; i++) {
	        	qi[i]=Integer.parseInt(q[i]);
	        }
	        
	       // int q = Integer.parseInt(bufferedReader.readLine().trim());


	        List<Integer> result = freecodeDynamicProgrammingBestsum.bestSum(qi[0],qi,null);
	//new HashMap<Integer,Long>()
	        
	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();
	        
	        
	        bufferedReader.close();
	        bufferedWriter.close();
	        

	}
}
