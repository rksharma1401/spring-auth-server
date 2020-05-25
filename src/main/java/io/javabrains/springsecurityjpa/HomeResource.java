package io.javabrains.springsecurityjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springsecurityjpa.models.User;

@RestController
public class HomeResource {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }

    @GetMapping("/admin/is")
    public String adminis() {
        return ("<h1>Welcome Admin subpage</h1>");
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {

        return  userRepository.findAll();
    }
}

