package com.utn.jfm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaSpringController {
	
	
	@RequestMapping("holaSpring")
	public ModelAndView holaSpring () {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("saludo", "Hola Spring");
		mv.setViewName("HolaMvc");
		
		return mv;
	}


}
