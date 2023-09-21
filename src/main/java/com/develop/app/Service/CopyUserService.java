package com.develop.app.Service;

import com.develop.app.Repository.CopyUserRepos;
import com.develop.app.UserAcc.CopyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CopyUserService {
    private final CopyUserRepos copyUserRepos;
    @Autowired
    public CopyUserService(CopyUserRepos copyUserRepos) {
        this.copyUserRepos = copyUserRepos;
    }
    public void reg(CopyUser copyUser){
        copyUserRepos.save(copyUser);
    }
}
