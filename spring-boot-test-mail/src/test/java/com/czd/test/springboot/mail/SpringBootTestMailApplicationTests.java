package com.czd.test.springboot.mail;

import com.czd.test.springboot.mail.entity.MailBean;
import com.czd.test.springboot.mail.util.MailUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan
public class SpringBootTestMailApplicationTests {
    @Autowired
    private MailUtils utils;
    @Test
    public void contextLoads() {
        MailBean bean = MailBean.builder().recipient("1043882230@qq.com")
                .subject("test").content("!!!").build();
        utils.sendMimeMail(bean);
    }

}
