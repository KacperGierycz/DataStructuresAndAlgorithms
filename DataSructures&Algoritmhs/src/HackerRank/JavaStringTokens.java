package HackerRank;

import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        int ls=s.length();
        if (ls>0)
        {
         
        String[]as=s.split("[^a-zA-Z]+");
           int las=as.length;
        System.out.println(las);
        for(String P:as){
            System.out.println(P);
        }
        }
        else System.out.println(0);
        scan.close();
    }
}


