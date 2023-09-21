package com.develop.app.UserController;

import com.develop.app.Service.UserService;
import com.develop.app.UserAcc.CopyUser;
import com.develop.app.UserAcc.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.AttributedString;

@Controller
public class Registr {
    private final UserService userService;
    @Autowired
    public Registr(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/register")
    public String reg(@RequestParam("username") String username, @RequestParam("password") String password) throws Exception {
        User user = new User();
        if (username.length() > 16){
            throw new Exception("Username too long");
        } else if (username.contains("@")) {
            throw new Exception("It's username not email");
        } else {
            user.setUsername(username);
        }
        if (password.length() > 16){
            throw new Exception("PASSWORD MUST CONTAINS ABOUT 8-16 SYMBOLS");
        } else {
            user.setPassword(password);
        }
        userService.saveRegistration(user);
        return "redirect:/second_page";
    }
}
