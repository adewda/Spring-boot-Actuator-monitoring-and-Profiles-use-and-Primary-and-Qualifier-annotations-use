package learningSpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearningPath {

	
	//method to retrieve or return or get all courses
	//Course : id,name,author 
	@RequestMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn AWS","in28minutes"), 
				new Course(2,"AWS Software developer associate","Stephane maarek"),
				new Course(3,"AI-200 course","Scott Duffy")
				);
	}
	
	//since i am following in28minutes course for creating this application,in course this
	//class is named as courseController
	
	
}
