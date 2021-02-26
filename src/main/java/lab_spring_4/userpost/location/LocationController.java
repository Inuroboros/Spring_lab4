package lab_spring_4.userpost.location;

import lab_spring_4.userpost.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;
    @RequestMapping(value = "/locations")
    public List<Location> getAllLocations(){
        Location location1 = new Location("l1", "Astana");
        Location location2 = new Location("l2", "Almaty");
        Location location3 = new Location("l3", "Budapest");

        return Arrays.asList(location1, location2, location3);
    }
}
