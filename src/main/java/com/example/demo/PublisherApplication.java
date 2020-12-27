package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublisherApplication {
    public static void main(String[] args) {
        SpringApplication.run(PublisherApplication.class, args);
//        Person person = new Person();
//        person.setName("Meisam");
//        person.setLastname("Zolfaghari");
//
//        ApplicationContextProvider.getContext().getBean(SendEvent.class).sendPerson(person);
    }
}
