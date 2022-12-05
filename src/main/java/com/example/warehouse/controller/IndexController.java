package com.example.warehouse.controller;

import com.example.warehouse.domain.UserResponse;
import com.example.warehouse.dto.UserDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.HtmlUtils;

@Controller
public class IndexController {

    @MessageMapping("/type")
    @SendTo("/topic/type")
    public UserResponse UserResponse(UserDTO user) throws Exception {
        Thread.sleep(1000);
        return new UserResponse("Hello, " + HtmlUtils.htmlEscape(user.getName()) + " !");

    }

}
