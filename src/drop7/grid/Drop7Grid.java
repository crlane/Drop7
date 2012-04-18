package drop7.grid;

import java.util.ArrayList;

import drop7.Drop7Constants;
import drop7.disks.GrayDisk;
import drop7.disks.NumberDisk;
import info.gridworld.actor.Actor;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Drop7Grid<Disk> extends BoundedGrid<Actor> implements Drop7Constants{

	public Drop7Grid(int rows, int cols) {
		super(rows,cols);
		this.setUpGrid();
	}

	private void setUpGrid() {
		
	}

	public String toString(){
		ArrayList<Location> locs = this.getOccupiedLocations();
		
		return this.getClass().toString() + " - " + locs.size() + " Actors in Grid";
	}

	public int getNumberOfEmptyLocations() {
		return NUM_ROWS * NUM_COLS - this.getOccupiedLocations().size() + 5;
	}

	public boolean isBufferRowEmpty() {
		System.out.println("got here");
		for (Location loc : this.getOccupiedLocations()){
			if (loc.getRow() == 1)
				return false;
		}
		return true;
	}
}
