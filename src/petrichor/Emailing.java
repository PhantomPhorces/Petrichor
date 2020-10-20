/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrichor;

import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Gareth
 */
public class Emailing {

    final static String PROGRAMMERS = "petrichorprogrammer@gmail.com";
    final static String HORTICULTURALISTS = "garethcockburn@crawfordcloud.co.za";

    /**
     * Sends an email to the email address specified by using one of the class's constants using the content and body parsed through with the user's email address appended to the end
     *
     * @param subject The subject of the email as a string
     * @param message The body of the email as a string
     * @param toAddress The email address of the recipient using one of the class's constants
     * @param theirEmail The user's email in order to append it to the bottom of the email as a string
     * @return Boolean true if the mail was sent successfully and false if there was an error
     */
    public static boolean sendEmail(String subject, String message, String toAddress, String theirEmail) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                Properties properties = new Properties();
                properties.put("mail.smtp.auth", "true");
                properties.put("mail.smtp.starttls.enable", "true");
                properties.put("mail.smtp.host", "smtp.gmail.com");
                properties.put("mail.smtp.port", "587");
                String password = "PetrichorUser123";
                String fromAddress = "petrichoruser@gmail.com";
                Session thisSession = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(fromAddress, password);
                    }
                });
                try {
                    MimeMessage sending = new MimeMessage(thisSession);
                    sending.setFrom(new InternetAddress(fromAddress));
                    sending.addRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
                    sending.setSubject(subject);
                    sending.setText(message + "\n\nFrom: " + theirEmail);
                    Transport.send(sending);
                    JOptionPane.showMessageDialog(null, "Your message was sent successfully");
                } catch (MessagingException ex) {
                    JOptionPane.showMessageDialog(null, "Your message failed to send. Please check your internet connection.");
                }
            }
        };
        thread.start();
        return true;
    }
}
