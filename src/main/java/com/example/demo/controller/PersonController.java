package com.example.demo.controller;

import com.example.demo.domain.Person;
import com.example.demo.message.SendEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private SendEvent sendEvent;

    @PostMapping("/p")
    public ResponseEntity sendOnePerson(@RequestBody Person person) {
        sendEvent.sendPerson(person);
        return new ResponseEntity(person, HttpStatus.OK);
    }

    @GetMapping("/g")
    public void test()
    {
        System.out.println("%%%%%%%%%%%%%%%%%");
    }

}
