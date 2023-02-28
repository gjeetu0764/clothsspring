package com.clothsgalaxy.clothsgalaxy.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clothsgalaxy.clothsgalaxy.beans.Image;

public interface ImageDao extends JpaRepository<Image, Integer>{
    
}
