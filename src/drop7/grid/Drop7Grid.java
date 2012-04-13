package drop7.grid;

import info.gridworld.grid.BoundedGrid;

public class Drop7Grid<Disk> extends BoundedGrid<Disk> {
	public static final int STARTING_DISKS = 12;
	
	public Drop7Grid(int rows, int cols) {
		super(rows, cols);
	}
	
}
