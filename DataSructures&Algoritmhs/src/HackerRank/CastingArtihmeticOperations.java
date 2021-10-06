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

class Result5 {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
    
    long mealL=(long)meal_cost;
    long tipL = (long)tip_percent;
    long taxL = tax_percent;
    long h=100;
    
    long cost = (mealL*tipL/100+mealL*taxL/100+mealL);
    System.out.println(cost);
    int costR=Math.round(cost);
    
    System.out.println(costR);
    
    }

}

public class CastingArtihmeticOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result5.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}

