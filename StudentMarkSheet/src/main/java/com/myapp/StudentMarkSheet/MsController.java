package com.myapp.StudentMarkSheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Mark")
public class MsController {
	@Autowired
	MsService ser;
@PostMapping(value="/display")
public String display(@RequestBody List<MarkSheet> a) {
	return ser.display(a);
}
}
