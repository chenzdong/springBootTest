package com.czd.springBoot4Rabbitmq.consumer;

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
@RabbitListener(queues = "hi")
public class HelloReciver {
    @RabbitHandler
    public void process(String context){
        System.out.println("Receive: "+context);
    }
}
