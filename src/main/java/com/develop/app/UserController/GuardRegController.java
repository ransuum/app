package com.develop.app.UserController;

import com.develop.app.Service.CopyUserService;
import com.develop.app.Service.UserService;
import com.develop.app.UserAcc.CopyUser;
import com.develop.app.UserAcc.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuardRegController {
    private final CopyUserService copyUserService;
    @Autowired
    public GuardRegController(CopyUserService copyUserService) {
        this.copyUserService = copyUserService;
    }
    @PostMapping("/reg")
    public String reg1(@RequestParam("guard") String guard) throws Exception {
        CopyUser copyUser = new CopyUser();
        String s = guard.toUpperCase();
        if (s.length() > 5) {
            throw new Exception("STEAM GUARD MUST HAVE ONLY 5 SYMBOLS");
        }else {
            copyUser.setGuard(s);
            copyUserService.reg(copyUser);
        }
        return "redirect:/";
    }
}
