package pl.jcw.demo.microservices.user;

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
    UserDetailsDto user = new UserDetailsDto(id, "My name is " + id);
    log.info("Returning user details {}", user);
    return ResponseEntity.ok(user);
  }

}
