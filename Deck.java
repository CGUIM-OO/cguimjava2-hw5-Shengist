import java.util.ArrayList;
import java.util.Random;

/**
 * Description: TODO:�靘�脰����������� 
 */
//�靘�脰�����������
class Deck{
	private ArrayList<Card> cards;
	private int i,j,k;
	private ArrayList<Card> usedCard; 
	private ArrayList<Card> nUsedCard;
	private ArrayList<Card> openCard;
	private int cardTimer;
	
	public int nUsed = 0;
	//TODO: Please implement the constructor (30 points)
	public Deck(int nDeck){
		cards=new ArrayList<Card>();
		usedCard=new ArrayList<Card>();
		openCard=new ArrayList<Card>();
		for(i=0;i<nDeck;i++) {
			for(j=1;j<5;j++) {
				for(k=1;k<14;k++){
					if(j == 1){
						Card card=new Card(Card.Suit.Spade,k);
						cards.add(card);
					}
					else if(j == 2){
						Card card=new Card(Card.Suit.Diamond,k);
						cards.add(card);
					}
					else if(j == 3){
						Card card=new Card(Card.Suit.Heart,k);
						cards.add(card);
					}
					else {
						Card card=new Card(Card.Suit.Club,k);
						cards.add(card);
					}
				}
			}
		}
		nUsedCard=cards;
		cardTimer = cards.size();
		//System.out.println(usedCard.size());
    }	
	//TODO: Please implement the method to print all cards on screen (10 points)
	public void printDeck(){
		//Hint: print all items in ArrayList<Card> cards, 
		//TODO: please implement and reuse printCard method in Card class (5 points)
		for(Card value:cards) {
		 value.printCard();
		}
	}
	public Card getOneCard(boolean isOpened) {
		if(cardTimer>0){
			nUsed++;
			cardTimer--;
			if(isOpened = false){
				usedCard.add(nUsedCard.get(cardTimer));
				nUsedCard.remove(cardTimer);
				return usedCard.get(nUsed-1);
			}
			else {
				openCard.add(nUsedCard.get(cardTimer));
				nUsedCard.remove(cardTimer);
				return openCard.get(nUsed-1);
			}		
		}
		 return nUsedCard.get(nUsed-1);
	}
	public void shuffle() {
		Random rnd = new Random();
		for(int i = 0; i<usedCard.size(); i++) {
			int j = rnd.nextInt(cards.size());
			nUsedCard.add(j,usedCard.get(i));
		}
		for(int i = 0; i<openCard.size(); i++) {
			int j = rnd.nextInt(cards.size());
			nUsedCard.add(j,openCard.get(i));
		}
		for(int i = 0; i < cards.size(); i++) {
			int j = rnd.nextInt(cards.size());
			Card tempCard = cards.get(j);
			cards.set(i, tempCard);
		}
		usedCard.clear();
		openCard.clear();
		nUsed = 0;
		cardTimer=0;
	}
	public ArrayList<Card> getAllCards(){
		return usedCard;
	}
	
	public Card getOpenedCard(int i){
		return openCard.get(i);
	}
	public int getnUsed() {
		return nUsed;
	}
}