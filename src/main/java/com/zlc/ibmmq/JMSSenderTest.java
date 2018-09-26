package com.zlc.ibmmq;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : ZLC
 * @create : 2018-08-20 10:08
 * @desc :
 **/
public class JMSSenderTest {


    @Test
    public void jmsSender() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext-ibmmq.xml");
        JMSSender sender = (JMSSender)app.getBean("jmsSender");
        Person person = new Person("watson",20);
        sender.sendMesage(person);
    }

    @Test
    public void jmsReceiver() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext-ibmmq.xml");
        JMSReceiver receiver = (JMSReceiver)app.getBean("jmsReceiver");
        receiver.processMessage();
    }


}
