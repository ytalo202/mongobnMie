package com.example.lamierdademongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositori extends MongoRepository<User,String> {
    public User findUserByName(String name);
}
