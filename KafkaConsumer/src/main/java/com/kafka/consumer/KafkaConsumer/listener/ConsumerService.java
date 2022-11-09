package com.kafka.consumer.KafkaConsumer.listener;


import com.kafka.consumer.KafkaConsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "generalPOC", groupId = "group_id")
    public void consumerString(String message){
        System.out.println("String message : "+ message);
    }


    @KafkaListener( topics = "jsonPOC",
                    groupId = "group_id_json",
                    containerFactory = "jsonKafkaConsumerListenerFactory")
    public void consumeJson(User user){
        System.out.println("Json Message : "+user.toString());
    }



}
