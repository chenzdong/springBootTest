package com.czd.springBoot4Rabbitmq;

import com.czd.springBoot4Rabbitmq.entityMessage.User;
import com.czd.springBoot4Rabbitmq.entityMessage.producter.EntitySender;
import com.czd.springBoot4Rabbitmq.simple.producter.HelloSender;
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
public class EntityRabbitMqTest {
    @Autowired
    private EntitySender entitySender;

    @Test
    public void hello(){
        User user=new User(1,"admin");
        entitySender.send(user);
    }
}
