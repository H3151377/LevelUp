package com.levelup.Jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.levelup.Model.User;

@Repository
public interface UserJpa extends CrudRepository<User, String> {

}
