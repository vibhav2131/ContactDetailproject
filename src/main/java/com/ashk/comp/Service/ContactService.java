package com.ashk.comp.Service;

import java.util.List;

import com.ashk.comp.entity.Contact;

public interface ContactService {

	String upsert(Contact contact);

	List<Contact> getAllContacts();

	Contact getContact(int cid);

	String deleteContact(int cid);

}
