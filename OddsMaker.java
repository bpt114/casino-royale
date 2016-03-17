import java.util.*;


public class OddsMaker {
	
	 ArrayList<Cards> deckCardsList = new ArrayList<>();
	 int cardValue = 0;
	 int cardsLeft = 52;
	 
	
	 public int calculateSlotOdds() {
		
		 int fruit = 0;
		 Random myRandom = new Random();
		 int spread = myRandom.nextInt(99) + 1;
		 
		 if (spread > 0 && spread < 50) {
			 fruit = 1;
		 } else if (spread > 49 && spread < 80) {
			 fruit = 2;
		 } else if (spread > 79 && spread < 95) {
			 fruit = 3;
		 } else if (spread > 94 && spread < 100) {
			 fruit = 4;
		 }
		 return fruit;
	 }
		

	 public void initializeBlackJackOdds() {
			
	 //ArrayList<Cards> deckCardsList = new ArrayList<>();
	 //int cardValue = 0;
	 
	 for (int count = 0; count < 52; count++) {
		 Cards brandNewCard = new Cards();
		 brandNewCard.setCardValue(cardValue);
		 deckCardsList.add(brandNewCard);
	 }
	 
	 for (int count = 0; count < 17; count++) {
		 cardValue = 10;
		 deckCardsList.get(count).setCardValue(cardValue); }
	 
	 for (int count = 17; count < 21; count++) {
		 cardValue = 1;
		 deckCardsList.get(count).setCardValue(cardValue); }
	 
	 for (int count = 21; count < 25; count++) {
		 cardValue = 2;
		 deckCardsList.get(count).setCardValue(cardValue);}
	
	 for (int count = 25; count < 29; count++) {
		 cardValue = 3;
		 deckCardsList.get(count).setCardValue(cardValue); }
	 
	 for (int count = 29; count < 33; count++) {
		 cardValue = 4;
		 deckCardsList.get(count).setCardValue(cardValue); }
	 
	 for (int count = 33; count < 37; count++) {
		 cardValue = 5;
		 deckCardsList.get(count).setCardValue(cardValue); }
	 
	 for (int count = 37; count < 41; count++) {
		 cardValue = 6;
		 deckCardsList.get(count).setCardValue(cardValue); }

	 for (int count = 41; count < 45; count++) {
		 cardValue = 7;
		 deckCardsList.get(count).setCardValue(cardValue); }
	 
	 for (int count = 45; count < 49; count++) {
		 cardValue = 8;
		 deckCardsList.get(count).setCardValue(cardValue); }
	 
	 for (int count = 49; count < 52; count++) {
		 cardValue = 9;
		 deckCardsList.get(count).setCardValue(cardValue); }
	 }
	 
	 
	 public int calculateBlackJackOdds() {
			
		 //int cardsLeft = 52;
		 int card = 0;
		 Random myRandom = new Random();
		 int randomCard = myRandom.nextInt(cardsLeft);
		 card = deckCardsList.get(randomCard).getCardValue();
		 
		 //add to get card value from Cards list based on position spread
		 
		// if (spread > 0 && spread < 17) {
			// card = 10;
		// }  else if (spread > 16 && spread < 21) {
			// card = 1;
		 //}  else if (spread > 20 && spread < 25) {
			// card = 2;
		 //}  else if (spread > 24 && spread < 29) {
			// card = 3;
		 //}  else if (spread > 28 && spread < 33) {
			// card = 4;
		 //}  else if (spread > 32 && spread < 37) {
			 //card = 5;
		 //}  else if (spread > 36 && spread < 41) {
			 //card = 6;
		 //}  else if (spread > 40 && spread < 45) {
			 //card = 7;
		 //}  else if (spread > 44 && spread < 49) {
			 //card = 8;
		 //}  else if (spread > 48 && spread < 53) {
			 //card = 9;
		 //}
		 
		 deckCardsList.remove(randomCard);
		 cardsLeft--;
		 
		 return card;
	 }
}
	
