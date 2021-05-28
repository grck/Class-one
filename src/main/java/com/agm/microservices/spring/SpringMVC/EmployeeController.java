package com.agm.microservices.spring.SpringMVC;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping(value = "/employee")
public class EmployeeController {

	@RequestMapping(value = "hello/{name}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String greet(@PathVariable String name) {
		return "Hello, welcome to Spring MVC " + name;
	}
}
