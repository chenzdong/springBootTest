package com.czd.test.springboot.kakfa.deal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * 生产者
 *
 * @author: czd
 * @create: 2019-06-14 15:02
 */
public class Producer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String msg) {
        kafkaTemplate.send("test", msg);
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.send("hello");
    }
}
