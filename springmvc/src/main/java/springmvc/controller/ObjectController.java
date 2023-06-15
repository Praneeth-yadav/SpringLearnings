package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc.dto.Employee;
@Controller
public class ObjectController {
	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelanview=new ModelAndView();
		modelanview.setViewName("displayObject");
		Employee emp=new Employee();
		emp.setId(1234);
		emp.setName("john");
		emp.setSalary(8000);
		modelanview.addObject("employee", emp);
		
		return modelanview;
		
	}

}
