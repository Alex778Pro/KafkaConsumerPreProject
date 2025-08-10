package com.example.kafkaconsumerpreproject.service;

import com.example.kafkaconsumerpreproject.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserKafkaConsumer {
    private static final Logger log = LoggerFactory.getLogger(UserKafkaConsumer.class);

    @KafkaListener(topics = "test_topic")
    public void consumeUser(User user) {
        log.info("User - " + user);
    }
}
