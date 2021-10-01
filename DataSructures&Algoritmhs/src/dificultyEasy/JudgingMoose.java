package dificultyEasy;

import java.util.Scanner;

public class JudgingMoose {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int left= sc.nextInt();
		int right = sc.nextInt();
		
		if (left==0&&right==0){
			System.out.println("Not a moose");
			
		}
		else if (left==right) {
			System.out.println("Even "+left*2 );
		}
		if (left<right) {
			System.out.println("Odd "+right*2 );
		}
		if (left>right) {
			System.out.println("Odd "+left*2 );
		}
		
	
		sc.close();
	}

}