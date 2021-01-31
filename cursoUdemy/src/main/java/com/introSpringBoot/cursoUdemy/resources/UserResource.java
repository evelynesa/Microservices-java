package com.introSpringBoot.cursoUdemy.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.introSpringBoot.cursoUdemy.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User>fidAllUsers(){
		User user = new User(1,"Evelyn","evelyn@ig.com","(11)97896-9968","@ESenhaForte");
		
		return ResponseEntity.ok().body(user);
	}
}
