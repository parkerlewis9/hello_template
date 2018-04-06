package com.parker.hello_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@SpringBootApplication
public class HelloTemplateApplication {

	@RequestMapping("/")
	public String home(Model model) {
	    model.addAttribute("author", "Parker!!");
	    model.addAttribute("favoriteTV", "Friends");
	    model.addAttribute("favoriteMovie", "The Departed");
	    List favoriteFoods = Arrays.asList("pizza", "candy", "open faced sandwiches");
	    model.addAttribute("favoriteFoods", favoriteFoods);
		return "index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloTemplateApplication.class, args);
	}
}
