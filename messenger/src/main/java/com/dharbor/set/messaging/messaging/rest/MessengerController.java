package com.dharbor.set.messaging.messaging.rest;

import com.dharbor.set.messaging.messaging.rest.dto.Message;
import org.springframework.web.bind.annotation.*;

/**
 * author rloayza
 */

@RestController
@RequestMapping(
        value = "/messenger"
)
public class MessengerController {

    @RequestMapping(
            value = "/sendMessage",
            method = RequestMethod.POST
    )
    public String sendMessage(@RequestBody Message message) {

        System.out.println("Sending: ");
        System.out.println(message.getBody());
        System.out.println(message.getSubject());
        System.out.println(message.getFromUserId());
        System.out.println(message.getRecipients());

        return "Message has been sent!";
    }
}
