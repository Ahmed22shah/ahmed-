package sendmyemailapp;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaSendEmail {
	public static void sendMail(String recepient) {
		
		System.out.println("preparing to send Email....");
		//store the properties needed to access SMTP server
		Properties properties=new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		//Sender User name(email) and Password
		String username="shahahmed.2207@gmail.com";
		String password="shahshah22";
		
		//create Session Object and pass the credentials
		Session session=Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		
		//create Message Object receiving from
		Message message=prepareMessage(session,username,recepient);
		try {Transport.send(message);}catch(Exception e) {e.printStackTrace();}
		System.out.println("Email Sent Successfully to..."+recepient);
	}

	private static Message prepareMessage(Session session, String username, String recepient) {
	     Message message=new MimeMessage(session);
	     try {
	    	 message.setFrom(new InternetAddress(username));
	    	 message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
	    	 message.setSubject("-----Ahmed shah-----");
	    	 message.setText("hi,im new Wipro manager....");
	     }catch(Exception e) {e.printStackTrace();}
	     return message;
	}
}
	 