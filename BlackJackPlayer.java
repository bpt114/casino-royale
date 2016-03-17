import java.util.*;

public class BlackJackPlayer {

	int totalBlackJack = 0;
	int total = 0;
	
	 public void setTotalBlackJack(int startTotal) {
		 totalBlackJack = startTotal;
	 }
	 
	 
	 public void setNewTotalBlackJack(int newWinnings) {
		 total = newWinnings;
	 }
	 
	 
	 public int getNewTotal() {
		 return totalBlackJack + total;
	 }
	 
	 
	 public int getTotal() {
			return total;
		}
	
}
