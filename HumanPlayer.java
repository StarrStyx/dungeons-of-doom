/**
 * Runs the game with a human player and contains code needed to read inputs.
 *
 */

import java.io.*;

public class HumanPlayer {

	String input;
	String inProc;
	String moveW = "MOVE";
	
    /**
     * Reads player's input from the console.
     * <p>
     * return : A string containing the input the player entered.
     */
    protected String getInputFromConsole() throws IOException {
    	
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	String input = reader.readLine();
        return input;
        
    }

    /**
     * Processes the command. It should return a reply in form of a String, as the protocol dictates.
     * Otherwise it should return the string "Invalid".
     *
     * @param command : Input entered by the user.
     * @return : Processed output or Invalid if the @param command is wrong.
     */
    protected String getNextAction(String command) {
    	
    	if (command.equals("HELLO")) {
    		inProc = "hello";
    	}
    	
    	else if (command.equals("MOVE")) {
    		inProc = "invalid";
    	}
    	
    	else if (command.contains(moveW)) {
    		
    		if (command.charAt(5) == ('N')) {
    			inProc = "n";
    		}
    		else if (command.charAt(5) == ('E')) {
    			inProc = "e";
    		}
    		else if (command.charAt(5) == ('W')) {
    			inProc = "w";
    		}
    		else if (command.charAt(5) == ('S')) {
    			inProc = "s";
    		}
    	}
    	
    	
    	else if (command.equals("LOOK")) {
    		inProc = "look";
    	}
    	
    	else if (command.equals("PICKUP")) {
    		inProc = "pickup";
    	}
    	
    	else if (command.equals("QUIT")) {
    		inProc = "quit";
    	}
    	
    	else {
    		inProc = "invalid";
    	}
        
    	return inProc;
    }


}