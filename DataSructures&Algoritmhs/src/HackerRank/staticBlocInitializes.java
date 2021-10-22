package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class staticBlocInitializes {

static Scanner sc= new Scanner(System.in);

public static int B=sc.nextInt();
public static int H=sc.nextInt();
public static boolean flag=true;

	static {
	try {
	if (H<=0||B<=0) {
		throw new Exception ("Breadth and height must be positive");
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
		

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

