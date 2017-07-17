package com.dharbor.set.persistence.persistence.rest;

import com.dharbor.set.persistence.persistence.rest.dto.Invite;
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
public class SharePersistanceController {

    @RequestMapping(
            value = "/createInvite",
            method = RequestMethod.POST
    )
    public Integer createInvite(@RequestBody Invite invite) {

        System.out.println("Saving: ");
        System.out.println(invite.getEmail());
        System.out.println(invite.getName());

        return 1;
    }

}
