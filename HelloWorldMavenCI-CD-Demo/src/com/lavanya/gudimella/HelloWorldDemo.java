package com.lavanya.gudimella;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/display")
public class HelloWorldDemo {
	
	@RequestMapping(value="/helloWorld", method=RequestMethod.GET)
	public ModelAndView displayHelloWorld() {
		ModelAndView modelAndView = new ModelAndView("DisplayHelloWorld");
		return modelAndView;
	}
}
