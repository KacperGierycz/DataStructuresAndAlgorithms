package HackerRank;

import java.io.*;
import java.util.*;

public class StringBasics {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
       
        int suml=A.length()+B.length();
        System.out.println(suml);
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        

        char[]Ac=A.toCharArray();
       // System.out.println(Ac[0]);
        Ac[0]=Character.toUpperCase(Ac[0]);
        String Af=new String(Ac);
        
        
        char[]Bc=B.toCharArray();
        Bc[0]=Character.toUpperCase(Bc[0]);
        String Bf=new String(Bc);
        
        System.out.println(Af+" "+Bf);
    }
}




