package com.czd.springBoot4Rabbitmq.entityMessage.consumer;

import com.czd.springBoot4Rabbitmq.entityMessage.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 *
 * @author: czd
 * @create: 2018/7/5 16:05
 */
@Component
@RabbitListener(queues = "entity")
public class EntityReciver {
    @RabbitHandler
    public void process(User user){
        System.out.println("Receive: "+user);
    }
}
