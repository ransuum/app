package com.develop.app.Repository;

import com.develop.app.UserAcc.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface UserRepos extends JpaRepository<User, Long> {
}
