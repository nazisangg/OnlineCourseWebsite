package WebApplication.Applications.Service.Service;

import java.util.List;
import java.util.Optional;


import WebApplication.Applications.Service.Model.User;
import WebApplication.Applications.Service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;



    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public List<User> findByExample(User example) {
        return null;
    }

    @Override
    public List<User> findBySpecification(Specification<User> specification) {
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public Optional<User> findUserByEmailOptional(String email) {
        return null;
    }
}
