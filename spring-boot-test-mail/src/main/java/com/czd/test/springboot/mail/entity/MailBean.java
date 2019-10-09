package com.czd.test.springboot.mail.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 邮件实体
 *
 * @author: czd
 * @create: 2019-10-09 10:42
 */
@Data
@Builder
public class MailBean implements Serializable {
    /** 邮件接收人*/
    private String recipient;
    /** 邮件主题 */
    private String subject;
    /** 邮件内容 */
    private String content;
}
