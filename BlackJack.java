import java.util.*;
import java.util.ArrayList;

public class BlackJack {

	int winnings = 0;
	int totalBlackJackWinnings = 0;
	int cash = 0;
	//int firstRound = 0;
	Player myBlackJackPlayer = new Player();
	Scanner myScanner = new Scanner (System.in);

	public void setBeginMoney(int startTotal) {
		
		//if (firstRound == 0) {
		myBlackJackPlayer.setBucks(startTotal);
		//firstRound = 1;
		//}
	
	}
	
	public int playBlackJack() {
			
		
		 OddsMaker blackJackOdds = new OddsMaker();
		 blackJackOdds.initializeBlackJackOdds();
		 int response = 1;
		 
		 while (response == 1) {
		 
		 cash = myBlackJackPlayer.getBucks();
		 System.out.println("You have " + cash + " Royale Bucks to wager.");
		 System.out.println("");
		 System.out.println("Do you want to play?");
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
			 
			 //OddsMaker blackJackOdds = new OddsMaker();
			 // blackJackOdds.initializeBlackJackOdds();
			 int playerFirstCard = blackJackOdds.calculateBlackJackOdds();
			 int playerSecondCard = blackJackOdds.calculateBlackJackOdds();
			 int dealerFirstCard = blackJackOdds.calculateBlackJackOdds();
			 int dealerSecondCard = blackJackOdds.calculateBlackJackOdds();
			 
			 //Random myRandom = new Random();
			 //int playerFirstCard = myRandom.nextInt(9) + 1;
			 //int playerSecondCard = myRandom.nextInt(9) + 1;
			 //int dealerFirstCard = myRandom.nextInt(9) + 1;
			 //int dealerSecondCard = myRandom.nextInt(9) + 1;
			 
			 System.out.println("Your first two cards are " + playerFirstCard + " and " + playerSecondCard + ".");
			 System.out.println("For a total of " + (playerFirstCard + playerSecondCard) + ".");
			 System.out.println("The dealer's first card is " + dealerFirstCard + ".");
			 
			 int dealerTotal = dealerFirstCard + dealerSecondCard;
			 int playerTotal = playerFirstCard + playerSecondCard;
			 
			 int hitMe = 1;
			 int playerCard = 0;
			 int firstRound = 1;
			 
			 while (hitMe == 1) {
				
				 System.out.println("What do you want to do?");
				 System.out.println("1: Hit me!, 2: Done");
				 hitMe = myScanner.nextInt();
			 
			 		if (hitMe > 2) {
			 			hitMe = 2;
			 			}
			 	
			 		if (hitMe ==1 && playerTotal < 22) {
			 		
			 			
			 			playerCard = blackJackOdds.calculateBlackJackOdds();
			 			//playerCard = myRandom.nextInt(9) + 1;
			 			playerTotal = playerTotal + playerCard;
			 			System.out.println("You drew a " + playerCard + ".");
			 			System.out.println("Your total is " + playerTotal + ".");
			 			
			 			if (firstRound == 1) {
			 				System.out.println("The dealer's second card is " + dealerSecondCard + ".");
				 			System.out.println("For a total of " + dealerTotal + ".");
				 			firstRound++;
			 			}
			 			}
			 	
			 		if (hitMe == 2 || playerTotal > 21) {
			 			break;
			 		}
			 	}
			 
			 hitMe = 1;
			 int dealerCard = 0;
			 
			 while (hitMe == 1) {
				 
				 dealerCard = blackJackOdds.calculateBlackJackOdds();
				 //dealerCard = myRandom.nextInt(9) + 1;
				 dealerTotal = dealerTotal + dealerCard;
				 
				 if (dealerTotal < 17) {
					 hitMe = 1;
				 	}
				 
				 if (dealerTotal > 17) {
					 break;
				 	}
			 	}
			 
			 if (playerTotal > 21 && dealerTotal < 22) {
				 
				 System.out.println("You busted!");
				 System.out.println("The dealer has " + dealerTotal + ".");
				 System.out.println("You lost " + wager + " Royale Bucks!");
				 winnings = wager * -1;
			 	}
			 
			 if (playerTotal < 22 && playerTotal == dealerTotal) {
				 
				 System.out.println("Draw!");
				 System.out.println("The dealer has " + dealerTotal + ".");
				 System.out.println("You won 0 Royale Bucks!");
				 winnings = 0;
			 	}
			 
			 if (playerTotal > 21 && dealerTotal > 21) {
				 
				 System.out.println("Draw!");
				 System.out.println("The dealer has " + dealerTotal + ".");
				 System.out.println("You won 0 Royale Bucks!");
				 winnings = 0;
			 	}
			 
			 if (playerTotal < 21 && dealerTotal > 21) {
				 
				 System.out.println("Win!");
				 System.out.println("The dealer has " + dealerTotal + ".");
				 System.out.println("You won " + wager + " Royale Bucks!");
				 winnings = wager;
			 	}
			 
			 if (playerTotal < 21 && dealerTotal < 22 && playerTotal > dealerTotal) {
				 
				 System.out.println("Win!");
				 System.out.println("The dealer has " + dealerTotal + ".");
				 System.out.println("You won " + wager + " Royale Bucks!");
				 winnings = wager;
			 	}
			 
			 if (playerTotal < 21 && dealerTotal < 22 && playerTotal < dealerTotal) {
				 
				 System.out.println("Lose!");
				 System.out.println("The dealer has " + dealerTotal + ".");
				 System.out.println("You lost " + wager + " Royale Bucks!");
				 winnings = wager * -1;
			 	}
			 
			if (playerTotal == 21 && playerTotal != dealerTotal) {
				
				System.out.println("Black Jack!");
				System.out.println("The dealer has " + dealerTotal + ".");
				 System.out.println("You won " + wager * 2 + " Royale Bucks!");
			    winnings = wager * 2;	
				}
			 
		 }
		 myBlackJackPlayer.setBucks(winnings + cash);
		 myBlackJackPlayer.setWinnings(winnings);
		 
		 int checkCash = myBlackJackPlayer.getBucks();
		 	
		 if (checkCash < 1) {
		 		 System.out.println("You have nothing to wager Scuzzball!");
				 response = 2;
				 break;
		 		 }
	 } // end while loop for play game
		 totalBlackJackWinnings = myBlackJackPlayer.getWinnings();
		 return totalBlackJackWinnings;
	 } // end playBlackJack


}
