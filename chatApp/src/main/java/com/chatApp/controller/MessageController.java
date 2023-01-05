package com.chatApp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chatApp.model.Message;

@RestController
public class MessageController {
	
	@MessageMapping("/message")
	@SendTo("/topic/return-to")
	public Message getcontent(@RequestBody Message message) {
		
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		return message;
	}

}
