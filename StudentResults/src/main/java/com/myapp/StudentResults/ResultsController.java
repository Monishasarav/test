package com.myapp.StudentResults;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.yaml.snakeyaml.error.Mark;

@RestController
@RequestMapping(value = "/result")
public class ResultsController {
	@Autowired
	RestTemplate rest;
    
	@Autowired
	ResultsService ser;

	@PostMapping(value = "/display")
	public String display(@RequestBody List<Results> a) {
		//System.out.println(a);
	
		return ser.display(a);
		
	}


	@GetMapping(value = "/readvalues")
	public List<Results> read() {
		String url1 = "http://localhost:8080/student/postvalues/";
		String url2 = "http://localhost:8081/Mark/display/";
		ResponseEntity<List<Results>> res1 = rest.exchange(url2, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Results>>() {
				});
		List<Results> r = res1.getBody();
		ArrayList<Results> rts = new ArrayList<>();
		r.forEach(x -> {
			int id = x.getId();
			ResponseEntity<Integer> total = rest.exchange(url1 + id, HttpMethod.GET, null, Integer.class);
			int tot = total.getBody();

			ResponseEntity<Integer> att = rest.exchange(url2 + id, HttpMethod.GET, null, Integer.class);
			int at = att.getBody();
			x.setTotalMarks(tot);
			if (at >= 85 && x.getTotalMarks() <= 95) {
				x.setTotalMarks(x.getTotalMarks() + 5);
			}
			int percentage = (int) (x.getTotalMarks() / 100.0 * 100);
			x.setPercentage(percentage);
			rts.add(x);
		});
		return ser.readvalues();
        }

	@PutMapping(value = "/update")
	public String update(@RequestBody List<Results> a) {
		return ser.update(a);
	}

	@DeleteMapping(value = "/delete")
	public String delete(@RequestBody List<Results> a) {
		return ser.delete(a);
	}

}
