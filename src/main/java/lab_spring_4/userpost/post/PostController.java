package lab_spring_4.userpost.post;

import lab_spring_4.userpost.location.Location;
import lab_spring_4.userpost.user.User;
import lab_spring_4.userpost.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;
    @RequestMapping(value = "/posts")
    public List<Post> getAllPosts(){
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
        Post post1 = new Post(
                "p1",
                "01-Jan-19",
                user1,
                "Its good to love and be loved");
        Post post2 = new Post(
                "p2",
                "02-Jan-19",
                user2,
                "We all need someone");

        return Arrays.asList(post1, post2);
    }
}
