package com.bah.ode.api.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mvc")
public class SampleSpringController {
	
	@RequestMapping(value = "mvc/{username}")
	public @ResponseBody String get(@PathVariable String username) {
		return username;

	}	

}
