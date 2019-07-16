package com.capgemini.contactbook.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.contactbook.Service.ContactBookService;
import com.capgemini.contactbook.Service.ContactBookServiceImpl;
import com.capgemini.contactbook.bean.EnquiryBean;

import Exception.ContactBookException;


public class client {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ContactBookService ips = new ContactBookServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		boolean exitFromApp = false;
		while(!exitFromApp) {
			System.out.println("*************Global Recruitments*************");
			System.out.println("Choose an Operations");
			System.out.println("1 Enter Enquiry Details\n2 View Enquiry Details on Id\n3 Exit");
			System.out.println("*******************************************");
			try {
			int dashboardIp = sc.nextInt();
			sc.nextLine();
	
			
			
			switch(dashboardIp) {
		 	case 1:
		 		//Store Enquiry Details
				System.out.println("Enter First Name : ");
		 		 String fName = sc.nextLine();
		 		 System.out.println("Enter Last Name : ");
		 		 String lName = sc.nextLine();
		 		 System.out.println("Enter Contact Number : ");
		 		 Long contactNo = sc.nextLong();
		 		 sc.nextLine();
		 		 System.out.println("Enter Preferred Domain : ");
		 		 String pDomain = sc.nextLine();
		 		 System.out.print("Enter Preferred Location : ");
		 		 String pLocation = sc.nextLine();
		 		 long id = (long) (Math.random() * 1000);
		 		 EnquiryBean bean = new EnquiryBean(id, fName, lName, contactNo, pLocation, pDomain);
		 		 ips.addEnquiry(bean);
				 System.out.println("Thank you "+ fName+"" + lName + " your Unique Id is "+id+" we will contact you shortly.");
	 			 break;
		 		 
			 	 

		 	 case 2:
		 		 //Access Enquiry Details
		 		 System.out.println("Enter the Enquiry No . : ");
		 		 long EnqNo= sc.nextLong();
		 		 sc.nextLine();
		 		 System.out.println(EnqNo);
		 		 EnquiryBean bean1 = ips.getEnquiryDetails(EnqNo);
		 		 System.out.println(bean1);

	 		
		 		 break;
		 	 case 3:
		 		 //exit from app
		 		 exitFromApp = true;
		 		 break;
		 	default:
		 		System.out.println("enter valid input");
		}
	
	System.out.println("Thank You for using application");
		}
		catch(InputMismatchException | ContactBookException e) {
			System.out.println("Something went wrong! ");
		}
}

	
}

}