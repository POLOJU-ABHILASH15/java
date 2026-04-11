package com.package1;
 public class bankapplication {
	String cname;
	String cadress;
	long phonenumber;
	 double balance;
	 
	 bankapplication(String cname,String cadress,long phonenumber,double balance){
		 this.cname=cname;
		 this.cadress=cadress;
		 this.phonenumber=phonenumber;
		 this.balance=balance;
		 System.out.println("account sucessfully created ");
		 
	 }
	 
public void deposit(double amount) {
	if(amount>0) {
		balance+=amount;
		System.out.println("sucess deposit"+"balance after deposit"+balance);
	}
	else
		System.out.println("error");
	
}
public void withdraw(double amount) {
	if(balance>amount) {
		balance-=amount;
		System.out.println("sucess withdraw"+" balance after withdraw :"+balance);
	}
	else if(amount<=0) {
		System.out.println("invalid withdraw amount");
	}
	else if(amount>balance) {
		System.out.println("insufficient funds");
	}
	
}
public void showbalance() {
	System.out.println("current balance"+balance);
}



                   }
	 
	 
	
