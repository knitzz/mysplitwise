package com.mysplitwise.mysplitwise.balance;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysplitwise.mysplitwise.group.Group;
import com.mysplitwise.mysplitwise.group.GroupRepository;
import com.mysplitwise.mysplitwise.user.User;
import com.mysplitwise.mysplitwise.user.UserRepository;

@RestController
@RequestMapping("balance")
public class BalanceController {


	@Autowired
	BalanceRepository br;
	@Autowired
	GroupRepository gr;
	@Autowired 
	UserRepository ur;
	@PostMapping("/addbalance/{gid}")
	public List<UserBalance> addGroup(@PathVariable("gid") long gid,@RequestBody List<UserBalance> ubl) {
		Group group= gr.findById(gid);
		List<UserBalance> userbalancelist=ubl;
		return userbalancelist;
	}
	@GetMapping("/test/{t1}/{t2}")
	public Groupuserembeded test(@PathVariable("t1") long t1,@PathVariable("t2") long t2) {
		
		Groupuserembeded gue=new Groupuserembeded();
		gue.setGroup(gr.findById(1));
		gue.setUser(ur.findById(2));
		balance b=new balance(gue,40);
		b.setBalance(10);
		b.setGroupuserembeded(gue);
		br.save(b);
		return gue;
		
		
	}

}
