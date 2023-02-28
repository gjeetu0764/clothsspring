package com.clothsgalaxy.clothsgalaxy.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clothsgalaxy.clothsgalaxy.DAO.ContactDao;
import com.clothsgalaxy.clothsgalaxy.DAO.ImageDao;
import com.clothsgalaxy.clothsgalaxy.DAO.UserDao;
import com.clothsgalaxy.clothsgalaxy.beans.Contact;
import com.clothsgalaxy.clothsgalaxy.beans.Image;
import com.clothsgalaxy.clothsgalaxy.beans.User;
import java.util.*;

@Service
public class ClothsServiceImp implements ClothsService {
    @Autowired
    UserDao userdao;
    @Autowired
    ContactDao contactdao;
    @Autowired
    ImageDao imagedao;

    @Override
    public String searchUser(String email, String password) {

        User demail = userdao.getReferenceById(email);
        if (demail.getPassword().equals(password))
          return demail.getName();
        else     
         return "Invalid user";       
    }

    @Override
    public User adduser(User user) {
        userdao.save(user);
        return user;
    }

    @Override
    public Contact addContact(Contact contact) {
        contactdao.save(contact);
        return contact;
    }

    @Override
    public void addImages(Image image) {
        imagedao.save(image);
    }

    @Override
    public List<Image> showImages(){
        return imagedao.findAll();
    }

    @Override
    public Object showImagesid(Integer id) {
        Object object =imagedao.getReferenceById(id);
        return object;
    }

}
