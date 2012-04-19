package drop7.grid;

import java.util.ArrayList;
import java.util.Random;

import drop7.Drop7Constants;
import drop7.actor.Actor;
import drop7.actor.GrayDisk;
import drop7.actor.NumberDisk;

public class Drop7Grid<Disk> extends BoundedGrid<Actor> implements
		Drop7Constants {

	private static Random generator;

	public Drop7Grid(int rows, int cols) {
		super(rows, cols);
		generator = new Random();
		this.setUpGrid();
	}

	private void setUpGrid() {
		for (int i = 0; i < NUM_STARTING_DISKS; i++) {
			if (generator.nextBoolean()) {
				GrayDisk gd = new GrayDisk();
				gd.putSelfInGrid(this,
						new Location(3, generator.nextInt(NUM_COLS)));
				gd.moveToBottom();
			}

			else {
				NumberDisk nd = new NumberDisk(generator.nextInt(7));
				nd.putSelfInGrid(this,
						new Location(3, generator.nextInt(NUM_COLS)));
				nd.moveToBottom();
			}
		}
	}

	public String toString() {
		ArrayList<Location> locs = this.getOccupiedLocations();

		return this.getClass().toString() + " - " + locs.size()
				+ " Actors in Grid";
	}

	public int getNumberOfEmptyLocations() {
		return NUM_ROWS * NUM_COLS - this.getOccupiedLocations().size() + 5;
	}

	public boolean isBufferRowEmpty() {
		System.out.println("got here");
		for (Location loc : this.getOccupiedLocations()) {
			if (loc.getRow() == 1)
				return false;
		}
		return true;
	}
}
