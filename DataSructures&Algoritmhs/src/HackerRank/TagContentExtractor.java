package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	String tagPattern=("<(.+)>([^<]+)</\\1>");
            Pattern pattern=Pattern.compile(tagPattern);
            Matcher matcher=pattern.matcher(line);
            boolean found=false;
            
            while(matcher.find()){
                System.out.println(matcher.group(2));
                found=true;
            }
            
            if (!found){
                System.out.println("None");
            }
			
			testCases--;
		}
	}
}
