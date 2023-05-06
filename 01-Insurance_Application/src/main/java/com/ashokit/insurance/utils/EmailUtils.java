package com.ashokit.insurance.utils;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtils {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public boolean sendEmail(String subject, String body, String to, File file) {
		
		try {
			
			MimeMessage mimeMsg = mailSender.createMimeMessage();
			
			MimeMessageHelper helper = new MimeMessageHelper(mimeMsg, true);
			
			//helper.setFrom("mabhilash1991997@gmail.com");
			helper.setSubject(subject);
			helper.setText(body, true);
			helper.setTo(to);
			helper.addAttachment("Plans-Info", file);
			
			mailSender.send(mimeMsg);
			System.out.println("Email sent successfully....");

		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return true;
	}

}
