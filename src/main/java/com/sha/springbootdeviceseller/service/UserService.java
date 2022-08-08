package com.sha.springbootdeviceseller.service;

import com.sha.springbootdeviceseller.model.Role;
import com.sha.springbootdeviceseller.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface UserService  {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void changeRole(Role newRole, String username);
}
