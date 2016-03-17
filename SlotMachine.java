import java.util.Scanner;


public class SlotMachine {

	int winnings = 0;
	int totalSlotMachineWinnings = 0;
	int cash = 0;
	Player mySlotMachinePlayer = new Player();
	Scanner myScanner = new Scanner (System.in);
	String fruitOne;
	String fruitTwo;
	String fruitThree;
	
	
public void setBeginMoney(int startTotal) {
		
		mySlotMachinePlayer.setBucks(startTotal);
		}

public int playSlotMachine() {

	 System.out.println("Round and round and round it goes.");
	 System.out.println("Where it stops, nobody knows!");
	 System.out.println("Match 3 of the same items to win!");
	 System.out.println("3 Cherries = 2 x Your Bet");
	 System.out.println("3 Lemons = 3 x Your Bet");
	 System.out.println("3 Oranges = 10 x Your Bet");
	 System.out.println("1 Star = 10 x Your Bet");
	 System.out.println("2 Stars = 100 x Your Bet");
	 System.out.println("3 Stars = 1000 x Your Bet");
	 System.out.println("The Grand Prize is 1,000,000 Royale Bucks!!!");
	 
	
	 int response = 1;
	 while (response == 1) {
	 
		 cash = mySlotMachinePlayer.getBucks();
		 System.out.println("");
		 System.out.println("You have " + cash + " Royale Bucks.");
		 System.out.println("Do you want to play?");
		 System.out.println("1: Yes, 2: No");
		 response = myScanner.nextInt();
		 
		 if (response > 1) {
			 break;
		 }
		 
		 if (response == 1) {
			 
		 		int wager = 0;
		 		System.out.println("How much do you want to bet?");
		 		System.out.println("1: 100 Royale Buck");
		 		System.out.println("2: 200 Royale Bucks");
		 		System.out.println("3: 300 Royale Bucks");
		 		System.out.println("4: 500 Royale Bucks");
		 		System.out.println("5: Gulp...1000 Royale Bucks");
		 		
		 		int wagerSelect = myScanner.nextInt();
		 		
		 		if (wagerSelect == 1) {
	                 wager = 100;
	             } else if (wagerSelect == 2) {
	                 wager = 200;
	             } else if (wagerSelect == 3) {
	                 wager = 300;
	             } else if (wagerSelect == 4) {
	                 wager = 500;
	             } else if (wagerSelect == 5) {
	            	 wager = 1000;
	             }
		 		
		 		
		 		if (wager > cash) {
		 			System.out.println("You don't have that much money!");
		 			break;
		 		}
		 
		 		OddsMaker fruitOdds = new OddsMaker();
		 		int firstFruit = fruitOdds.calculateSlotOdds();
		 		int secondFruit = fruitOdds.calculateSlotOdds();
		 		int thirdFruit = fruitOdds.calculateSlotOdds();
		 		
		 		if (firstFruit == 1) {
	                 fruitOne = "Cherry";
	             } else if (firstFruit == 2) {
	                 fruitOne = "Lemon";
	             } else if (firstFruit == 3) {
	                 fruitOne = "Orange";
	             } else if (firstFruit == 4) {
	                 fruitOne = "Star";
	             }
		 		
		 		if (secondFruit == 1) {
	                 fruitTwo = "Cherry";
	             } else if (secondFruit == 2) {
	                 fruitTwo = "Lemon";
	             } else if (secondFruit == 3) {
	                 fruitTwo = "Orange";
	             } else if (secondFruit == 4) {
	                 fruitTwo = "Star";
	             }
		 		
		 		
		 		if (thirdFruit == 1) {
	                 fruitThree = "Cherry";
	             } else if (thirdFruit == 2) {
	                 fruitThree = "Lemon";
	             } else if (thirdFruit == 3) {
	                 fruitThree = "Orange";
	             } else if (thirdFruit == 4) {
	                 fruitThree = "Star";
	             }
		 		 		
		 		System.out.print(fruitOne);
		 		System.out.print("     " + fruitTwo);
		 		System.out.println("     " + fruitThree);
		 		
		 			if (firstFruit == secondFruit && firstFruit == thirdFruit && firstFruit == 1) {
		 				winnings = wager *2;
		 				System.out.println("You got 3 Cherries!");
		 				System.out.println("You won " + winnings + " Royale Bucks!");
		 			}
		 	
		 			if (firstFruit == secondFruit && firstFruit == thirdFruit && firstFruit == 2) {
		 				winnings = wager * 3;
		 				System.out.println("You got 3 Lemons!");
		 				System.out.println("You won " + winnings + " Royale Bucks!");
		 			}
		 	
		 	
		 			if (firstFruit == secondFruit && firstFruit == thirdFruit && firstFruit == 3) {
		 				winnings = wager * 10;
		 				System.out.println("You got 3 Oranges!");
		 				System.out.println("You won " + winnings + " Royale Bucks!");
		 			}
		 	
		 			if (firstFruit == secondFruit && firstFruit == thirdFruit && firstFruit == 4) {
		 				winnings = wager * 1000;
		 				System.out.println("You got 3 Stars!  You Win the Jackpot!!!");
		 				System.out.println("You won " + winnings + " Royale Bucks!");
		 			}
		 			
		 			if ((firstFruit != secondFruit || firstFruit != thirdFruit) && (firstFruit != 4 && secondFruit != 4 && thirdFruit != 4)) {
		 				winnings = wager * -1;
		 				System.out.println("Boo!");
		 				int dontShowNegativeSign = winnings * -1;
		 				System.out.println("You lost " + dontShowNegativeSign + " Royale Bucks!");
		 			}
		 			
		 
		 			if (firstFruit == 4 && secondFruit != 4 && thirdFruit != 4) {
		 				winnings = wager *10;
		 				System.out.println("You got a Star!");
		 				System.out.println("You won " + winnings + " Royale Bucks!");
		 			}
		 			
		 			if (secondFruit == 4 && firstFruit != 4 && thirdFruit != 4) {
		 				winnings = wager *10;
		 				System.out.println("You got a Star!");
		 				System.out.println("You won " + winnings + " Royale Bucks!");
		 			}
		 			
		 			if (thirdFruit == 4 && secondFruit != 4 && firstFruit != 4) {
		 				winnings = wager *10;
		 				System.out.println("You got a Star!");
		 				System.out.println("You won " + winnings + " Royale Bucks!");
		 			}
		 			
		 			if (firstFruit == 4 && secondFruit == 4 && thirdFruit != 4) {
		 				winnings = wager *100;
		 				System.out.println("You got two Stars!");
		 				System.out.println("You won " + winnings + " Royale Bucks!");
		 			}
		 			
		 			if (firstFruit == 4 && thirdFruit == 4 && secondFruit != 4) {
		 				winnings = wager *100;
		 				System.out.println("You got two Stars!");
		 				System.out.println("You won " + winnings + " Royale Bucks!");
		 			}
		 			
		 			if (thirdFruit == 4 && secondFruit == 4 && firstFruit != 4) {
		 				winnings = wager *100;
		 				System.out.println("You got two Stars!");
		 				System.out.println("You won " + winnings + " Royale Bucks!");
		 			}
		 			
		 	 mySlotMachinePlayer.setBucks(winnings + cash);
			 mySlotMachinePlayer.setWinnings(winnings);
			 
			 int checkCash = mySlotMachinePlayer.getBucks();
			 	
			 if (checkCash < 1) {
			 		 System.out.println("You have nothing to wager Scuzzball!");
					 response = 2;
					 break;
			 		 }
	
		 }
		 } //end of while play loop
	 totalSlotMachineWinnings = mySlotMachinePlayer.getWinnings();
	 return totalSlotMachineWinnings;
	} //end of playSlotMachine

}
