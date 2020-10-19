package com.cicd.sonarcube.CICD.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cicd.sonarcube.CICD.demo.dao.IPipelineDao;
import com.cicd.sonarcube.CICD.demo.service.IPipelineSevice;

@Service
public class PipelineService implements IPipelineSevice{
	
	@Autowired
	IPipelineDao pipelineDao;

	
	public String hello() {
		
		return pipelineDao.hello();
	}
}
