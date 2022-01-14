
package net.javaguides.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
//@RequestMapping("api/")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody User user) {
		User us = this.userRepository.save(user);
		return ResponseEntity.ok(us);
	}
	
	@GetMapping("/user")
	public List<User> getUsers() {
		return this.userRepository.findAll();
	}
	@DeleteMapping("/user")
	public String deleteAll() {
		userRepository.deleteAll();
		return "Deleted";
	}
	
	
	
}