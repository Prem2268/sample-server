package com.sample.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sampleserver")
public class SampleServerController {
	
	@RequestMapping("/serverdata")
	public String clientServer() {
		return "Data from Server";
	}

}
