import java.util.ArrayList;

public class Table {
	private Player[] Player; 
	private Deck Deck;
	private int[] pos_betArray;
	private Dealer Dealer;
	public Table(int nDeck) {
		Deck Deck1 = new Deck(1);
		Deck = Deck1;
		int[] player_array ;
		
	}
	public void set_player(int pos, Player p) {
		Player[pos-1] = p;
	 
  }
	public Player[] get_player() {
	System.out.println(Player);
		return Player;
	}
	public void set_dealer(Dealer d) {
	Dealer = d ;	
	}
	public Card get_face_up_card_of_dealer() {
		return Deck.getOneCard(true);
	}
	private void ask_each_player_about_bets() {
		for(int i=0; i<Player.length; i++) {
		System.out.println("Hello, I am " +Player[i].getName() + ".");
	    System.out.println("I have " + Player[i].getCurrentChips() + " chips.");
	    System.out.println("Please make bet");
	    pos_betArray[i] = Player[i].makeBet();
	    }
	}
	private void distribute_cards_to_dealer_and_players() {
		int timer = 1;
		int Cardnum = 0 ; 
		boolean give = true;
		for(int i=0; i<Player.length; i++) {
			System.out.println("Palyer" + (i+1) + "'s Cards now :");
			while(give = true) {
				Deck.getOneCard(true);
				Deck.getOpenedCard(timer);
				timer++;
				Cardnum++;
				if(Cardnum >2) {
					Cardnum =0;
					give = false;
				}
					
			}
			
		}
		
	}
	private void ask_each_player_about_hits() {
		for(int i=0; i<Player.length; i++) {
			boolean res =Player[i].hit_me(Player[i].getTotalValue());
			while(res == true) {
				System.out.println("Hit!");
				Deck.getOneCard(false);
				res =Player[i].hit_me(Player[i].getTotalValue());
				
			}
			if(res = false){
				System.out.println(Player[i].getName() + "Pass hit!");
			}	
		}
		
	}
	private void ask_dealer_about_hits() {
		boolean res =Dealer.hit_me();
		while(res == true) {
			System.out.println("Hit!");
			Deck.getOneCard(false);
			res =Dealer.hit_me();
		}
		if(res = false){
			System.out.println("Dealer"+ "Pass hit!");
		}	
	}
	private void calculate_chips() {
		System.out.println("Dealer's card value is "++" ,Cards:");
		for(int i=0; i<Player.length; i++) {
		System.out.println("Player"+ i +"'s card value is " + Player[i].getTotalValue()+" ,Cards:" );
		}
	}
	public int[] get_players_bet() {
		ask_each_player_about_bets();
        distribute_cards_to_dealer_and_players();
        ask_each_player_about_hits();
        ask_dealer_about_hits();
        calculate_chips();
		return pos_betArray;
	}


}
