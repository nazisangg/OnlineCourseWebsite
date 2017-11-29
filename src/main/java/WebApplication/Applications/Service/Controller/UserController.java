package WebApplication.Applications.Service.Controller;

import WebApplication.Applications.Service.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/users")
public class UserController {


    @GetMapping(path = "/users/add")
    public void addUsers(){
        String username = "nihao";
        String password = "zaijian";
        User newUser = new User(username, password);


    }



}
