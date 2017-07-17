package com.dharbor.set.share.share.rest;

import com.dharbor.set.share.share.data.CreateInviteClient;
import com.dharbor.set.share.share.data.SendMessageClient;
import com.dharbor.set.share.share.data.dto.Invite;
import com.dharbor.set.share.share.data.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * author rloayza
 */

@RestController
@RequestMapping(
        value = "/share"
)
public class CreateShareInvitationController {

    @Autowired
    private CreateInviteClient createInviteClient;

    @Autowired
    private SendMessageClient sendMessageClient;

    @RequestMapping(
            value = "/createInvite",
            method = RequestMethod.POST
    )
    public Integer createInvite(@RequestBody Invite invite) {

        Integer [] recipients = {1, 2, 3, 4};
        Message message = new Message();
        message.setBody("Hola dude!");
        message.setSubject("Holaa");
        message.setFromUserId(1);
        message.setRecipients(recipients);
        System.out.println(sendMessageClient.sendMessage(message));

        return createInviteClient.createInvite(invite);
    }
}
