package de.frauas.oopjava2048;

public class TileSpawnException extends Exception {
	
	//TODO: make this a thing; what happens if the game tries to spawn a tile that is not a 2 or a 4?
	
	/**
	 * This is the generated serialVersionUID of this class as generated by eclipse.
	 */
	private static final long serialVersionUID = -6018080930256739564L;

	public TileSpawnException()
	  {
	    super("Tile spawned is not a 2 or a 4");
	  }
	
	public TileSpawnException(String msg)
	  {
	    super(msg);
	  }

}
