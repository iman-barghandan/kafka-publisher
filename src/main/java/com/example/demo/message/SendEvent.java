package com.example.demo.message;


import com.example.demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;


@Service
public class SendEvent {

    @Autowired
    private KafkaTemplate<String, Person> kafkaTemplate;


    /**
     * send Person using the KafkaTemplate class
     *
     * @param message
     * @param person
     */
    public void sendPerson(String message, Person person) {

        ListenableFuture<SendResult<String, Person>> future =
                kafkaTemplate.send("iman", person);

        future.addCallback(new ListenableFutureCallback<SendResult<String, Person>>() {

            @Override
            public void onSuccess(SendResult<String, Person> result) {
                System.out.println("success");
                System.out.println("Sent message=[" + message +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            }

            @Override
            public void onFailure(Throwable ex) {
                System.out.println("failure");
                System.out.println("Unable to send message=["
                        + message + "] due to : " + ex.getMessage());
            }
        });
    }

}
