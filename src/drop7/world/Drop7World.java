package drop7.world;

import drop7.Drop7Constants;
import drop7.actor.Actor;
import drop7.actor.GrayDisk;
import drop7.grid.Grid;
import drop7.grid.Location;

public class Drop7World<Disk> extends World<Actor> implements Drop7Constants {

	@SuppressWarnings("unchecked")
	public Drop7World(Grid<Actor> grid) {
		super(grid);
		this.setMessage("Drop7");
		System.setProperty("info.gridworld.gui.selection", "hide");
		System.setProperty("info.gridworld.gui.tooltips", "hide");
		System.setProperty("info.gridworld.gui.watermark", "hide");
		System.setProperty("info.gridworld.gui.frametitle", "Drop7 GridWorld");

	}

	public boolean locationClicked(Location loc) {
		GrayDisk d = new GrayDisk();
		d.putSelfInGrid(this.getGrid(), loc);
		d.moveToBottom();
		return false;
	}

}
