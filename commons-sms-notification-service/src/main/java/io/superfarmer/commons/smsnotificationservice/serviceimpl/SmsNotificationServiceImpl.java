package io.superfarmer.commons.smsnotificationservice.serviceimpl;

import org.springframework.stereotype.Service;

import io.superfarmer.commons.smsnotificationservice.service.SmsNotificationService;

@Service
public class SmsNotificationServiceImpl implements SmsNotificationService {

	public SmsNotificationServiceImpl() {
		super();
	}
	
	@Override
	public String sendMessage() {
		return "Hello World";
	}
	
}
