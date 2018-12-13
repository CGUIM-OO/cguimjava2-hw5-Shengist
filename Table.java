import java.util.ArrayList;

public class Table {
	private Player[] Player; 
	private Deck Deck;
	private int[] pos_betArray;
	private Dealer Dealer;
	public Table(int nDeck) {
		Deck Deck1 = new Deck(1);
		Deck = Deck1;
		int[] player_array = new int[nDeck];
		
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
		int Cardnum ; 
		boolean give = true;
		for(int i=0; i<Player.length; i++) {
			System.out.println("Palyer" + (i+1) + "'s Cards now :");
			while(timer<2) {
				Deck.getOneCard(true);
				Deck.getOpenedCard(timer);
				timer++;
			}
			
		}
		
	}
	private void ask_each_player_about_hits() {
		Player hitme
	}
	private void ask_dealer_about_hits() {
		;
	}
	private void calculate_chips() {
		;
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
