package com.bridgelabz.servlet.demoapp;

import java.util.Scanner;

public class Trial {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		long savedtime =System.currentTimeMillis()/1000;
		
		System.out.println(savedtime);
		
		System.out.println("Press any key and enter to stop watch");
		int stop = input.next(".").charAt(0);
		long stopTime = (System.currentTimeMillis()/1000);
		
		if(stopTime-savedtime > 5)
		{
			System.out.println("Session expired "+(stopTime-savedtime));
			
		}
			
		else
			System.out.println("in session "+(stopTime-savedtime));
		

	}

}
