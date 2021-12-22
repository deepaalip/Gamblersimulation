package com.bridgelabz;

public class Gambler {
	public static void main(String[] args) {
	    int stake = 100;
	    int  everydayBet = 1;
	    int num_of_wins_in_day = 0;
		int num_of_losses_in_day = 0;
	    
	    int condition = ((int) Math.floor(Math.random()*10)% 2);
	    
	    for(int day = 1; day <= 20; day++) {    
			System.out.println("DAY-" + day + " :-");
	    
	    int fifty_percent = (50/100)*stake;
		
		while(stake <= (stake + fifty_percent) ||
			  stake >= (stake - fifty_percent)) {
			
	      if ( condition == 1  ) {
	    	  num_of_wins_in_day++; 
	    	stake = stake + everydayBet;
	    	System.out.println("$" + stake + " stake");
	    	System.out.println("Gambler win");
	    }
	    else {
	    	 num_of_losses_in_day++;
	    	 stake = stake - everydayBet;
	    	 System.out.println("$"+ stake + " stake");
	    	 System.out.println("Gambler loose");
	    }
	       
	   
		  if(stake == 150 || stake == 50) {
					break;
			
			}
		}
	       System.out.println("player will resign for the day");
	       
	         
	       System.out.println("Gambler stake :- " + stake);
			System.out.println("Gambler total number of wins in a day :- " + num_of_wins_in_day);
			System.out.println("Gambler total number of losses in a day :- " + num_of_losses_in_day + "\n");
			
			num_of_wins_in_day = 0;  
			num_of_losses_in_day = 0; 
			stake = 100;  
         }
	    
	}
 } 
   
