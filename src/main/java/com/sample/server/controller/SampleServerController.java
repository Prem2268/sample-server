package com.sample.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/sampleserver")
public class SampleServerController {
	
	@RequestMapping("/serverdata")
	public String clientServer() {
		log.info("Server data invoked..");
		return "Data from Server";
	}

}
