/**
 * 
 */
package cards.util;

import java.util.ArrayList;
import java.util.Collections;

import cards.entity.Card;
import cards.entity.Pile;
import cards.entity.RegularCard;

/**
 * @author Will
 *
 */
public final class PileUtil {
	public static int[] CARD_VALUES = {1,2,3,4,5,6,7,8,9,10,11,12,13}; 
	public static char[] CARD_SUITES = {'h','c','d','s'}; 
	int randomCardNum(int count){
		return (int) (Math.round(count*Math.random())+1);
	}
	public static Pile getNewPile(int[]values,char[]suites){
		ArrayList<Card> cards = new ArrayList<Card>();
		for (int ii=0;ii<values.length;ii++){
			for (int jj=0;jj<suites.length;jj++){
				cards.add(new RegularCard(values[ii],suites[jj]));
			}
		}
		return new Pile(cards);		
	}
	public static void shuffle(Pile p){
		
	}
	public static void deal(Pile p, ArrayList<Player> ap){
		
		
	}
	public static void sort(Pile p){
		ArrayList<Card> cards = p.getCards();
		Collections.sort(cards,new ValueCompare(-1));
	}
}
