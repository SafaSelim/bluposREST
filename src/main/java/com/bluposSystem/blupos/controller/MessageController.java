package com.bluposSystem.blupos.controller;

import com.bluposSystem.blupos.model.Message;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @GetMapping("/message")
    Message send() {
        return new Message("first try");
    }

    @PostMapping("/messageAdd")
    Message echo(@RequestBody Message message){
        return message;
    }
}
