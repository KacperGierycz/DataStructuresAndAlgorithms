package jobTasks;

import java.util.Scanner;

public class minibattleship {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		
		int boardS=sc.nextInt();
		int ships=sc.nextInt();
		
		char[][] board=new char[boardS][boardS];
		
		for (int i=0; i<boardS;i++) {
			
			String line=sc.next();
			
			for(int j=0; j<boardS;j++) {
				
				board[i][j]=line.charAt(j);						
				
			}
		}
		
		int[] shipsA=new int[ships+1];
		for(int i=1;i<=ships;i++) {
			int ship= sc.nextInt();
			shipsA[ship]++;
		}
		
		//solution(board,shipsA);
		
	// uncomment to print a output from charArr	
	print(board, boardS, shipsA, ships);
		

		}
		
	private static void solution(char[][] board, int[] shipsA) {
		
	 	int l=board.length;
	 	int s=shipsA.length;
	 	int[]p=new int [s];
	 	
	 	//couting possible places for ships
	 	for(int k=s;s>0;k--) {
//		if(shipsA[k]==0) {
//			continue;
//		}
		for (int i=0; i<l;i++) {
	
			for(int j=0; j<l;j++) {
		
				if (board[i][j]=='X'){
						continue;
				}
				if (board[i][j]=='.'){
					if(j==0) {
						if(board[i][j+1]=='.'&&j<l) {
							if(board[i][j+2]=='.'&&j<l) {
								if(board[i][j+3]=='.'&&j<l) {
									if(board[i][j+4]=='.'&&j<l) {
								}
							}
						}
					}
				
					
				}
				
				
			}}}
	}
	 	
	}

	static void print(char[][]board, int boardS, int[] shipsA, int ships) {
		
		for (int i=0; i<boardS;i++) {
			for(int j=0; j<boardS;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
		for (int i=1;i<=ships;i++) {
			System.out.println(i+" "+shipsA[i]);
		}
		
		System.out.println("XDDDD");
		
	}
		

}
