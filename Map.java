/**
 * Reads and contains in memory the map of the game.
 *
 */

import java.io.*;

public class Map {
	
	/* Representation of the map */
	private char[][] map;
	
	/* Map name */
	private String mapName;
	
	/* Gold required for the human player to win */
	private int goldRequired;
	
	/**
	 * Default constructor, creates the default map "Very small Labyrinth of doom".
	 */
	public Map() {
		mapName = "Very small Labyrinth of Doom";
		goldRequired = 2;
		map = new char[][]{
			{'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'},
			{'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
			{'#','.','.','.','.','.','.','G','.','.','.','.','.','.','.','.','.','E','.','#'},
			{'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
			{'#','.','.','E','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
			{'#','.','.','.','.','.','.','.','.','.','.','.','G','.','.','.','.','.','.','#'},
			{'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
			{'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
			{'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'}
		};
	}
	
	/**
	 * Constructor that accepts a map to read in from.
	 *
	 * @param : The filename of the map file.
	 */
	public Map(String filename) {
		readMap(filename);
	}

	/**
     * Reads the map from file.
     *
     * @param : Name of the map's file.
     */
    protected void readMap(String fileName) {
    
    	try {
    		File file = new File ("map_file.txt");
    		FileReader mapReader = new FileReader (file);
    		BufferedReader importMap = new BufferedReader (mapReader);
    		
    		String readName = importMap.readLine();
    		String[] partName = readName.split(" ");
    		mapName = partName[1];
    	}
    	catch (IOException e) {
    		System.out.println("Cannot read file");
    	}
		
    }
	
    /**
     * @return : Gold required to exit the current map.
     */
    protected int getGoldRequired() {
    	
    	int gold = goldRequired;
    	
        return gold;
    }

    /**
     * @return : The map as stored in memory.
     */
    protected char[][] getMap() {
        return map;
    }


    /**
     * @return : The name of the current map.
     */
    protected String getMapName() {
    	
    	String nameMap = mapName;
    	
        return nameMap;
    }

}
