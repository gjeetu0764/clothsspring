package com.clothsgalaxy.clothsgalaxy.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clothsgalaxy.clothsgalaxy.beans.User;

public interface UserDao extends JpaRepository< User, String> {
    
}

