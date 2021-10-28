package HackerRank;

import java.io.*;
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int Al=A.length();
        char[]Ac=A.toCharArray();
        boolean ans=false;
        for(int i =0;i<Al;i++){
            if(Ac[i]==Ac[Al-i-1]){
                ans=true;
            }
            else{
                ans=false;
            }
        }
        
        String ansP= (ans?"Yes":"No");
        System.out.println(ansP);
    }
}




