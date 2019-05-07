package com.zrk;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybootApplicationTests {

	@Test
	public void contextLoads() {
		log.trace("this is trance log!");
		log.debug("this is debug log!");
		log.info("this is info log!");
		log.warn("this is warn log!");
		log.error("this is error log!");
	}

}
