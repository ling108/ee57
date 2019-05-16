package com.itheima.text;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * @author Steven
 * @version 1.0
 * @description com.itheima.test
 * @date 2019-4-26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext-jms-consumer.xml")
public class JmsConsumerTest {

    @Test
    public void testGetTextMsg(){
        try {
            //让主线程，等待
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
