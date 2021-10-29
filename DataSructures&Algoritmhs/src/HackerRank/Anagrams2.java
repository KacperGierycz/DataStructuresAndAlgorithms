package HackerRank;

import java.util.Scanner;

import java.util.Scanner;

public class Anagrams2 {

    static boolean isAnagram(String a, String b) {
        
        int[]A=new int[256];
        int[]B=new int[256];
        char[]ar=a.toCharArray();
        char[]br=b.toCharArray();
        int al=ar.length;
        int bl=br.length;
        if(a==null||b==null||a==""||b=="")throw new IllegalArgumentException();
        if (al!=bl)return false;
        
        for(char c:ar){
            c=Character.toLowerCase(c);
            A[c]++;
        }
        
        for(char c:br){
            c=Character.toLowerCase(c);
            B[c]++;
        }
        
        for(int i=0;i<256;i++){
            if(A[i]!=B[i])return false;
        }
        
        return true;
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
