package com.example.controller;

import com.example.model.ContactsModel;
import com.example.service.ContactsService;
import com.example.service.ContactsServiceImpl;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	try{	
		ContactsModel cm = new ContactsModel();
		cm.setCity("jgtl");
		cm.setName("sreekar");
		cm.setEmailId("abc@gmail.com");
		cm.setPhoneNo(1234567890);
		System.out.println("b4 service call");
		ContactsService cs = new ContactsServiceImpl();
		Integer pNo = cs.addContact(cm);
		
		
		System.out.println(pNo);
	}
	catch(Exception e){
		e.printStackTrace();
	}

	}

}
