package com.example.demo.message;


import com.example.demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.Date;


@Service
@Configuration
public class SendEvent {

    @Autowired
    private KafkaTemplate<String, Person> kafkaTemplate;


    /**
     * send Person using the KafkaTemplate class
     *
     * @param person
     */
    public void sendPerson(Person person) {

        person.setSendDate(new Date());
        kafkaTemplate.send("person-register-topic", person);

//        future.addCallback(new ListenableFutureCallback<SendResult<String, Person>>()
//        {
//
//            @Override
//            public void onSuccess(SendResult<String, Person> result) {
//                System.out.println("success");
//                System.out.println("Sent message=[" + message +
//                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
//            }
//
//            @Override
//            public void onFailure(Throwable ex) {
//                System.out.println("failure");
//                System.out.println("Unable to send message=["
//                        + message + "] due to : " + ex.getMessage());
//            }
//        });
    }

}
