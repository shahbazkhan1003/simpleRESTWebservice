package com.shahbaz.webservices.publisher;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
	
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping("greeting")
	public @ResponseBody
	Greetings getGreeting(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {

		
		return new Greetings(counter.incrementAndGet(),"Hello "+name+":)");
	}
}
