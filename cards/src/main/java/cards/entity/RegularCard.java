package cards.entity;

public class RegularCard implements Card {
	final private char suite;
	final private int value;
	boolean turnedOver = false;
	public boolean isTurnedOver(){
		return turnedOver;
	}
	public void turnOver(){
		turnedOver=!turnedOver;
	}
	public RegularCard(int value, char suite){
		this.value=value;
		this.suite=suite;
	}
	public int getValue() {
		return value;
	}
	public char getSuite() {
		return suite;
	}


}
