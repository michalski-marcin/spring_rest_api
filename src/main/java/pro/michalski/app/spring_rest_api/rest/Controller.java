package pro.michalski.app.spring_rest_api.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users") //http://localhost:8080/users
public class Controller {

    @GetMapping(path = "/{userId}")
    public String getUser(@PathVariable String userId) {
        return "Get user with ID: " + userId;
    }

    @PostMapping
    public String createUser() {
        return "Create user";
    }

    @PutMapping
    public String updateUser() {
        return "Update user";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Delete user";
    }
}
