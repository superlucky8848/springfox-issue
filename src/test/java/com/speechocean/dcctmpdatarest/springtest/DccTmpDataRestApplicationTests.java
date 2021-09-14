package com.speechocean.dcctmpdatarest.springtest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DccTmpDataRestApplicationTests 
{
	private static final Logger log = LogManager.getLogger(DccTmpDataRestApplicationTests.class);

	@Autowired
	ApplicationContext context;

	@Test
	void ContextLoadsTest() 
	{
		assertNotNull(context);
		log.info("!!ContextLoadsTest() START!!");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(log::info);
		log.info("!!ContextLoadsTest() FINISH!!");
	}
}
