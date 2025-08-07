package com.example.kafkaconsumerpreproject.service;

import com.example.kafkaconsumerpreproject.entity.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserKafkaConsumer {
    @KafkaListener(topics = "test_topic")
    public void consumeUser(User user) {
        System.out.println("User - " + user);

    }
}
