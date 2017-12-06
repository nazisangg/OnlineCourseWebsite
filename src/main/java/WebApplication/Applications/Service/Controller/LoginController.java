package WebApplication.Applications.Service.Controller;

import WebApplication.Applications.Service.Model.User;
import WebApplication.Applications.Service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/welcome")
    public @ResponseBody  Iterable<User> welcomePage(){
        return userRepository.findAllUsers();
    }


}
