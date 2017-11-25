package utils;

import models.Sale;

public class EmailUtil {

	
	public static void sendEmailForSale(Sale sale) {/*
		
		final String username = "ecommerce.test.lucy@gmail.com";
		final String password = "wubbalubbadubdub";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(sale.getUser().getEmail()));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(sale.getUser().getEmail()));
			message.setSubject("Order: " + sale.getId() + " is comming!");
			message.setText("Dear " + sale.getUser().getName() + ","
				+ "\n\n This is an information email for you about your order number: " + sale.getId() + "!"
						+ "\n Now the status of your order is: " + sale.getStatus().toString() 
						+ ", but do not worry, as soon as payment is made, we will ship to you!");

			Transport.send(message);

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
	*/}

}
