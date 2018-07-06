package com.czd.springBoot4Rabbitmq;

import com.czd.springBoot4Rabbitmq.multi.producter.MultiHelloSender;
import com.czd.springBoot4Rabbitmq.multi.producter.MultiHelloSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 *
 * @author: czd
 * @create: 2018/7/5 16:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MultRabbitMqTest {
    @Autowired
    private MultiHelloSender helloSender;
    @Autowired
    private MultiHelloSender2 helloSender2;

    @Test
    public void hello(){
        for (int i = 0; i < 100; i++) {
            helloSender.send(i);
            helloSender2.send(i);
        }
    }
}
