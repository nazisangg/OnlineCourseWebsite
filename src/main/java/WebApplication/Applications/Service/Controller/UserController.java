package WebApplication.Applications.Service.Controller;

import WebApplication.Applications.Service.Model.User;
import WebApplication.Applications.Service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping(path = "/users/add")
    public void addUsers(){
        String username = "nihao";
        String password = "zaijian";
        User newUser = new User(username, password);


    }

    @GetMapping("/welcome")
    public @ResponseBody
    Iterable<User> welcomePage(){
        return userRepository.findAllUsers();
    }


    @GetMapping("/user/{username}")
    public @ResponseBody
    Iterable<User> getUserByUsername(@PathVariable String username){
        return userRepository.findByUsername(username);
    }





}
