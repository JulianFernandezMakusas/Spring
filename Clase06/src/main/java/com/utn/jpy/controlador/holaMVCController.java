package com.utn.jpy.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class holaMVCController {
	
	@RequestMapping("holaSpring")
	public ModelAndView holaSpring (){
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("saludo", "Hola Spring desde el Controller");
		mv.setViewName("holaMVC");
		return mv;
		
	}
	

}
