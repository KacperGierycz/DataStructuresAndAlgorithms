package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class freCCDPGridTravelerTabulation {
	
	
	private static long gridTab(int i, int j) {

		long[][]grid=new long[i+1][j+1];
		grid[1][1]=1;
		
		for(int m=0;m<=i;m++) {
			for(int n=0;n<=j;n++) {
			long current=grid[m][n];
			if(n+1<=j)grid[m][n+1]+=current;
			if(m+1<=i)grid[m+1][n]+=current;
			}
		}
		
		return grid[i][j];
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


        long result = freCCDPGridTravelerTabulation.gridTab(qi[0],qi[1]);
//new HashMap<Integer,Long>()
        
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        
        
        bufferedReader.close();
        bufferedWriter.close();
}


	
}
