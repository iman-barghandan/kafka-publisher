package com.example.demo.controller;

import com.example.demo.domain.Person;
import com.example.demo.message.SendEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private SendEvent sendEvent;

    @PostMapping
    public ResponseEntity sendOnePerson(@RequestBody Person person) {
        sendEvent.sendPerson("iman", person);
        return new ResponseEntity(person, HttpStatus.OK);
    }

}
