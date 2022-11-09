package com.kafka.producer.KafkaProducer.controller;


import com.kafka.producer.KafkaProducer.model.User;
import com.kafka.producer.KafkaProducer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("producer")
public class ProducerController {

    @Autowired
    ProducerService service;

    @PostMapping("/json")
    public ResponseEntity<String> publishJsonMessage(@RequestBody User user){
        service.sendJSONMessage(user);
        return new ResponseEntity<String>("Published JSON Message Successfully !!!", HttpStatus.OK);
    }

    @PostMapping("/string/{name}")
    public ResponseEntity<String> publishStringMessage(@PathVariable("name") String name){
        service.sendStringMessage(name);
        return new ResponseEntity<String>("Published String Message Successfully !!!", HttpStatus.OK);
    }


}
