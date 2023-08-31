package com.myapp.annotation.ann1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/student")
public class StudentController {

	
@Autowired
student abc;

@GetMapping(value="/display")
public String stud() {
	return abc.stud();
}
}
