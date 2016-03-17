import java.util.*;

public class Casino {

	String name;
	Player myPlayer = new Player();
	int selection = 0;
	int moneyWon = 0;
	int goldenBox = 0;
	Scanner myScanner = new Scanner (System.in);
	
	public void setUpGame() {
		
		name = myPlayer.setName();
		System.out.println("Welcome, " + name +", to Casino Royale, the world's best Java casino game!");
		System.out.println("You just got a bonus at work for helping the big boss on a super secret project.");
		System.out.println("You've decided to head to Vegas with your $10,000");
		System.out.println("to play at the famous Casino Royale and try to win the prize in the Golden Box.");
		System.out.println("What's inside?  Nobody knows but if you win 1 million Royale Bucks over the weekend");
		System.out.println("you can find out!  Good luck!");
		System.out.println("By the way, 1 US Dollar = 1 Royale Buck.");
	}
	
	public void startPlaying() {

		myPlayer.setBucks(10000);
		int royaleBucks = myPlayer.getBucks();
		System.out.println("");
		System.out.println("You have " + royaleBucks + " Royale Bucks.");
		System.out.println("");
		
		//if (royaleBucks == 0) {
		//	System.out.println("GAME OVER - YOU LOSE!");
		//}
		
		while (royaleBucks > 0 && selection < 6) {
		System.out.println("What do you want to do?");
		System.out.println("");
		System.out.println("1: Slot Machine");
		System.out.println("2: Black Jack");
		System.out.println("3: Boxing");
		//System.out.println("4: Guess the Lucky Number");
		//System.out.println("5: Go Shopping");
		System.out.println("6: Exit Game");
		
		selection = myScanner.nextInt();
		
		if (selection == 1) {
			SlotMachine newSlotMachine = new SlotMachine();
			royaleBucks = myPlayer.getBucks();
			newSlotMachine.setBeginMoney(royaleBucks);
			moneyWon = newSlotMachine.playSlotMachine();
			myPlayer.setBucks(royaleBucks + moneyWon);
			royaleBucks = myPlayer.getBucks();
			System.out.println("You have " + royaleBucks + " Royale Bucks.");
			System.out.println("");
		}
		
		if (selection == 3) {
				
			Boxing newBoxing = new Boxing();
			royaleBucks = myPlayer.getBucks();
			String myName = myPlayer.getName();
			newBoxing.setPlayerName(myName);
			newBoxing.setBeginMoney(royaleBucks);
			moneyWon = newBoxing.playBoxing();
			//myPlayer.setTotal(moneyWon);
			//royaleBucks = moneyWon;
			myPlayer.setBucks(royaleBucks + moneyWon);
			royaleBucks = myPlayer.getBucks();
			System.out.println("You have " + royaleBucks + " Royale Bucks.");
			System.out.println("");
		}
		
		if (selection == 2) {
			
			BlackJack newBlackJack = new BlackJack();
			royaleBucks = myPlayer.getBucks();
			newBlackJack.setBeginMoney(royaleBucks);
			moneyWon = newBlackJack.playBlackJack();
			//myPlayer.setTotal(moneyWon);
			//royaleBucks = moneyWon;
			myPlayer.setBucks(royaleBucks + moneyWon);
			royaleBucks = myPlayer.getBucks();
			System.out.println("You have " + royaleBucks + " Royale Bucks.");
			System.out.println("");
		}
		
	}
		
		if (royaleBucks < 1 || selection == 6) {
			
			if (goldenBox == 0) {
				System.out.println("You didn't win what was in the Golden Box!");
				System.out.println("");
				}
			if (goldenBox == 1) {
				System.out.println("You didn't win what was in the Golden Box!");
				System.out.println("");
				}
			}
	
			System.out.println("You left the Royale Casino with " + royaleBucks + " dollars!");
			System.out.println("GAME OVER - YOU LOSE!");	
	}
}
	
	
