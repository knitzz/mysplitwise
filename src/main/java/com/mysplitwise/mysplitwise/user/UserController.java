package com.mysplitwise.mysplitwise.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysplitwise.mysplitwise.group.Group;
import com.mysplitwise.mysplitwise.group.GroupRepository;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserRepository ur;
	@Autowired
	GroupRepository gr;
	@GetMapping("/adduser/{fn}/{ln}")
	public void addUser(@PathVariable("fn") String fn,@PathVariable("ln") String ln) {
		User user= new User();
		user.setFirstName(fn);;
		user.setLastName(ln);
		ur.save(user);
		return;
	}
	@GetMapping("/addgrouptouser/{uid}/{gid}")
	public String addGrouptoUser(@PathVariable("uid") long uid,@PathVariable("gid") long gid) {
		User user = ur.findById(uid);
		if(user==null) {
			return "user with uid doesnt exist";
		}
		
		Group g=gr.findById(gid);
		if(g!=null) {
			g.addUser(user);
			gr.save(g);
			return "group added";
		}
		return "group id is wrong . doest exist";
	}
	
	
}
