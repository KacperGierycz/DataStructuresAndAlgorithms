package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class freCCDPBestSumTabulation {
	private static ArrayList<Integer> canSumTab(int targetSum,int[] numbers) {

		
		ArrayList<Integer> [] table=new   ArrayList[targetSum+1];
		
		table[0]=new  ArrayList<Integer>();
		
		for(int i=0;i<=targetSum;i++) {
			if(table[i]!=null) {
				
				for(int j=1;j<numbers.length;j++) {
					if(i+numbers[j]<=targetSum) {
						

							ArrayList<Integer> k=new ArrayList<>();
							k=(ArrayList<Integer>) table[i].clone();
							k.add(numbers[j]);
							if((table[i+numbers[j]]==null)
									||table[i+numbers[j]].size()>k.size()) {
							
							table[i+numbers[j]]=k;
							}
					
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


        ArrayList<Integer> result = freCCDPBestSumTabulation.canSumTab(qi[0],qi);
//new HashMap<Integer,Long>()
        
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        
        
        bufferedReader.close();
        bufferedWriter.close();
}
}

