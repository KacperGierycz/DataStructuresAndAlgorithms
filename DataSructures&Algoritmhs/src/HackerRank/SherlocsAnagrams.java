package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

class Result12 {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     *
     * 1. make all anagrams 1st l length=1 ++; 2nd loop startingPos+1st place++
     * 2. sort their toCharArrays
     * 3. check HashMap if exist put +1
     * 4. if not put new
     * 5. for mapkey(i)-1*mapkey(i)//2
     */

    public static int sherlockAndAnagrams(String s) {
    int ans=0;
    int sl=s.length();
    HashMap<String,Integer> angMap=new HashMap<>();
    
    for(int i=1;i<sl;i++){
        for(int j=0;j+i<=sl;j++){
            String sub=s.substring(j,i+j);
            char[] charSub=sub.toCharArray();
            Arrays.sort(charSub);
            String sortSub=new String(charSub);
            
            if(angMap.containsKey(sortSub)){
                
                angMap.put(sortSub,angMap.get(sortSub)+1);
            }
            else{
              //  System.out.println(sortSub);
                angMap.put(sortSub,1);
            }
        }
    }

for (int i: angMap.values()){    
  //  System.out.println(i);
        ans+=((i-1)*i)/2;
    
}    

return ans;

    }

}

public class SherlocsAnagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result12.sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}