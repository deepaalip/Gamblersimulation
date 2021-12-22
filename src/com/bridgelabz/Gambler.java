package com.bridgelabz;

public class Gambler {
	public static void main(String[] args) {
	    int stake = 100;
	    int  everydayBet = 1;
	    
	    int condition = ((int) Math.floor(Math.random()*10)% 2);
	    int fifty_percent = (50/100)*stake;
		
		while(stake <= (stake + fifty_percent) ||
			  stake >= (stake - fifty_percent)) {
			
	      if ( condition == 1  ) {
	    	stake = stake + everydayBet;
	    	System.out.println("$" + stake + " stake");
	    	System.out.println("Gambler win");
	    }
	    else {
	    	 stake = stake - everydayBet;
	    	 System.out.println("$"+ stake + " stake");
	    	 System.out.println("Gambler loose");
	    }
	      
	      if(stake == 150 || stake == 50) {
					break;
			
			}
	       System.out.println("player will resign for the day");
         }
	}
   
   
}