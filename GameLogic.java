/**
 * Contains the main logic part of the game, as it processes.
 *
 */

import java.io.*;
import java.util.*;

public class GameLogic {
	
	private Map map;
	protected int playerX;
	protected int playerY;
	protected char playerPos;

	protected String goldNeeded;
	protected int goldCount;
	
	/**
	 * Default constructor
	 */
	public GameLogic() {
		map = new Map();
	}

    /**
     * @return if the game is running.
     */
    protected boolean gameRunning() {
        return false;
    }

    /**
     * @return : Returns back gold player requires to exit the Dungeon.
     */
    protected String hello() {
    	goldNeeded = String.valueOf(map.getGoldRequired() - goldCount);
    	System.out.println(map.getMapName());
        return goldNeeded;
    }

    /**
     * Checks if movement is legal and updates player's location on the map.
     *
     * @param direction : The direction of the movement.
     * @return : Protocol if success or not.
     */
    protected String move(char direction) {
    	
    	if (direction == 'n') {

    		if (String.valueOf((map.getMap())[playerY - 1][playerX]).equals("#")) {
    			System.out.println("FAIL");
    		}
    		else {
    			playerY--;
    			playerPos = (map.getMap())[playerY][playerX];
    			System.out.println("SUCCESS");
    		}
    	}
    	
    	else if (direction == 'e') {

    		if (String.valueOf((map.getMap())[playerY][playerX + 1]).equals("#")) {
    			System.out.println("FAIL");
    		}
    		else {
    			playerX++;
    			playerPos = (map.getMap())[playerY][playerX];
    			System.out.println("SUCCESS");
    		}
    	}
    	
    	else if (direction == 'w') {

    		if (String.valueOf((map.getMap())[playerY][playerX - 1]).equals("#")) {
    			System.out.println("FAIL");
    		}
    		else {
    			playerX--;
    			playerPos = (map.getMap())[playerY][playerX];
    			System.out.println("SUCCESS");
    		}
    	}
    	
    	else if (direction == 's') {

    		if (String.valueOf((map.getMap())[playerY + 1][playerX]).equals("#")) {
    			System.out.println("FAIL");
    		}
    		else {
    			playerY++;
    			playerPos = (map.getMap())[playerY][playerX];
    			System.out.println("SUCCESS");
    		}
    	}
    	
        return null;
    }

