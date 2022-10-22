package com.example.kafkaproject.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics="testTopic", groupId = "kafka-test-group")
    public void consume(String message) throws IOException{
        System.out.println("Received message : " + message);
    }
}
