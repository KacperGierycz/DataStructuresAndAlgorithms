package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result15 {
    /*
     * Complete the 'activityNotifications' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expenditure
     *  2. INTEGER d
     */
    public static int activityNotifications(List<Integer> expenditure, int d) {
    int s=expenditure.size();
    int ans=0;
    List<Integer> m=new ArrayList<>();
    
    for(int i=0; i<s;i++){
        
        if(i<d){
            m.add(expenditure.get(i));
    //        System.out.println(expenditure.get(i));
        }
        else{
     //   }
    //    if(i>=d){
            double med=0;
            
                // for(int j=i-(d-1)-1;j<i;j++){
                //     m.add(expenditure.get(j));
                //     System.out.println(expenditure.get(j));

                // }
          //      i-d,i
          Collections.sort(m);
            if(d%2==0){
                med=((double)(m.get(d/2-1)+m.get(d/2)))/2;
            }
            else{
                med=m.get(d/2);
            }
            
     //       for(int j=i-(d-1);j<d;j++){
            if((double)expenditure.get(i)>=2*med){
                ans+=1;
            }
       //     }
            
            m.remove(0);
            m.add(expenditure.get(i));
       //     System.out.println(expenditure.get(i));
        }
        
    }

return ans;
    }

}

public class FraudulentActivityNotifications {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> expenditure = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result15.activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

