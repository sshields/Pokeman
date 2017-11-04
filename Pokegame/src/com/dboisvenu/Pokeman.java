package com.dboisvenu;

public class Pokeman {
	
	public String msName;
	public int mnHealth;
	public int mnDamage;
	public int mnSpeed;
	
	// I changed the name of the class from Pokemans to Pokeman as this is a single instance of a Pokeman
	// not a collection of them.  I've also added what's know as JavaDoc comments which self documents your code.  If you do this there are tools
	// that examine your code and generates the documentation of your classes for you!  It can be tedious to do, but a lot of IDE (editors
	// like Eclipse) can auto generate these as well.  Up to you, just letting you know.  Useful if you're Packages/Classes will be used by others.
	// See http://www.codejava.net/ides/eclipse/how-to-generate-javadoc-in-eclipse
	
	/**
	* Default Constructor
	*/
	public Pokeman() {
	}
	
	/**
	* Constructor to fully initialize a Pokeman object.
	* @param sName		The name of the Pokeman
	* @param nHealth	The health of the Pokeman
	* @param nDamage	The damage for the Pokeman
	* @param nSpeed		The speed of the Pokeman
	*/
	public Pokeman(String sName, int nHealth, int nDamage, int nSpeed) {
		initPokeman(sName, nHealth, nDamage, nSpeed);
	}
	
	// Initialize you're Pokeman if you used the default constructor.
	/**
	* Initializes the Pokeman
	* @param sName		The name of the Pokeman
	* @param nHealth	The health of the Pokeman
	* @param nDamage	The damage for the Pokeman
	* @param nSpeed		The speed of the Pokeman
	*/
	void initPokeman(String sName, int nHealth, int nDamage, int nSpeed) {
		msName = sName;
		mnHealth = nHealth;
		mnDamage = nDamage;
		mnSpeed = nSpeed;
	}
	
	/**
	* Set's the name of the Pokeman
	* @param sName		The name of the Pokeman
	*/
	public void setName(String sName) {msName = sName;}
	
	/**
	* Get's the name of the Pokeman
	* @return sName		Return the name of the Pokeman
	*/
	public String getName() {return msName;}
	
	// Get/Set Health
	public void setHealth(int nHealth) {mnHealth = nHealth;}
	public int getHealth() {return mnHealth;}
	
	// Get/Set Damage
	public void setDamage(int nDamage) {mnDamage = nDamage;}
	public int getDamage() {return mnDamage;}
	
	// Get/Set Speed
	public void setSpeed(int nSpeed) {mnSpeed = nSpeed;}
	public int getSpeed() {return mnSpeed;}
	
	// Provide all of the details of your pokeman
	public String getInfo() {
		return "Pokeman: " + msName + "\nHealth: " + mnHealth + "\nDamage: " + mnDamage + "\nSpeed: " + mnSpeed + "\n";
	}
}