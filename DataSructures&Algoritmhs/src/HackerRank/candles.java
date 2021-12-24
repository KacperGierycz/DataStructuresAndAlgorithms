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

class Result25 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    int ipm= 12;
    String pm= ".*PM";
    Pattern p=Pattern.compile(pm);
    Matcher m=p.matcher(s);
    boolean matches=m.matches();
    

     if(matches){ 
             if(s.substring(0,2).equals("12")){
                 s=s.substring(0,8);
                 s=s.substring(2,8);
                 s="00"+s;
        return s;
    }
        int sub=Integer.parseInt(s.substring(0,2));
        sub=ipm+sub;
        System.out.println(sub);
        s=s.substring(0,8);
        s=s.substring(2,8);
        s=sub+s;
    }
     else if(s.equals("12:00:00AM")){
        return "00:00:00";
        }
    else{
       s=s.substring(0,8); 
    }

    return s;
    

    }

}

public class candles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result25.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

