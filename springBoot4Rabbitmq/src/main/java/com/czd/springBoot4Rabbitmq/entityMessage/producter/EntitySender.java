package com.czd.springBoot4Rabbitmq.entityMessage.producter;

import com.czd.springBoot4Rabbitmq.entityMessage.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 生产者
 *
 * @author: czd
 * @create: 2018/7/5 16:02
 */
@Component
public class EntitySender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(User user){
        System.out.println("sender: "+user.toString());
        this.rabbitTemplate.convertAndSend("entity",user);
    }
}
