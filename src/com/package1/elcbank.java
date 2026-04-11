package com.package1;
import java.util.Scanner;

public class elcbank {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("user name :");
		String name=sc.nextLine();
		
		System.out.println("user adress :");
		String adress=sc.nextLine();
		
		System.out.println("user number :");
		long ph=sc.nextLong();
		
		
		System.out.println("user balance :");
		double balance =sc.nextDouble();
		
		bankapplication obj=new bankapplication(name,adress,ph,balance);
		
		int option;
		do {
			System.out.println("select option");
			System.out.println("1.with draw");
			System.out.println("2.deposit");
			System.out.println("3.show balance");
			System.out.println("4.exit");
			System.out.println("enter your option");
			option=sc.nextInt();
			if(option==1) {
				System.out.println("enter withdraw amount");
				double amount=sc.nextDouble();
				obj.withdraw(amount);
			}
			else if(option==2) {
				System.out.println("enter deposit amount ");
				
				double amount=sc.nextDouble();
				obj.deposit(amount);
			}
			else if(option==3) {
			
				obj.showbalance();
			}
			else if(option==4) {
				System.out.println("thank you!");
			}
			else
				System.out.println("invalid option");
			
		}while(option!=4);
		sc.close();
	}
}
		
		

	
