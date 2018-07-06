package com.czd.springBoot4Rabbitmq.multi.consumer;

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
@RabbitListener(queues = "multiHi")
public class HelloReciver2 {
    @RabbitHandler
    public void process(String context){
        System.out.println("Receive 2: "+context);
    }
}
