package dificultyEasy;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	while (sc.hasNextLong()) {
	   long a = sc.nextLong(), b = sc.nextLong();
	   // solve test case and output answer
	   int i =1;
//	String str = new String();
//	str.concat('s');
//    String chr=str.substring(i,i+1);

    public static String StringChallenge(String str) {

        int l=str.length;
        StringBuilder nStr = new StringBuilder();
        String nstr2=new String;

        Char M ='M';
        Char N ='N';

        // M dup prev char rem M
        // N dup next char rem N  

       for (int i=0; i<l;i++){

         curr char = str.charAt(i);
         String chr=str.substring(i,i+1);
         if (char.equals(M){
           if (i==0){
             nstr2.concat(substring(i+1,i+2));
           }
          else{
            nstr2.concat(str.substring(i-1,i));
          }
         }
          if (chr.equals(N){
            if (i==l-1){
              breake;

            }
            else{
              nstr2.concat(substring(i+1,i+2));
            }
          }
         else{
           nstr.concat(substring(i+1,i+2));
         }

       }
      

        // if(!char.equals(M)||(char.equals(N)) {

        return str;
      }
	
	}
	
}
}

