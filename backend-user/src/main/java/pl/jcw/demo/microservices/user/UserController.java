package pl.jcw.demo.microservices.user;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


  private static final Logger log = LoggerFactory.getLogger(UserController.class);


  @GetMapping("/{id}")
  public ResponseEntity<UserDetailsDto> getUser(@PathVariable("id") String id) {
    UserDetailsDto user = new UserDetailsDto(id, "My name is " + id, getHostname());
    log.info("Returning user details {}", user);
    return ResponseEntity.ok(user);
  }
  
  private String getHostname() {
    try {
      return InetAddress.getLocalHost().getHostName();
    } catch (UnknownHostException e) {
      // TODO Auto-generated catch block
      return "error occured while getting host name + " +e.getMessage();
    }
  }

}
