import java.util.*;

public class Boxer {

		
		private double health = 100;
		int totalWinnings = 0;
		int bucks = 0;
		int weight = 0;
		int feet = 0;
		int inches = 0;
		double lastHitPower = 0;
		double advantage = 0;
		String name;
		String from;
		String knownAs;	
	
		public Boxer() {  // default Boxer constructor
		}
	
		public Boxer(int weight, int feet, int inches, double advantage, String name, String from, String knownAs, double health) {
			this.weight = weight;
			this.feet = feet;
			this.inches = inches;
			this.advantage = advantage;
			this.name = name;
			this.from = from;
			this.knownAs = knownAs;
		} // overloaded Boxer constructor
		
		public boolean executeRightCross(Boxer myBoxer, Boxer myOpponent) {
			boolean hitOrMiss = false;
			
			Random myRandom = new Random();
			int hitPower = myRandom.nextInt(20) + 1;
			myBoxer.lastHitPower = hitPower;
			
				if (hitPower > 5) {
					hitOrMiss = true;
					myOpponent.health = myOpponent.health - hitPower;
				}
			
			return hitOrMiss;
		}
		
		public boolean executeLeftHook(Boxer myBoxer, Boxer myOpponent) {
			boolean hitOrMiss = false;
			
			Random myRandom = new Random();
			int hitPower = myRandom.nextInt(25) + 1;
			myBoxer.lastHitPower = hitPower;
			
				if (hitPower > 8) {
					hitOrMiss = true;
					myOpponent.health = myOpponent.health - hitPower;
				}
			
			return hitOrMiss;
		}
		
		public boolean executeUppercut(Boxer myBoxer, Boxer myOpponent) {
			boolean hitOrMiss = false;
			
			Random myRandom = new Random();
			int hitPower = myRandom.nextInt(30) + 1;
			myBoxer.lastHitPower = hitPower;
			
				if (hitPower > 12) {
					hitOrMiss = true;
					myOpponent.health = myOpponent.health - hitPower;
				}
			
			return hitOrMiss;
		}
		
		public boolean executeWindmill(Boxer myBoxer, Boxer myOpponent) {
			boolean hitOrMiss = false;
			
			Random myRandom = new Random();
			int hitPower = myRandom.nextInt(40) + 1;
			myBoxer.lastHitPower = hitPower;
			
				if (hitPower > 16) {
					hitOrMiss = true;
					myOpponent.health = myOpponent.health - hitPower;
				}
			
			return hitOrMiss;
		}
		
		public boolean executeBelowTheBelt(Boxer myBoxer, Boxer myOpponent) {
			boolean hitOrMiss = false;
			
			Random myRandom = new Random();
			int hitPower = myRandom.nextInt(60) + 1;
			myBoxer.lastHitPower = hitPower;
			
				if (hitPower > 30) {
					hitOrMiss = true;
					myOpponent.health = myOpponent.health - hitPower;
				}
			
			return hitOrMiss;
		}
		
		public boolean takeRightCross(Boxer myBoxer, Boxer myOpponent) {
			boolean hitOrMiss = false;
			
			Random myRandom = new Random();
			double hitPower = myRandom.nextInt(20) + 1;
			myOpponent.lastHitPower = hitPower * myOpponent.advantage;
			
				if (hitPower > 5) {
					hitOrMiss = true;
					myBoxer.health = myBoxer.health - myOpponent.lastHitPower;
				}
			
			return hitOrMiss;
		}
		
		public boolean takeLeftHook(Boxer myBoxer, Boxer myOpponent) {
			boolean hitOrMiss = false;
			
			Random myRandom = new Random();
			double hitPower = myRandom.nextInt(25) + 1;
			myOpponent.lastHitPower = hitPower * myOpponent.advantage;
			
				if (hitPower > 8) {
					hitOrMiss = true;
					myBoxer.health = myBoxer.health - myOpponent.lastHitPower;
				}
			
			return hitOrMiss;
		}
		
		public boolean takeUppercut(Boxer myBoxer, Boxer myOpponent) {
			boolean hitOrMiss = false;
			
			Random myRandom = new Random();
			double hitPower = myRandom.nextInt(30) + 1;
			myOpponent.lastHitPower = hitPower * myOpponent.advantage;
			
				if (hitPower > 12) {
					hitOrMiss = true;
					myBoxer.health = myBoxer.health - myOpponent.lastHitPower;
				}
			
			return hitOrMiss;
		}
		
		public boolean takeWindmill(Boxer myBoxer, Boxer myOpponent) {
			boolean hitOrMiss = false;
			
			Random myRandom = new Random();
			double hitPower = myRandom.nextInt(40) + 1;
			myOpponent.lastHitPower = hitPower * myOpponent.advantage;
			
				if (hitPower > 16) {
					hitOrMiss = true;
					myBoxer.health = myBoxer.health - myOpponent.lastHitPower;
				}
			
			return hitOrMiss;
		}
		
		public boolean takeBelowTheBelt(Boxer myBoxer, Boxer myOpponent) {
			boolean hitOrMiss = false;
			
			Random myRandom = new Random();
			double hitPower = myRandom.nextInt(60) + 1;
			myOpponent.lastHitPower = hitPower * myOpponent.advantage;
			
				if (hitPower > 30) {
					hitOrMiss = true;
					myBoxer.health = myBoxer.health - myOpponent.lastHitPower;
				}
			
			return hitOrMiss;
		}
		
		public double getLastHitPower() {
			return lastHitPower;
		}
		
		
		public double getAdvantage() {
				return advantage;
			}
		
		public int getWeight() {
				return weight;
			}

		 public int getFeet() {
				return feet;
			}

		 public int getInches() {
				return inches;
			}

		 public String getName() {
				return name;
			}

		 public String getFrom() {
				return from;
			}

		 public String getKnownAs() {
				return knownAs;
			}
		
		 public void setBoxerName(String boxerName) {
		    	name = boxerName;	
		    }
		 
		 public void setBucks(int newBucks) {
			 bucks = newBucks;
			 }

		 public int getBucks() {
				return bucks;
			}
		 
		 public void setWinnings(int winnings) {
			 totalWinnings = totalWinnings + winnings;
		 }
		 
		 public int getWinnings() {
				return totalWinnings;
			}
		 
		 public double getHealth() {
				return health;
			}
		 
		 public void setHealth(double myHealth) {
			 health = myHealth;
		 }
}
