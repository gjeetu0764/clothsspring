package com.clothsgalaxy.clothsgalaxy.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clothsgalaxy.clothsgalaxy.beans.Contact;

public interface ContactDao extends JpaRepository<Contact, String>{
    
}
