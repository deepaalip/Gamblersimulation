package com.bridgelabz;

public class Gambler {
	public static void main(String[] args) {
	    int stake = 100;
	    int  everydayBet = 1;
	    
	    int condition = ((int) Math.floor(Math.random()*10)% 2);
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
   }
   
   
}