package io.superfarmer.commons.smsnotificationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.superfarmer.commons.smsnotificationservice.service.SmsNotificationService;

@RestController
public class SmsNotificationController {
	@Autowired
	SmsNotificationService smsNotificationService;
	
	@GetMapping("/sendMessage")
	public String sendMessage() {
		return smsNotificationService.sendMessage();
	}
}
