package jobTasks;

import java.util.Hashtable;
import java.util.Scanner;

public class travel {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
//	Hashtable<String, Integer> citiesOfSingleTrip= new Hashtable<String, Integer>();
	
	int nrOfTrips= sc.nextInt();
	
	if (nrOfTrips==0) {
		System.out.println("0");
	}
	
	int[]howManyCitiesPerTrip=new int[nrOfTrips];
	
	for (int i=0;i<nrOfTrips;i++) {
		
		Hashtable<String, Integer> citiesOfSingleTrip =  new Hashtable<String, Integer>();
		int nrOfCities=sc.nextInt();
		for (int j=0;j<nrOfCities;j++) {
		 
			
			String citi=sc.next();
			
			if(citiesOfSingleTrip.contains(citi)) {
				citiesOfSingleTrip.put(citi, citiesOfSingleTrip.get(citi)+1);				
			}
			else {
				citiesOfSingleTrip.put(citi, 1);
			}
		}
		howManyCitiesPerTrip[i]=citiesOfSingleTrip.size();
		citiesOfSingleTrip.clear();
		
	}
	

	for (int k=0;k<howManyCitiesPerTrip.length;k++) {
		System.out.println(howManyCitiesPerTrip[k]);
	}

	
	
	sc.close();
	}

}
