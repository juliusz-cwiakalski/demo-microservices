package pl.jcw.demo.microservices.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/{id}")
	public ResponseEntity<UserDetailsDto> getUser(@PathVariable("id") String id){
		return ResponseEntity.ok( new UserDetailsDto(id, "My name is "+id));
	}

}
