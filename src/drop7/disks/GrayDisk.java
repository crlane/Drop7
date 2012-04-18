package drop7.disks;

import java.awt.Color;

import drop7.Drop7Constants;

public class GrayDisk extends Disk implements Drop7Constants{

	private int hitsToRemove;
	
	public GrayDisk() {
		super(Color.GRAY);
		hitsToRemove = HITS_TO_UNLOCK;
	}

	public GrayDisk(Color rockColor) {
		super(rockColor);
		// TODO Auto-generated constructor stub
	}

}
