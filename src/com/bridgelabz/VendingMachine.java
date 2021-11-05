package com.bridgelabz;
import java.util.Scanner;

public class VendingMachine 
{

	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		int notes[] = {1,2,5,10,50,100,500,1000};
		System.out.println("Enter the amount:");
		int amount = scanner.nextInt();
		int length = notes.length;
		int count = scanner.nextInt();
		System.out.println("Number of notes to be returned : " +count );
		scanner.close();
	}
}