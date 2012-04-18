package drop7.game;

import java.util.ArrayList;
import java.util.Random;

import drop7.Drop7Constants;
import drop7.disks.Disk;
import drop7.disks.GrayDisk;
import drop7.disks.NumberDisk;
import drop7.grid.Drop7Grid;
import drop7.world.Drop7World;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Drop7Game implements Drop7Constants {
	/** The world - probably want to subclass this */
	private Drop7World world;
	private Drop7Grid<Disk> grid;
	private Random generator;
	private int emptyLocations;
	private int moveCounter;
	private int cascadeCounter;
	private static int score;

	public Drop7Game() {
		generator = new Random();
		grid = new Drop7Grid<Disk>(NUM_ROWS, NUM_COLS);
		world = new Drop7World(grid);
		world.show();	
		score = 0;
	}

	/**
	 * Plays the game until it is over (no player can play).
	 */
	public void playGame() {
		ArrayList<Disk> toRemove = null;
		while (grid.getNumberOfEmptyLocations() > 0 && grid.isBufferRowEmpty()) {
			toRemove = checkForDisksToRemove();
			if (toRemove != null){
				removeDisks(toRemove);
			}
			// nextMove();
			// calculateScore();
			displayMessage();
		}
		System.out.println("exit");
	}

	private void displayMessage() {
		
		System.out.println(score);
		
	}

	private void removeDisks(ArrayList<Disk> toRemove) {
		for (Disk d: toRemove){
			d.removeSelfFromGrid();
			cascadeCounter++;
		}
		
		score += 50*Math.pow(cascadeCounter,CASCADE_MULTIPLIER) + 150;
	}

	private ArrayList<Disk> checkForDisksToRemove() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Creates a string with the current game state. (used for the GUI message
	 * and debugging).
	 */
	public String toString() {
		return this.grid.toString();
	}
}