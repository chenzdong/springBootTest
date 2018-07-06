package com.czd.springBoot4Rabbitmq.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * rabbitMQ配置类
 *
 * @author: czd
 * @create: 2018/7/5 15:59
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue Queue(){
        return  new Queue("hi");
    }

    @Bean
    public Queue MultiQueue(){
        return new Queue("multiHi");
    }
}
