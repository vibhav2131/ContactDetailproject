package com.ashk.comp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashk.comp.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
