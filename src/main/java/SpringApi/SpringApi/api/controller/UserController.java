package SpringApi.SpringApi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import SpringApi.SpringApi.api.model.User;
import SpringApi.SpringApi.service.UserService;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id) {
        java.util.Optional<User> user = userService.getUser(id);

        if (user.isPresent()) {
            return user.get();
        }

        return null;
    }
}
