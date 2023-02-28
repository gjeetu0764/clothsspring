package com.clothsgalaxy.clothsgalaxy.Service;

import com.clothsgalaxy.clothsgalaxy.beans.Contact;
import com.clothsgalaxy.clothsgalaxy.beans.Image;
import com.clothsgalaxy.clothsgalaxy.beans.User;
import java.util.*;

public interface ClothsService {
   
    public User adduser(User user) ;
    public Contact addContact(Contact contact) ;
    public String searchUser( String email,String password) ;
    public void addImages(Image image);
    public List<Image> showImages();
    
    public Object showImagesid(Integer id);
}
