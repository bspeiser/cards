package cards.util;

import java.util.Comparator;
import cards.entity.Card;


public class ValueCompare implements Comparator<Card> {
	final int ASCENDING = 1;
	final int DESCENDING = -1;
	int direction = ASCENDING;
	public ValueCompare(){}
	public ValueCompare(int direction){this.direction=direction;}
	@Override
	public int compare(Card arg0, Card arg1) {
		if (((int)arg0.getSuite() - (int)arg1.getSuite())>0) return 1;
		else return (arg0.getValue()-arg1.getValue())*direction;
	}
}
