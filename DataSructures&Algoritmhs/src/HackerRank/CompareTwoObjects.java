package HackerRank;

import java.util.*;

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
        int c= a.score-b.score;
        if (c<0){
            return 1;
        }
        if (c>0){
            return -1;
        }
        else{
            
            // if(a.name.equals(b.name)){
            //     return 0;
            // }
            // else{
            int al=a.name.length();
            int bl=b.name.length();
            int min = Math.min(al,bl);
            for(int i=0;i<min;i++){
             int cal= a.name.charAt(i)-b.name.charAt(i);
                if(cal<0){
                    return -1;
                    
                }
                if(cal>0){
                    return 1;
                    
                }               
                
                
            // }   
               
        }
        
        if(al<bl){
            return -1;
        }
        if(al>bl){
            return 1;
        }
        
        }
        return 0;
    }
    
}


public class CompareTwoObjects {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
