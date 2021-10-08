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

class Result10 {

    /*
     * Complete the 'whatFlavors' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY cost
     *  2. INTEGER money
     */

	   public static void whatFlavors(List<Integer> cost, int money) {
		    HashMap<Integer, Integer> costInd=new HashMap<>();
		    
		    for(int i =0;i<cost.size();i++){
		        
		       int c= cost.get(i);
		       int mc=money-c;
		       
		       if (costInd.containsKey(mc)){
		           int first=costInd.get(mc);
		            System.out.println((first+1)+" "+(i+1));
		       }
		       else{
		           costInd.put(cost.get(i),i);
		       }
		        
		    }

		    }

		}

public class IceCreamPerlor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int money = Integer.parseInt(bufferedReader.readLine().trim());

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> cost = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                Result10.whatFlavors(cost, money);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