    /**
     * Converts the map from a 2D char array to a single string.
     *
     * @return : A String representation of the game map.
     */
    protected String look() {
    	
    	String a1,a2,a3,a4,a5;
    	String b1,b2,b3,b4,b5;
    	String c1,c2,c3,c4,c5;
    	String d1,d2,d3,d4,d5;
    	String e1,e2,e3,e4,e5;
    	
    	String row1,row2,row3,row4,row5;
    	
    	/**
    	 * Print row 1
    	 */
    	try {
    		a1 = Character.toString(map.getMap()[playerY - 2][playerX - 2]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		a1 = "#";
    	}
    	
    	try {
    		b1 = Character.toString(map.getMap()[playerY - 2][playerX - 1]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		b1 = "#";
    	}
    	
    	try {
    		c1 = Character.toString(map.getMap()[playerY - 2][playerX]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		c1 = "#";
    	}
    	
    	try {
    		d1 = Character.toString(map.getMap()[playerY - 2][playerX + 1]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		d1 = "#";
    	}
    	
    	try {
    		e1 = Character.toString(map.getMap()[playerY - 2][playerX + 2]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		e1 = "#";
    	}
    	
    	row1 = a1 + b1 + c1 + d1 + e1;
    	
    	System.out.println(row1);
    	
    	/**
    	 * Print row 2
    	 */
    	try {
    		a2 = Character.toString(map.getMap()[playerY - 2][playerX - 2]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		a2 = "#";
    	}
    	
    	try {
    		b2 = Character.toString(map.getMap()[playerY - 2][playerX - 1]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		b2 = "#";
    	}
    	
    	try {
    		c2 = Character.toString(map.getMap()[playerY - 2][playerX]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		c2 = "#";
    	}
    	
    	try {
    		d2 = Character.toString(map.getMap()[playerY - 2][playerX + 1]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		d2 = "#";
    	}
    	
    	try {
    		e2 = Character.toString(map.getMap()[playerY - 2][playerX + 2]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		e2 = "#";
    	}
    	
    	row2 = a2 + b2 + c2 + d2 + e2;
    	
    	System.out.println(row2);
    	
    	/**
    	 * Print row 3
    	 */
    	try {
    		a3 = Character.toString(map.getMap()[playerY - 2][playerX - 2]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		a3 = "#";
    	}
    	
    	try {
    		b3 = Character.toString(map.getMap()[playerY - 2][playerX - 1]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		b3 = "#";
    	}
    	
    	try {
    		c3 = Character.toString(map.getMap()[playerY - 2][playerX]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		c3 = "#";
    	}
    	
    	try {
    		d3 = Character.toString(map.getMap()[playerY - 2][playerX + 1]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		d3 = "#";
    	}
    	
    	try {
    		e3 = Character.toString(map.getMap()[playerY - 2][playerX + 2]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		e3 = "#";
    	}
    	
    	row3 = a3 + b3 + c3 + d3 + e3;
    	
    	System.out.println(row3);
    	
    	/**
    	 * Print row 4
    	 */
    	try {
    		a4 = Character.toString(map.getMap()[playerY - 2][playerX - 2]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		a4 = "#";
    	}
    	
    	try {
    		b4 = Character.toString(map.getMap()[playerY - 2][playerX - 1]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		b4 = "#";
    	}
    	
    	try {
    		c4 = Character.toString(map.getMap()[playerY - 2][playerX]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		c4 = "#";
    	}
    	
    	try {
    		d4 = Character.toString(map.getMap()[playerY - 2][playerX + 1]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		d4 = "#";
    	}
    	
    	try {
    		e4 = Character.toString(map.getMap()[playerY - 2][playerX + 2]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		e4 = "#";
    	}
    	
    	row4 = a4 + b4 + c4 + d4 + e4;
    	
    	System.out.println(row4);
    	
    	/**
    	 * Print row 5
    	 */
    	try {
    		a5 = Character.toString(map.getMap()[playerY - 2][playerX - 2]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		a5 = "#";
    	}
    	
    	try {
    		b5 = Character.toString(map.getMap()[playerY - 2][playerX - 1]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		b5 = "#";
    	}
    	
    	try {
    		c5 = Character.toString(map.getMap()[playerY - 2][playerX]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		c5 = "#";
    	}
    	
    	try {
    		d5 = Character.toString(map.getMap()[playerY - 2][playerX + 1]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		d5 = "#";
    	}
    	
    	try {
    		e5 = Character.toString(map.getMap()[playerY - 2][playerX + 2]);
    	}
    	catch (ArrayIndexOutOfBoundsException e){
    		e5 = "#";
    	}
    	
    	row5 = a5 + b5 + c5 + d5 + e5;
    	
    	System.out.println(row5);
    	
        return null;
    }

    /**
     * Processes the player's pickup command, updating the map and the player's gold amount.
     *
     * @return If the player successfully picked-up gold or not.
     */
    protected String pickup() {
    																																
    	if (playerPos == 'G') {
    		goldCount ++;
    		(map.getMap())[playerY][playerX] = '.';
    		playerPos = (map.getMap())[playerY][playerX];
			System.out.println("SUCCESS");
		}
    	else {
    		System.out.println("FAIL");
    	}
    	
        return null;
    }

    /**
     * Quits the game, shutting down the application.
     */
    protected void quitGame() {
    	System.exit(0);
    }
	
    /**
     * Main method for the game
     */
	public static void main(String[] args) {
		
		GameLogic gameLogic = new GameLogic();
		
		HumanPlayer humanPlayer = new HumanPlayer();
		String errorMessage = "INVALID";
		Random randomPos = new Random();
		
		
		gameLogic.playerX = randomPos.nextInt(gameLogic.map.getMap()[0].length);
		gameLogic.playerY = randomPos.nextInt(gameLogic.map.getMap().length);
		gameLogic.playerPos = (gameLogic.map.getMap())[gameLogic.playerY][gameLogic.playerX];
		
		while (gameLogic.playerPos == '#' || gameLogic.playerPos == 'G') {
			gameLogic.playerX = randomPos.nextInt(gameLogic.map.getMap()[0].length);
			gameLogic.playerY = randomPos.nextInt(gameLogic.map.getMap().length);
			
			gameLogic.playerPos = (gameLogic.map.getMap())[gameLogic.playerY][gameLogic.playerX];
		}
		
		
		System.out.println("Welcome to Dungeons of Doom..." + "\n\n" + "Available Commands" + "\n" + "LOOK, HELLO, PICKUP, QUIT" + "\n" + "MOVE N, MOVE S, MOVE E, MOVE W");
		
		try {
			while(!gameLogic.gameRunning()) {
				
				if (gameLogic.playerPos == 'E' && Integer.parseInt(gameLogic.hello()) <= 0) {
					System.out.println("You win!");
					System.exit(0);
				}
				
				String inCmd = humanPlayer.getInputFromConsole();
				String action = humanPlayer.getNextAction(inCmd);
																																																									
				if (action == "hello") {
					System.out.println("GOLD TO WIN: " + gameLogic.hello());
				}
				else if (action == "pickup") {
					gameLogic.pickup();
				}
				else if (action == "look") {
					gameLogic.look();
				}
				else if (action == "quit")	{
					gameLogic.quitGame();
				}
				else if (action == "n" || action == "s" || action == "e" || action == "w") {
					char moveDirection = action.charAt(0);
					gameLogic.move(moveDirection);
				}
				else {
					System.out.println("FAIL");
				}
			}
		}
		catch (IOException e) {
			System.out.println(errorMessage);
		}
		
    }
}