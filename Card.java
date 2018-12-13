import java.util.ArrayList;

class Card{
	public enum Suit{
		 Club, Diamond, Heart, Spade
//	    private int valuein;
//	    
//	    private Suit(int valuein) {
//	        this.valuein = valuein;
//	    }
//	 
//	    public int getValue() {
//	        return this.valuein;
//	    }
	}
	private int rank;
	private Suit suit;
	
	/**
	 * @param s suit
	 * @param r rank
	 */
	public Card(Suit s,int value){
		suit = s;
		rank=value;
	}
	
	//TODO: 1. Please implement the printCard method (20 points, 10 for suit, 10 for rank)
	
	public void printCard(){
		//Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace
		System.out.println(suit + "," + rank);
	}
	public Suit getSuit(){
		return suit;
	}
	public int getRank(){
		return rank;
	}
}
