package com.dharbor.set.share.share.data;

import com.dharbor.set.share.share.data.dto.Message;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * author rloayza
 */
@FeignClient(name = "messenger")
public interface SendMessageClient {

    @RequestMapping(
            value = "/messenger/sendMessage",
            method = RequestMethod.POST
    )
    String sendMessage(@RequestBody Message message);
}
