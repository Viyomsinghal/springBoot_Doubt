package com.greatLearning.Library.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatLearning.Library.Model.GreatLearning;

@Controller
//@RestController
public class ExampleController {
	@GetMapping("/info")
	@ResponseBody
	public GreatLearning get() {
		GreatLearning gl = new GreatLearning();
		gl.setCourseName("Web services lessons......");
		gl.setCourseType("Information Technology !!!!!");
		gl.setInstructor("Viyom singhal");
		return gl;

	}

	@PostMapping("customInfo")
	public GreatLearning customInfo(String courseName, String courseType, String Instructor) {
		GreatLearning gl = new GreatLearning();
		gl.setCourseName(courseName);
		gl.setCourseType(courseType);
		gl.setInstructor(Instructor);
		return gl;

	}

}
