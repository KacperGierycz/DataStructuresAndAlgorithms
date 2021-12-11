package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class freeCCDPCanSumTabulation {

	
	private static boolean canSumTab(int targetSum,int[] numbers) {

		boolean [] table=new boolean[targetSum+1];
		
		table[0]=true;
		
		for(int i=0;i<=targetSum;i++) {
			
			if(table[i]==true) {
				for(int j=1;j<numbers.length;j++) {
					if(i+numbers[j]<=targetSum) {
							table[i+numbers[j]]=true;
					}
				}
			}
			
		}
		
		return table[targetSum];
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


        boolean result = freeCCDPCanSumTabulation.canSumTab(qi[0],qi);
//new HashMap<Integer,Long>()
        
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        
        
        bufferedReader.close();
        bufferedWriter.close();
}


}
