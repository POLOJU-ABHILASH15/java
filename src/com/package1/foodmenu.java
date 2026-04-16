package com.package1;
import java.util.Scanner;


// base class
class user{
	int userid;
	String name;
	
	public user(int userid,String name) {
		this.userid=userid;
		this.name=name;
		
		
	}
	
	
public void showuserdetails() {
	System.out.println("user id :"+userid);
	System.out.println("user name :"+name);
	
}
	
}
//child class customer
class customer extends user{
	String adress;
	public customer(int userid,String name,String adress) {
		super(userid,name);
		this.adress=adress;
		
	}
	
	
public void showcustomerdetails() {
	super.showuserdetails();
	System.out.println("user adress :"+adress);
}
	
	
}
// child class premium customer

class premiumcustomer extends customer{
	double discount;
	public premiumcustomer(int userid,String name,String adress,double discount) {
		super(userid,name,adress);
		this.adress=adress;
		this.discount=discount;
		
	}

public void calculatebill(double amount) {
	if(discount>50) {
		System.out.println("invalid discount");
		
	}
	else if(amount<=0) {
		System.out.println("invalid amount");
	}
	else if(amount>0) {
		System.out.println("balance after discount");
		System.out.println(amount=amount-discount);
	}
	else 
		System.out.println("enter valid amount");
	
	
}
	
	
	
}
//hierarchical inherit class
class deliverypartner extends user{
	String vehicletype;
	public deliverypartner(int userid,String name, String vehicletype) {
		super(userid,name);
		this.vehicletype=vehicletype;
	}
public void deliveryorder() {
	System.out.println("order delivered using "+vehicletype);
	
}
	
}


//manager
class manager extends user{
	public manager(int userid,String name) {
		super(userid,name);
	}
public void monitersystem() {

}
	
}
//a
class admin extends user{
	public admin(int userid,String name) {
		super(userid,name);
		
	}
public void adduser() {
	System.out.println("new user added successfully");
	
}
	
	
}


public class foodmenu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user id");
		int userid=sc.nextInt();
		sc.nextLine();
		System.out.println("enter user name");
		String name=sc.nextLine();
		
		System.out.println("enter adress");
		String adress=sc.nextLine();
		System.out.println("enter discount");
		double discount=sc.nextDouble();
		System.out.println("user account created sucessfully");
		
		customer c=new customer(userid,name,adress);
		premiumcustomer pc=new premiumcustomer(userid,name,adress,discount);
		
		deliverypartner dp=new deliverypartner(userid,name,"bike");
		admin ad =new admin(userid,name);
		
		int menu;
		
		do {
			System.out.println("menu");
			System.out.println("1.show cutomer details");
			System.out.println("2.calculate bill");
			System.out.println("3.deliver order ");
			System.out.println("4.admin add user");
			System.out.println("5.exit");
			System.out.println("select menu 1-5");
			menu=sc.nextInt();
			
			
			switch(menu) {
			case 1:{
				c.showcustomerdetails();
				break;
				
			}
			case 2:{
				System.out.println("enter amount");
				double amounts=sc.nextDouble();
				pc.calculatebill(amounts);
				break;
				
			}
			case 3:{
				dp.deliveryorder();
				break;
				
			}
			case 4:{
				ad.adduser();
				break;
			}
			case 5:{
				System.out.println("exit and thank you for visiting ");
				
				break;
			} default:
				System.out.println("enter valid number");
				break;
			}
			
			
		}while(menu!=5);
		
		
		
		sc.close();
		
	}

}
