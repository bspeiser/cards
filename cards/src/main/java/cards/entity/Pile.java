/**
 * 
 */
package cards.entity;

import java.util.ArrayList;

import cards.exception.OutOfCardsException;

/**
 * @author Will
 *
 */
public class Pile {
	private ArrayList<Card> cards = new ArrayList<Card>(); 
	public Pile(){
		cards = new ArrayList<Card>();
	}
	@SuppressWarnings("unchecked")
	public Pile(ArrayList<Card> p){
		cards = (ArrayList<Card>)p.clone();
	}
	public Card removeFromTop() throws OutOfCardsException{
		if (cards.size()==0) throw new OutOfCardsException();
		return cards.remove(0);
	}
	public ArrayList<Card> removeFromTop(int num) throws OutOfCardsException{
		ArrayList<Card> removedCards = new ArrayList<Card>(); 
		for(int ii=num;ii!=0;ii--){
			removedCards.add(removeFromTop());
		}			
		return removedCards;
	}
	public ArrayList<Card> removeFromTopToEmpty(int num) throws OutOfCardsException{
		ArrayList<Card> removedCards = new ArrayList<Card>();
		num = (num<=cards.size())? num : cards.size(); 
		for(int ii=num;ii!=0;ii--){
			removedCards.add(removeFromTop());
		}			
		return removedCards;
	}
	public void add(Card c){
		cards.add(c);
	}
	public void add(ArrayList<Card> c){
		cards.addAll(c);
	}
	public int size(){
		return cards.size();
	}
	public ArrayList<Card> getCards(){
		return cards;
	}
}
