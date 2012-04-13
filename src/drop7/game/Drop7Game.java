package drop7.game;
import drop7.disks.Disk;
import drop7.grid.Drop7Grid;
import drop7.world.Drop7World;
import info.gridworld.world.World;

public class Drop7Game {
		/** The world - probably want to subclass this */
		private Drop7World world;
		private Drop7Grid<Disk> grid;

		public Drop7Game()
		{
			grid = new Drop7Grid<Disk>(7,7);
			world = new Drop7World(grid);
			
			world.show();
		}

		/**
		 * Plays the game until it is over
		 * (no player can play).
		 */
		public void playGame()
		{
			
		}

		/**
		 * Creates a string with the current game state.
		 * (used for the GUI message and debugging).
		 */
		public String toString()
		{
			return null;
		}
}