package com.FordDemo.Car.Email;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.FordDemo.Car.model.UserEmail;


@Service
public class EMailService {

	private JavaMailSender javaMailSender;

	@Autowired
	public EMailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}



	public void sendEmail(UserEmail userEmail) throws MailException {


		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(userEmail.getEmailAddress());
		mail.setSubject("Testing Car API");
		mail.setText("Car records are being accessed correctly.  ");
		javaMailSender.send(mail);
	}}