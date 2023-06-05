package com.project.MusicStore.service;

import com.project.MusicStore.model.User;

public interface UserService {

    User create(User newUser);

    User getUserByUsername(String username);

}
