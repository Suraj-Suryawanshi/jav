package vesit.mca.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vesit.mca.springboot.entity.course;
import vesit.mca.springboot.services.courseservices;

@RestController
public class Mycontroller {
	
	private courseservices cs = new courseservices();
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	
	@GetMapping("/courses")
	public List<course> getcourses()
	{
		return this.cs.getcourses();
	}
	
	@GetMapping("/courses/{courseid}")
	public course getcourse()
	{
		return this.cs.getcourse(1);
	}

}
