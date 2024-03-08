package file_management.peoject.controller;

import file_management.peoject.common.Result;
import file_management.peoject.entity.User;
import file_management.peoject.service.UserService;
import file_management.peoject.util.NameConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController implements NameConstant {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        System.out.println("hhh");
        return userService.login(user);
    }
}
