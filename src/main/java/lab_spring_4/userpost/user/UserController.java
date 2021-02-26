package lab_spring_4.userpost.user;

import lab_spring_4.userpost.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/users")
    public List<User> getAllUsers(){
        User user1 = new User(
                "u1",
                "Jany",
                "Lawrence",
                new Location("l1", "Astana"),
                "Jany@gmail.com");
        User user2 = new User(
                "u2",
                "Jadon",
                "Mills",
                new Location("l2", "Almaty"),
                "Jadon@gmail.com");

        return Arrays.asList(user1, user2);
    }
}
