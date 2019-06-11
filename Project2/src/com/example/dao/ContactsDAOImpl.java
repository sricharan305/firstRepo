package com.example.dao;

import org.hibernate.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.ContactEntity;
import com.example.model.ContactsModel;



public class ContactsDAOImpl implements ContactsDAO{
	
	@Autowired 
	private SessionFactory sf;
	
	@Override
	public Integer addContactDAO(ContactsModel model){

		System.out.println("in dao " + model.getCity() );
		Session session = sf.getCurrentSession();
		ContactEntity ce = new ContactEntity();
		ce.setName(model.getName());
		ce.setEmailId(model.getEmailId());
		ce.setPhoneNo(model.getPhoneNo());
		ce.setCity(model.getCity());
		System.out.println("b4 save");
		Integer phoneNo = (Integer) session.save(ce);
		System.out.println("aftr saave");
		return phoneNo;
		
	}
}
