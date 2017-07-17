package com.dharbor.set.share.share.data;

import com.dharbor.set.share.share.data.dto.Invite;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * author rloayza
 */
@FeignClient(name = "persistence")
public interface CreateInviteClient {

    @RequestMapping(
            value = "/share/createInvite",
            method = RequestMethod.POST
    )
    Integer createInvite(Invite invite);
}
