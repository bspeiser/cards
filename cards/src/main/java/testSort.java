import java.util.ArrayList;

import cards.entity.Card;
import cards.entity.Pile;
import cards.util.PileUtil;
import cards.view.DefaultCardFormat;


public class testSort {

	public static void main(String[] args) {
		Pile p = PileUtil.getNewPile(PileUtil.CARD_VALUES,PileUtil.CARD_SUITES);
		DefaultCardFormat df = new DefaultCardFormat();
		ArrayList<Card> cards = p.getCards();
		for(Card c : cards){
			System.out.println(df.toString(c));
		}
		PileUtil.sort(p);
		for(Card c : cards){
			System.out.println(df.toString(c));
		}
	}

}
