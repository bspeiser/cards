package cards.view;

import cards.entity.Card;

public class DefaultCardFormat implements format {
	public String[] CARD_VALUES = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	@Override
	public String toString(Card c) {
		return CARD_VALUES[c.getValue()-1]+c.getSuite();
	}

}
