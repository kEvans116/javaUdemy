package com.company;

public class Main {

    public static void main(String[] args) {

//	Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
//
//	bobsAccount.withdrawal(100.0);
//
//	bobsAccount.deposit(50.0);
//	bobsAccount.withdrawal(100.0);
//
//	bobsAccount.deposit(51.0);
//	bobsAccount.withdrawal(100.0);
//
//	Account kyleAccount = new Account("Kyle Evans", "itskevans@gmail.com", "(317) 376-2565");
//		System.out.println(kyleAccount.getNumber() + " name " + kyleAccount.getCustomerName());

	VipCustomer personOne = new VipCustomer();
		System.out.println(personOne.getName());

		VipCustomer personTwo = new VipCustomer("Bob", 2500);
		System.out.println(personTwo.getName());

		VipCustomer personThree = new VipCustomer("kyle", 3000, "email@email.org");
		System.out.println(personThree.getName());
		System.out.println(personThree.getEmailAddress());
		System.out.println(personThree.getCreditLimit());

    }
}
