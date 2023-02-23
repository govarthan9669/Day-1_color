package com.example.DAY_1COLOR;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class ApiController {

	
		@GetMapping("/Welcome")
	public String getMyFav()
	{
			String color="Green" ;
			return "My favorite color is "+color;
	}
	}


