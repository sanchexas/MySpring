package com.sanchez.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class UserService {
    @Autowired
    @Qualifier("dbUserRepository")
    private IUserRepository userRepository;
   public User findById(Long id){
       return userRepository.findById(id);
   }

}
