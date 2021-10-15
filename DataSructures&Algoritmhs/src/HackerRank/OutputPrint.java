package HackerRank;

import java.util.Scanner;

public class OutputPrint {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String c="               ";
                String xc="000";
                String s1=sc.next();
                int x=sc.nextInt();
                int s1l=s1.length();
                String s2=s1+c.substring(0,15-s1l);
                String x1=String.valueOf(x);
                int x1l=x1.length();
              //  System.out.println(x1l);
                int xx=3-x1l;
                String xxs=xc.substring(0,xx)+x1;
                System.out.println(s2+xxs);
           
                
                //Complete this line
            }
            System.out.println("================================");

    }
}



