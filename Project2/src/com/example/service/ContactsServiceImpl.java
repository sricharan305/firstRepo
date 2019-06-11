package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ContactsDAO;
import com.example.dao.ContactsDAOImpl;
import com.example.model.ContactsModel;


@Service
public class ContactsServiceImpl implements ContactsService {
	
	
	@Autowired
	private ContactsDAOImpl DAO;
	
	@Override
	public Integer addContact(ContactsModel model){
		
		System.out.println("serivce entered " + model.getPhoneNo() );
		Integer phoneNo = DAO.addContactDAO(model);
		System.out.println("serivce exit");
		
		return phoneNo;
		
		
	}
	

}
