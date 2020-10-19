package com.cicd.sonarcube.CICD.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cicd.sonarcube.CICD.demo.service.IPipelineSevice;

@RestController
@RequestMapping("/")
public class PipelineController {
	
	@Autowired
	IPipelineSevice pipelineService;
	
     @GetMapping("hello")
	public String hello() {
		
		return pipelineService.hello();
	}

}
