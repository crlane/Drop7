package drop7.actor;

import java.awt.Color;

import drop7.Drop7Constants;

public class NumberDisk extends Disk implements Drop7Constants{

	private int numberToRemove;

	public NumberDisk() {
		super();
	}

	public NumberDisk(int num){
		super();
		setNumberToRemove(num);
	}
	public NumberDisk(Color rockColor) {
		super(rockColor);
	}

	public int getNumberToRemove() {
		return numberToRemove;
	}

	private void setNumberToRemove(int numberToRemove) {
		this.numberToRemove = numberToRemove;
	}

}
