package com.kafka.producer.KafkaProducer.service;


import com.kafka.producer.KafkaProducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    // Json Topic
    @Autowired
    KafkaTemplate<String, User> jsonTemplate;
    private static final String JSONTopic = "jsonPOC";

    public void sendJSONMessage(User user){
        jsonTemplate.send(JSONTopic, user);
    }


    // General Topic
    @Autowired
    KafkaTemplate<String, String> generalTemplate;
    private static final String generalTopic = "generalPOC";

    public void sendStringMessage(String name){
        generalTemplate.send(generalTopic, name);
    }

}
