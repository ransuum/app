package com.develop.app.UserController;

import com.develop.app.Service.CopyUserService;
import com.develop.app.UserAcc.CopyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/second_page")
public class GuardController {

    @GetMapping
    public String showmore(){
        return "/steamlogin/SecondPage";
    }
}
