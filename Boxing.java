import java.util.*;


public class Boxing {
	
	int winnings = 0;
	int totalBoxingWinnings = 0;
	int cash = 0;
	//Player myBoxer = new Player();
	Boxer myBoxer = new Boxer();
	Boxer myOpponent;
	Scanner myScanner = new Scanner (System.in);
	
	public void setBeginMoney(int startTotal) {
		myBoxer.setBucks(startTotal);
		}
	
	public void setPlayerName(String playerName) {
		myBoxer.setBoxerName(playerName);
		}
	
	private Boxer createOpponent() {
		
		Random myRandom = new Random();
		int randomOpponent = myRandom.nextInt(4) + 1;
		
		Boxer myOpponent;
		if (randomOpponent == 1) {
			myOpponent = new Boxer (375, 7, 6, 0.9, "Big Bubba", "Fried Chicken Country, USA", "The Finger Lickin' Good Kid", 100);
        } else if (randomOpponent == 2) {
            myOpponent = new Boxer(95, 4, 11, 0.7, "Wimpy Winston", "His Mamma's Basement", "Ultimo: Ruler of the D+D Relm", 100);
        } else if (randomOpponent == 3) {
            myOpponent = new Boxer(315, 5, 10, 0.85, "Larry Lard Butt", "Coca Cola, USA", "The Big Gulper", 100);
        } else if (randomOpponent == 4) {
            myOpponent = new Boxer(450, 6, 2, 0.95, "King Hippo", "The Middle East",  "The Beast From The Middle East", 100);
        } else {
            myOpponent = new Boxer(250, 5, 10, 1.2, "Mike Tyson", "Brooklyn, New York", "Iron Mike", 100);
        }
        return myOpponent;
		}
	
	
	public int playBoxing() {
				
		 int response = 1;
		 
		 while (response == 1) {
		 
		 cash = myBoxer.getBucks();
		 System.out.println("You have " + cash + " Royale Bucks to wager.");
		 System.out.println("");
		 System.out.println("Do you want to box?");
		 System.out.println("1: Yes, 2: No");
		 response = myScanner.nextInt();
		 
		 if (response > 1) {
			break;
		 }
		 
		 if (response == 1) {
			 
			 int wager = 0;
			 System.out.println("How much do you want to bet?");
			 wager = myScanner.nextInt();
			 
			 if (wager > cash) {
				 System.out.println("You don't have that much money!");
				 break;
			 }
			
			myOpponent = createOpponent();
			String opponentName = myOpponent.getName();
			int opponentWeight = myOpponent.getWeight();
			String opponentFrom = myOpponent.getFrom();
			String opponentKnownAs = myOpponent.getKnownAs();
				
			 System.out.println("Ladies and Gentlemen!");
			 System.out.println("In this corner we have weighing in at " + opponentWeight + " pounds,");
			 System.out.println("All the way from " + opponentFrom + ",");
			 System.out.println("He's known as " + "'" + opponentKnownAs + "'");
			 System.out.println("Here he is, " + opponentName + "!");
			 System.out.println("");
			 
			 System.out.println("And in this corner we have his challenger weighing in at 125 pounds,");
			 System.out.println("From parts unknown,");
			 System.out.println("He's known as 'Mamma's Boy'");
			 String myName = myBoxer.getName();
			 System.out.println("Here he is, " + myName + "!");
			 System.out.println("");
			
			 myBoxer.setHealth(100);
			double myHealth = myBoxer.getHealth();
			double opponentHealth = myOpponent.getHealth();
			 
			int hit = 0;
			
			while (myHealth > 0 && opponentHealth > 0) {
				
				 System.out.println("Your Health: " + myHealth);
				 System.out.println(opponentName + "'s" + " Health: " + opponentHealth);
				 System.out.println("");
				 
				 System.out.println("Come on big boy, what do you want to do?");
				 System.out.println("");
				 System.out.println("1: Right Cross");
				 System.out.println("2: Left Hook");
				 System.out.println("3: Uppercut");
				 System.out.println("4: Windmill");
				 System.out.println("5: Hit Below the Belt");
				 System.out.println("");
				 hit = myScanner.nextInt();
				 
				 if (hit == 1) {
					 
					 boolean hitOrMiss = myBoxer.executeRightCross(myBoxer, myOpponent);
					 
					 	if (hitOrMiss == true) {
					 		double hitPower = myBoxer.getLastHitPower();
					 		opponentHealth = myOpponent.getHealth();
					 	    System.out.println("Nice right cross for a loss of " + hitPower + " health points!");
					 	    System.out.println("");			 		 
					 	} else {
					 		 System.out.println("You missed!");
					 		 System.out.println("");
					 		 }
					 } 
			
				 if (hit == 2) {
					 
					 boolean hitOrMiss = myBoxer.executeLeftHook(myBoxer, myOpponent);
					 
					 	if (hitOrMiss == true) {
					 		double hitPower = myBoxer.getLastHitPower();
					 		opponentHealth = myOpponent.getHealth();
					 	    System.out.println("Ouch, a left hook to the mush for a loss of " + hitPower + " health points!");
					 	    System.out.println("");
					 	} else {
					 		 System.out.println("You missed!");
					 		 System.out.println("");
					 		 }
				 }
				 
				 if (hit == 3) {
					 
					 boolean hitOrMiss = myBoxer.executeUppercut(myBoxer, myOpponent);
					 
					 	if (hitOrMiss == true) {
					 		double hitPower = myBoxer.getLastHitPower();
					 		opponentHealth = myOpponent.getHealth();
					 	    System.out.println("Uppercut right square in the nose for a loss of " + hitPower + " health points!");
					 	    System.out.println("");
					 	} else {
					 		 System.out.println("You missed!");
					 		 System.out.println("");
					 		 }
				 }
				
				 if (hit == 4) {
					 
					 boolean hitOrMiss = myBoxer.executeWindmill(myBoxer, myOpponent);
					 
					 	if (hitOrMiss == true) {
					 		double hitPower = myBoxer.getLastHitPower();
					 		opponentHealth = myOpponent.getHealth();
					 	    System.out.println("Spinning windmill for a loss of " + hitPower + " health points!");
					 	    System.out.println("");
					 	} else {
					 		 System.out.println("You missed!");
					 		 System.out.println("");
					 		 }
				 }
				 
				 if (hit == 5) {
					 
					 boolean hitOrMiss = myBoxer.executeBelowTheBelt(myBoxer, myOpponent);
					 
					 	if (hitOrMiss == true) {
					 		double hitPower = myBoxer.getLastHitPower();
					 		opponentHealth = myOpponent.getHealth();
					 	    System.out.println("Ooooo a dirty hit for a loss of " + hitPower + " health points!");
					 	    System.out.println("");
					 	} else {
					 		 System.out.println("You missed!");
					 		 System.out.println("");
					 		 }
				 }
				 
				if (opponentHealth < 1) {
					System.out.println("You win tough guy!");
					winnings = wager; 
					System.out.println("You won " + winnings + " Royale Bucks!");
					System.out.println("");
					break;
				}
				 
				 Random myRandom = new Random();
				 int opponentHit = myRandom.nextInt(4) + 1;
				 
				 if (opponentHit == 1) {
					 
					 boolean hitOrMiss = myOpponent.takeRightCross(myBoxer, myOpponent);
					 
					 	if (hitOrMiss == true) {
					 		double hitPower = myOpponent.getLastHitPower();
					 		myHealth = myBoxer.getHealth();
					 		System.out.println(opponentName + " with a right cross to the chin for a loss of " + hitPower + " health points!");
					 	    System.out.println("");
					 	} else {
					 		 System.out.println("He missed!");
					 		 System.out.println("");
					 		 }
				 }
			
				 if (opponentHit == 2) {
					 
					 boolean hitOrMiss = myOpponent.takeLeftHook(myBoxer, myOpponent);
					 
					 	if (hitOrMiss == true) {
					 		double hitPower = myOpponent.getLastHitPower();
					 		myHealth = myBoxer.getHealth();
					 		System.out.println(opponentName + " nailed you with a left hook for a loss of " + hitPower + " health points!");
					 	    System.out.println("");
					 	} else {
					 		 System.out.println("He missed!");
					 		 System.out.println("");
					 		 }
				 }
				 
				 if (opponentHit == 3) {
					 
					 boolean hitOrMiss = myOpponent.takeUppercut(myBoxer, myOpponent);
					 
					 	if (hitOrMiss == true) {
					 		double hitPower = myOpponent.getLastHitPower();
					 		myHealth = myBoxer.getHealth();
					 		System.out.println(opponentName + " with a nasty uppercut for a loss of " + hitPower + " health points!");
					 	    System.out.println("");
					 	} else {
					 		 System.out.println("He missed!");
					 		 System.out.println("");
					 		 }
				 }
				 if (opponentHit == 4) {
					 
					 boolean hitOrMiss = myOpponent.takeWindmill(myBoxer, myOpponent);
					 
					 	if (hitOrMiss == true) {
					 		double hitPower = myOpponent.getLastHitPower();
					 		myHealth = myBoxer.getHealth();
					 		System.out.println(opponentName + " lands a swirling and twirling windmill for a loss of " + hitPower + " health points!");
					 	    System.out.println("");
					 	} else {
					 		 System.out.println("He missed!");
					 		 System.out.println("");
					 		 }
				 }
				 
				 if (opponentHit == 5) {
					 
					 boolean hitOrMiss = myOpponent.takeBelowTheBelt(myBoxer, myOpponent);
					 
					 	if (hitOrMiss == true) {
					 		double hitPower = myOpponent.getLastHitPower();
					 		myHealth = myBoxer.getHealth();
					 		System.out.println(opponentName + " with slap below the belt for a loss of " + hitPower + " health points!");
					 	    System.out.println("");
					 	} else {
					 		 System.out.println("He missed!");
					 		 System.out.println("");
					 		 } 
				 }
			
			if (myHealth < 1) {
				System.out.println("Your got your behind whipped!");
				winnings = wager * -1;
				int dontShowNegative = wager;
				
				if (dontShowNegative < 0) {
					dontShowNegative = dontShowNegative * -1;
				}
				System.out.println("You lost " + dontShowNegative + " Royale Bucks.");
				System.out.println("");
				break;
			}
			}
			
		 }
		 myBoxer.setBucks(winnings + cash);
		 myBoxer.setWinnings(winnings);
		 
		 int checkCash = myBoxer.getBucks();
		 	
		 if (checkCash < 1) {
		 		 System.out.println("You have nothing to wager Scuzzball!");
		 		 System.out.println("");
				 response = 2;
				 break;
		 		 }
	 } // end while loop for play game
		 totalBoxingWinnings = myBoxer.getWinnings();
		 return totalBoxingWinnings;
		
	
}



}