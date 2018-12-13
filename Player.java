import java.util.*;

public class Player extends Person{
	private String name1;
	private int chips1;
	private int bet;
	private ArrayList<Card> oneRoundCard;
	private int addAll;
	public Player(String name, int chips) {
	name1= name;
	chips1= chips;
	}	
	public String getName() {
	return name1;
	}
	public int makeBet() {
		if (chips1<=0) {
		return 0;
		//"NO money, can't bet";
		}
		bet=bet*1;
		chips1 =chips1-bet;
		return bet;
	}
	public int getCurrentChips() {
		return chips1;
	}
	public void increaseChips (int diff) {
		chips1 = diff + chips1;
	}
	@Override
	public boolean hit_me(Table table) {
		// TODO Auto-generated method stub
		if(addAll<=16){
			return true;
		}
		else {
			return false;
		}
	}
	
}

