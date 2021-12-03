package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class freecodeDynamicProgrammingCanSum {
	
	private static boolean canSum(int targetSum, int[] qi,HashMap<Integer,Boolean> memo) {
		if(memo==null)memo=new HashMap<Integer,Boolean>();
		if(targetSum==0)return true;
		if(targetSum<0)return false;
		
		for(int i=1;i<qi.length;i++) {
			int remainder=targetSum-qi[i];
			if(canSum(remainder,qi,memo)==true) {
				return true;
			}
		
		}
		
		
		
		return false;
		
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


        boolean result = freecodeDynamicProgrammingCanSum.canSum(qi[0],qi, null);
//new HashMap<Integer,Long>()
        
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        
        
        bufferedReader.close();
        bufferedWriter.close();
        

}
	
}
