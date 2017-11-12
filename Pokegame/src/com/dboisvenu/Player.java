package com.dboisvenu;

public class Player {

	String msPlayerName;
	Pokeman moPokeman;
	
	/**
	 * Default Constructor
	 */
	public Player() {
	}
	
	public void setName(String sPlayerName) {msPlayerName = sPlayerName;}
	public String getName() {return msPlayerName;}
	
	public void setPokeman(Pokeman oPokeman) {moPokeman = oPokeman;}
	public Pokeman getPokeman() {return moPokeman;}
	
	public void chooseName() {
		UserInput oUserInput = new UserInput();
    	String sName = oUserInput.getStringInput("What's your name");
    	setName(sName);
	}
	
	public String getPlayerInfo() {
		return "PlayerName: " + msPlayerName + "\n" + moPokeman.getInfo();
	}
}
