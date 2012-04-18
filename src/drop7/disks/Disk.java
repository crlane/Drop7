package drop7.disks;

import java.awt.Color;

import drop7.Drop7Constants;
import drop7.grid.Drop7Grid;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

/**
 * @author cameron
 *
 */
public abstract class Disk extends Bug implements Drop7Constants{

	public Disk() {
		// TODO Auto-generated constructor stub
	}

	public Disk(Color rockColor) {
		super(rockColor);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean canMove(){
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(Location.SOUTH);
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
        // ok to move into empty location or onto flower
        // not ok to move onto any other actor
	}
	
	
	public void moveToBottom() {
		int currentRow = this.getLocation().getRow();
		int currentCol = this.getLocation().getCol();
		
		while (this.canMove() && (currentRow != NUM_ROWS-1)){
			this.moveTo(new Location(currentRow + 1,currentCol));
			currentRow = this.getLocation().getRow();
		}
		
	}
}
