package dificultyEasy;

public class fff {
	
	  public static String StringChallenge(String str) {

		    int l=str.length();
		    StringBuilder nStr = new StringBuilder();
		    String nstr2=new String();

		    char M ='M';
		    char N ='N';

		    
		    // M dup prev char rem M
		    // N dup next char rem N  

		   for (int i=0; i<l;i++){

		     char curr = str.charAt(i);
		     String chr=str.substring(i,i+1);
		     if (chr.equals(M){
		    	 str.charAt(M);
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
