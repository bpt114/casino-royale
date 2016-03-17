import java.util.*;

public class Player {

	String playerName;
	//int money = 10000;
	int total;
	int bucks;
	int totalBlackJack = 0;
	int totalWinnings = 0;
	Scanner myScanner = new Scanner (System.in);
	
	 public String setName() {
	    	
		 	System.out.println("What is your first name?");
			playerName = myScanner.nextLine();
	    	return playerName;	
	    }

	 public void setTotal(int wonMoney) {
		 total = total + wonMoney;
	 }
	 
	 public void setBucks(int newBucks) {
	 bucks = newBucks;
	 }
	
	 public void setWinnings(int winnings) {
		 totalWinnings = totalWinnings + winnings;
	 }
	 
	 public int getWinnings() {
			return totalWinnings;
		}
	 
	 public int getBucks() {
			return bucks;
		}

	 public String getName() {
			return playerName;
		}

	 public void setBoxerName(String boxerName) {
	    	playerName = boxerName;	
	    }





}
