package com.ashk.comp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashk.comp.entity.Contact;
import com.ashk.comp.repository.ContactRepository;

@Service
public class ContactServImpl implements ContactService {

	@Autowired
	ContactRepository repo;

	@Override
	public String upsert(Contact contact) {
		repo.save(contact);

		return "Successful...";
	}

	@Override
	public List<Contact> getAllContacts() {

		return repo.findAll();
	}

	@Override
	public Contact getContact(int cid) {
		Optional<Contact> findById = repo.findById(cid);
		if (findById.isPresent()) {

			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteContact(int cid) {
		repo.deleteById(cid);

		return "Delated successfull";
	}

}
