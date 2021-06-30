package com.sanchez.context;

import org.springframework.stereotype.Component;
@Component
public class UserService {
   public User findById(Long id){
       return new User(1L,"Bob");
   }

}
