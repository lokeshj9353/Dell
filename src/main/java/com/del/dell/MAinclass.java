package com.del.dell;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MAinclass {

	@Autowired
	studrepositary str;
	
	@PostMapping("/save")
	public stud savestud(@RequestBody stud stud) {
		stud s=str.save(stud);
		return s;
	}
	
	@GetMapping("/fetch")
	public List<stud> getAll(){
		return str.findAll();
	}

}
