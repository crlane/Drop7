package drop7.world;

import drop7.disks.Disk;
import drop7.grid.Drop7Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.AbstractGrid;
import info.gridworld.grid.Grid;
import info.gridworld.world.World;

public class Drop7World extends World{

	public Drop7World(Drop7Grid<Disk> grid) {
		super(grid);
		this.setMessage("Drop7");
	}

}
