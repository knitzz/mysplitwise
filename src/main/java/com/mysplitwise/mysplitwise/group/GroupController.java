package com.mysplitwise.mysplitwise.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mysplitwise.mysplitwise.user.UserRepository;

@RestController
@RequestMapping("Group")
public class GroupController {

	@Autowired
	UserRepository ur;
	@Autowired
	GroupRepository gr;
	@GetMapping("/addgroup/{gn}")
	public long addGroup(@PathVariable("gn") String gn) {
		Group group= new Group();
		group.setGroupName(gn);
		gr.save(group);
		return group.getId();
	}
}