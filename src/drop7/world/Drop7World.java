package drop7.world;

import java.awt.Color;

import drop7.Drop7Constants;
import drop7.disks.Disk;
import drop7.disks.GrayDisk;
import drop7.disks.NumberDisk;
import drop7.grid.Drop7Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.AbstractGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Drop7World<Disk> extends World<Actor> implements Drop7Constants{

	@SuppressWarnings("unchecked")
	
	public Drop7World(Grid<Actor> grid) {
		super(grid);
		this.setMessage("Drop7");
//		System.setProperty("info.gridworld.gui.selection", "hide");
//		System.setProperty("info.gridworld.gui.tooltips", "hide");
//		System.setProperty("info.gridworld.gui.watermark", "hide");

	}
}

