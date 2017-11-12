// Companies use their reversed Internet domain name to begin their package names—for example, com.example.mypackage for a package named
// mypackage created by a programmer at example.com.  Name collisions that occur within a single company need to be handled by convention
// within that company, perhaps by including the region or the project name after the company name (for example, com.example.region.mypackage).
package com.dboisvenu;

import java.util.Random;
 
public class Pokegame {
 
	// Static:		When you make a variable static, it means that if you had multiple instances of this class
	//              changing the value of the int changes it for all classes.  If it's not static, then every
	//              instance of the class can have it's own unique value and will only change when modified by
	//              that instance of the class.  In this case it's fine as you will only ever have one instance
	// 				of the class instantiated.
	
	// Code Hint:  	Typically When you create an object you prefix it with a character(s)
    //             	so that when you see it in the code away from it's declaration, you
    //             	immediately no it's type.  For example whenever I create an object, I
    //             	prefix the variable with 'o' for Object.  Typically when I create an int I prefix it by 'n'
	//              for number.  If I was creating a member variable, then I'd prefix it with 'm' for member.
	//              Finally, if I was crateing a member variable for a class that was of type int I would
	//              prefix it with 'mn', for an object 'mo'.  Note the use of camel casing.
	
	
	// Use static variable as opposed to hard coding numbers.  It's clearer
	// and easily changed in one spot in your code.
	public static final int NUMBER_OF_POKEMANS = 3;
   
    // Create an instance of a player class.
    // The assumption is that this will be a single player game.
    public static Player moPlayer = new Player();
    
    // Within a class, it's fine to use member variables directly.  However , outside of a class,
    // member variables are accessed or updated with getter and setter methods.
    //public Player getPlayer() {return moPlayer;}
     
    // Main class to initiate the game
    public static void main(String[] args) {
        
    	// You've already created you're player above with the same name, what's the intent here?
    	// This works because this is considered a local variable to this method, and is never used.
    	// I have commented it out and would remove it out as it currently serves no purpose that I can see.
    	// Player moPlayer = new Player();
 
        //moPlayer.choosePokeman();
    	
    	// Set the Player name.  You could also pass the player name in as a parameter/argument to the main class
    	// You had a method called chooseName.  Not sure the intent, but you could show some UI to have the user enter
    	// in their name, or prompt them to type in a name.  Since you didn't provide the player class I created my own
    	// and have a setName for this.
    	moPlayer.chooseName();
       
        Pokeman[] aPokemanList = new Pokeman[NUMBER_OF_POKEMANS];

        // You can do this, but these variables are never used after this as you're
        // putting them directly into the array.  It's 3 lines of code you don't really need.
        // Pokemans oCharmander = new Pokemans();
        // Pokemans oBulbasaur = new Pokemans();
        // Pokemans oSquirtle = new Pokemans();
       
        // aPokemanList[0] = oCharmander;
        // aPokemanList[1] = oBulbasaur;
        // aPokemanList[2] = oSquirtle;
        
        // In this case a more efficient way would be to assign it directly into the array.
        // Also if you were creating say 100 types of characters this would save a lot of lines of code
        // to initalize them 1 by 1.
        for (int i=0; i < NUMBER_OF_POKEMANS; i++)
        	aPokemanList[i] = new Pokeman();
       
        aPokemanList[0].initPokeman("Charmander", 75, 12, 2);
        aPokemanList[1].initPokeman("Bulbasaur", 125, 8, 1);
        aPokemanList[2].initPokeman("Squirtle", 100, 10, 3);
       
        // Define variable close to where you're using them for readability.  If there's
        // lots of lines of code, you may be searching around to figure out how/why it was defined.
        Random oRandom = new Random();
        int nPokeman = oRandom.nextInt(aPokemanList.length); 
        moPlayer.setPokeman(aPokemanList[nPokeman]);

        System.out.println(moPlayer.getPlayerInfo());
    }
}
