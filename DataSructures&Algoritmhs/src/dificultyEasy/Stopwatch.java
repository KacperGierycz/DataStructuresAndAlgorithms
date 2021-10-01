package dificultyEasy;

import java.util.ArrayList;
import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// String moves=sc.nextLine();
		int moves2 = sc.nextInt();
		/*
		 * ArrayList<Integer> numbers= new ArrayList<Integer>(); while (sc.hasNext()){
		 * 
		 * numbers.add(sc.nextInt());
		 * 
		 * 
		 * 
		 * }
		 */

		if (moves2 % 2 != 0) {
			System.out.println("still running");
		} else {
			int solution = calculate(moves2, sc);
			System.out.println(solution);
		}

		// System.out.println(moves);

		sc.close();

	}

	private static int calculate(int moves2, Scanner sc) {
		// Scanner sc = new Scanner(System.in);

		int press = sc.nextInt();
		int apress = press;
		boolean on = false;
		int firstPres = 1;
		int timer = 0;

		while (firstPres <= moves2) {

			if (press == 0) {
				int n = sc.nextInt();
				timer = n;
				press = timer;
				firstPres++;
				firstPres++;
				on = true;
				continue;
			} else if (on == true) {
				int n = sc.nextInt();
				int s = sc.nextInt();
				timer = timer + (s - n);
				firstPres++;
				firstPres++;
				continue;
			}
			
			  else if(on==false) {
					int n = sc.nextInt();
					timer = timer + (n - press);
					firstPres++;
					firstPres++;
					on=true;
					continue;

			 
		}
	}
		sc.close();

		return timer;

}
}