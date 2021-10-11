package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result11 {

    /*
     * Complete the 'commonChild' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static int commonChild(String s1, String s2) {

        int s1l=s1.length(), s2l=s2.length();        
        int[][]a=new int[s1l+1][s2l+1];
    
        for(int i=1;i<=s1l;i++){
            for(int j=1;j<=s2l;j++){
                
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    a[i][j]=a[i-1][j-1]+1;        
                }
                else{
                    a[i][j]=Math.max(a[i][j-1],a[i-1][j]);
                }                
            }
        }

        return a[s1l][s2l];


    }

}

public class LCS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = Result11.commonChild(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
