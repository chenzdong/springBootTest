package com.czd.springBoot4Rabbitmq;

import com.czd.springBoot4Rabbitmq.producter.HelloSender;
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
public class RabbitMqTest {
    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello(){
        helloSender.send();
    }
}
