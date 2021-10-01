package dificultyEasy;

import java.util.Scanner;

public class TrikS {
	
	
	
	

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		String moves=sc.nextLine();
		int moves2=sc.nextInt();
		if (moves2%2==0) {
			System.out.println("Bob");
		}
		else {System.out.println("Alice");
		}
		
	//	System.out.println(moves);
		int solution= calculate(moves);
		System.out.println(solution);
		
		sc.close();
	
}

	private static int calculate(String moves) {
		
		int i=moves.length();
		String A="A";
		String B="B";
		String C="C";
		//bP basePoint
		int bP=1;
		
		for (int j=0; j<i;j++) {
			//c = current position
			String c=moves.substring(j,j+1);
			if(bP==1) {
				if (c.equals(A)) {
					bP=2;
					continue;
				}
				if (c.equals(C)) {
					bP=3;
					continue;
				}
			}
			if(bP==2) {
				if(c.equals(A)) {
					bP=1;
					continue;
				}
				if(c.equals(B)) {
					bP=3;
					continue;
				}
			}
			if(bP==3) {
				if (c.equals(B)) {
					bP=2;
					continue;
				}
				if(c.equals(C)) {
					bP=1;
					continue;
				}
			}
		}
		
		return bP;
	}
}
