package com.cicd.sonarcube.CICD.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.cicd.sonarcube.CICD.demo.dao.IPipelineDao;

@Repository
public class PipelineDao implements IPipelineDao{

	
	public String hello() {
		
		return "Your time starts now...from dao";
	}

}
