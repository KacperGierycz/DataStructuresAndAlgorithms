package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result24 {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    
    StringBuffer sb=new StringBuffer();
    
    for(int j=1;j<=n;j++){
     //   System.out.println(n-j);
    for(int i=j;i<n;i++){
        sb.append(' ');
      //  System.out.print(" ");
    }
   // System.out.println(j);
    for(int k=0;k<j;k++){
    	sb.append('#');
    //    System.out.print("#");
    }
    
   // sb.append('\n');
    sb.append(System.getProperty("line.separator"));
   // System.out.println();
    }
    
    System.out.print(sb);
    }

}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result24.staircase(n);

        bufferedReader.close();
    }
}