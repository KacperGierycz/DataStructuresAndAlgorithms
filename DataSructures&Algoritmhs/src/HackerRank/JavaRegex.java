package HackerRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
String a="(2([0-4]\\d|5[0-5])|1\\d{2}|(0?)\\d{2}|(0?{2}\\d))";

String pattern=a+"[.]"+a+"[.]"+a+"[.]"+a;


}
