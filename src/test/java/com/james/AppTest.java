package com.james;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class AppTest {

    Logger logger = LoggerFactory.getLogger(AppTest.class);

    @Resource
    private StarterService service;

    @Test
    public void testLog() {
        // 自己项目的日志
        logger.info("这是来自主项目的日志，使用slf4j的api进行日志打印");
        // 三方包的日志
        service.doSomething();
    }
}
