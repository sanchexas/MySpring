package com.sanchez.context;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class InMemoryUserRepository implements IUserRepository{
    public List<User> users;

    @PostConstruct
    public void init(){
        this.users = new ArrayList<>(Arrays.asList(
                new User(1L,"Bob"),
                new User(2L,"Ivan"),
                new User(3L,"Adriana"),
                new User(4L,"Sergey")
        ));
    }
@Override
    public User findById(Long id){
        for(User user : users){
            if (user.getId().equals(id)){
                return user;
            }
        }
        throw new RuntimeException("User not found");
    }
}
