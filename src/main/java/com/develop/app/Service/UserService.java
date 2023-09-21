package com.develop.app.Service;

import com.develop.app.Repository.UserRepos;
import com.develop.app.UserAcc.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepos userRepos;
    @Autowired
    public UserService(UserRepos userRepos) {
        this.userRepos = userRepos;
    }
    public void saveRegistration(User user){
        userRepos.save(user);
    }
}
