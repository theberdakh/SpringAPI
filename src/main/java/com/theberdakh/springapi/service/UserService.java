package com.theberdakh.springapi.service;

import com.theberdakh.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> users;

    public UserService() {
        users = new ArrayList<User>();

        User user = new User(1, "Berdakh", 21, "berdakh@gmail.com");
        User user1 = new User(3, "Berdak3h", 21, "berdakh@gmail.com");
        User user2 = new User(4, "Berdakh4", 21, "berdakh@gmail.com");
        User user3 = new User(2, "Berdakh2", 21, "berdakh@gmail.com");
        users.add(user);
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: users){
            if(user.getId() == id){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
