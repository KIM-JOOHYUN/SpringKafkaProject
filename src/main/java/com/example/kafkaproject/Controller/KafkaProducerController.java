package com.example.kafkaproject.Controller;

import com.example.kafkaproject.Service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {
    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping(value = "/sendMsg")
    public void sendMsg(@RequestParam("message") String message){
        kafkaProducerService.sendMessage(message);
    }

}
