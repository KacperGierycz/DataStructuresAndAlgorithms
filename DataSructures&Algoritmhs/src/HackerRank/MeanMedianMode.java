package HackerRank;

import java.io.*;
import java.util.*;

public class MeanMedianMode {
    
	  public static double Mean(int n, int[]nn){
	        
	        double mean=0;
	        for(int i=0;i<n;i++) {
	            mean=mean+nn[i];
	            
	        }
	        mean=mean/n;
	        
	     //   System.out.println(mean);
	        return mean;
	    }
	    
	    public static double Median(int n,int[] nn){
	                double median =0;

	                Arrays.sort(nn);

	        
	           if(n%2==0) {
	            median=(nn[n/2-1]+nn[n/2])/2.0;
	        //    System.out.println(median);

	            return median;
	        }
	        else {
	            median=nn[n/2];
	        return    median;
	        }
	    }
	    
	    private static int Mode(int n, int[] nn) {

	        int[] modcount=new int[n];
	        int bestModCurr=0;
	        int bestIndexMod=0;
	        Arrays.sort(nn);

	        HashMap<Integer,Integer> mn =new HashMap<Integer,Integer>();
	        
	        for(int i=0;i<n;i++) {

	                if(mn.containsKey(nn[i])) {
	                    mn.put(nn[i], mn.get(nn[i])+1);
	                }
	                else {
	                    mn.put(nn[i],1);
	                }                       
	        }
	        
	        for (int i=0;i<n;i++) {
	    
	           // System.out.println(mn.get(nn[i]));
	            if(mn.get(nn[i])>bestModCurr) {
	                bestModCurr=mn.get(nn[i]);
	                bestIndexMod=i;
	            }
	            
	            modcount[i]=mn.get(nn[i]);
	            
	        }
	        
	        
	        if (modcount[bestIndexMod]==1) {
	            return nn[0];
	        }
	        else {
	            return nn[bestIndexMod];
	        }
	        
	    }
    

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n=Integer.parseInt(br.readLine());
        String[] ni=br.readLine().split(" ");
        int[] nn=new int[n];
        for(int i=0;i<n;i++){
            nn[i]=Integer.parseInt(ni[i]);
         //   System.out.println(nn[i]);
        }
        
       double mean= Mean(n,nn);
       double median= Median(n,nn);
       int mode=Mode(n,nn);
       
     System.out.println(mean);
	System.out.println(median);
	System.out.println(mode);
       
    }


}
