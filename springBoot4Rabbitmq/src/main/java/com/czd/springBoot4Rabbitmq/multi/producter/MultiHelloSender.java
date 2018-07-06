package com.czd.springBoot4Rabbitmq.multi.producter;

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
public class MultiHelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i){
        String context="i am "+i+" hello "+new Date();
//        System.out.println(i+" sender: "+context);
        this.rabbitTemplate.convertAndSend("multiHi",context);
    }
}
