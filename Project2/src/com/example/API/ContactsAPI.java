package com.example.API;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ContactsModel;
import com.example.service.ContactsService;

@CrossOrigin
@RestController
@RequestMapping(value = "ContactsAPI/")
public class ContactsAPI {
	
	@Autowired
	private ContactsService cs;
	
	@RequestMapping(value = "addContact/", method = RequestMethod.POST)
	public ResponseEntity<ContactsModel> addContact(@RequestBody ContactsModel model){
		System.out.println("api entered");
		ResponseEntity<ContactsModel> re = null;
		 
		try {
			if (model.getPhoneNo() != null && model.getPhoneNo() !=0)
			{
				System.out.println("entered api if ");
				Integer pNo = cs.addContact(model);
				System.out.println("after addcontact");
				ContactsModel m = new ContactsModel();
				m.setPhoneNo(pNo);
			
				//String message = e.getProperties().getProperty("CONTACT_SAVED")
				re = new ResponseEntity<ContactsModel>(m, HttpStatus.OK);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return re;
		
	}

}
