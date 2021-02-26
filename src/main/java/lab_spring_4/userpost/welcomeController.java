package lab_spring_4.userpost;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @RequestMapping(value = "/welcome")
    private static String welcome(){
        return "Welcome to Spring Boot";
    }
}
