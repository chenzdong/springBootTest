package com.czd.test.springboot.mail.util;

import com.czd.test.springboot.mail.entity.MailBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @author: czd
 * @create: 2019-10-09 10:45
 */
@Slf4j
@Component
public class MailUtils {
    @Autowired
    private JavaMailSender javaMailSender;
    /**
     * 发送简单格式的邮件
     * @param mail
     */
    public void sendSimpleMail(MailBean mail) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("960013453@qq.com");
            message.setTo(mail.getRecipient());
            message.setSubject(mail.getSubject());
            message.setText(mail.getContent());
            javaMailSender.send(message);
        } catch (MailException e) {
            log.error("邮件发送失败"+e.getMessage());
        }
    }

    public void sendMimeMail(MailBean mail) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom("960013453@qq.com");
            helper.setTo(mail.getRecipient());
            helper.setSubject(mail.getSubject());
            helper.setText(mail.getContent());
            FileSystemResource image = new FileSystemResource("src/main/resources/images/favicon.ico");
            helper.addAttachment("ico",image);
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            log.error("邮件发送失败"+e.getMessage());
        }

    }


}
