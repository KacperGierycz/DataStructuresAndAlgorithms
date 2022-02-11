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

class Brackets {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    
                    Stack<Character> ST=new Stack<Character>();
                    for(Character c : s.toCharArray()) {
                        if (c == '{' || c == '[' || c == '(') {
                            ST.push(c);
                        }
                        else {
                            if (ST.empty() ||
     (ST.peek() != '{' && c == '}') ||
      (ST.peek() != '[' && c == ']') ||
       (ST.peek() != '(' && c == ')')) {
        return "NO";
                            }
                            ST.pop();
                        }
                    }
                    return ST.empty()? "YES" : "NO";


    }

}

 class Solution111 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Brackets.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

