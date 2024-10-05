package com.ticketbooking;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean loop=true;
		while(loop)
		{
			System.out.println("\n choose any one:\n 1. Book Ticket \n "
					+ "2. cancel Ticket\n 3.Display Conformed list"
					+ "\n4. Display RAC list\n 5. Display Waiting list"
					+ "\n 6. Exit");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
			{
				System.out.println("Enter name : ");
				String name=sc.nextLine();
				System.out.println("Enter age : ");
				int age=sc.nextInt();
				System.out.println("Enter berth preference : ");
				char preference=sc.next().charAt(0);
				break;
			}
			case 2:
			{
				System.out.println("Enter your Ticket Id : ");
				int id=sc.nextInt();
				break;
			}
			case 3:
			{
				//display conformed list
				break;
			}
			case 4:
			{
				//display RAC list
				break;
			}
			case 5:
			{
				//display waiting list
				break;
			}
			case 6:
			{
				System.out.println("\n Thank you");
				sc.close();
				loop=false;
				break;
			}
		}

	}

}
}
