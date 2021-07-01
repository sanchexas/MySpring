package com.sanchez.context;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbUserRepository implements IUserRepository{
    @Override
    public User findById(Long id){
        throw new UnsupportedOperationException();
    }
}
