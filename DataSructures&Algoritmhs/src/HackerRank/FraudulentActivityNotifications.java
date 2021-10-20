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

class Result15 {
    /*
    * Complete the 'activityNotifications' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts following parameters:
    *  1. INTEGER_ARRAY expenditure
    *  2. INTEGER d
    */
    public static int activityNotifications_BinaryS
    (List<Integer> expenditure, int d) {
    
    int ans=0;
    int end = expenditure.size();
    List<Integer> daysOfTrail= buildFirstDSizeList(expenditure,d); 
    Collections.sort(daysOfTrail);
    
    for(int i=d;i<end;i++){
        int value =expenditure.get(i);
       ans=isValueBigerThenMedian(ans, d, daysOfTrail, value );
   //    System.out.println(expenditure.get(i-d));
       int firstValueToRemove=expenditure.get(i-d);
       int firstIndexToRemove=binarySerchMod(daysOfTrail,firstValueToRemove);
       daysOfTrail.remove(firstIndexToRemove);
  //     int secondIndexOfValueToAdd=binarySerchMod(daysOfTrail,value);
       if(daysOfTrail.get(d-2)-value<0){
           daysOfTrail.add(value);
       }
       else{
       daysOfTrail.add(binarySerchMod(daysOfTrail,value),value);
       }
    }
    
    return ans;
    }
    
    public static int isValueBigerThenMedian
    (int ans,int d, List<Integer> daysOfTrail, int value ){
        double med =0;
               if(d%2==0){
               med=((double)(daysOfTrail.get(d/2-1)+daysOfTrail.get(d/2)))/2;
           }
           else{
               med=(double) daysOfTrail.get(d/2);
           }
           if((double)value>=2*med){
               ans+=1;
           }
           
           return ans; 
    }
    
    public static List<Integer> buildFirstDSizeList
    (List<Integer> expenditures,int d){    
    List<Integer> daysOfTrail=new ArrayList<>();
    for (int i=0;i<d;i++){
        daysOfTrail.add(expenditures.get(i));
    }
        return daysOfTrail;
     }
    
   private static int binarySerchMod(List<Integer> daysOfTrail, int value) {
       int beg =0,end=daysOfTrail.size()-1,ans=0;
       while(beg<=end){
          int mid = beg + (end-beg)/2;
                      // If x greater, ignore left half
          if(daysOfTrail.get(mid)==value) {
        	  return mid;
          }
          if (daysOfTrail.get(mid)<=value) {
           beg=mid+1;
          }     // If x is smaller, ignore right half
          else{
           end=mid-1;
       }
       }
       return beg;
   
   }

   public static int activityNotifications(List<Integer> expenditure, int d) {
   int s=expenditure.size();
   int ans=0;
   List<Integer> m=new ArrayList<>();
   
   for(int i=0; i<s;i++){
       
       if(i<d){
           m.add(expenditure.get(i));
   //        System.out.println(expenditure.get(i));
       }
       else{
    //   }
   //    if(i>=d){
           double med=0;
           
               // for(int j=i-(d-1)-1;j<i;j++){
               //     m.add(expenditure.get(j));
               //     System.out.println(expenditure.get(j));

               // }
         //      i-d,i
         Collections.sort(m);
           if(d%2==0){
               med=((double)(m.get(d/2-1)+m.get(d/2)))/2;
           }
           else{
               med=m.get(d/2);
           }
           
    //       for(int j=i-(d-1);j<d;j++){
           if((double)expenditure.get(i)>=2*med){
               ans+=1;
           }
      //     }
           
           m.remove(0);
           m.add(expenditure.get(i));
      //     System.out.println(expenditure.get(i));
       }
       
   }

return ans;
   }

}

public class FraudulentActivityNotifications {
   public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
       BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

       String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

       int n = Integer.parseInt(firstMultipleInput[0]);

       int d = Integer.parseInt(firstMultipleInput[1]);

       List<Integer> expenditure = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
           .map(Integer::parseInt)
           .collect(toList());

       int result = Result15.activityNotifications_BinaryS(expenditure, d);

       bufferedWriter.write(String.valueOf(result));
       bufferedWriter.newLine();

       bufferedReader.close();
       bufferedWriter.close();
   }
}

