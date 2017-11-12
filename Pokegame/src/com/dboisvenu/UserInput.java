package com.dboisvenu;

import java.util.Scanner;

public class UserInput {
	
	Scanner moUserInput = new Scanner(System.in);
	
	public UserInput() {	
	}
	
	public String getStringInput(String sQuestion)
	{
		System.out.print(sQuestion +": ");
		String sAnswer = "";
		sAnswer = moUserInput.nextLine();
		
		return sAnswer;
	}
}
