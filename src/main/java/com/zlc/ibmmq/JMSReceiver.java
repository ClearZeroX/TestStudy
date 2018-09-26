package com.zlc.ibmmq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;

import com.ibm.mq.jms.MQQueue;


public class JMSReceiver implements MessageListener {

    private JmsTemplate jmsTemplate;

    private MQQueue receiveQueue;

    /**
     * @return Returns the jmsTemplate.
     */
    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    /**
     * @param jmsTemplate The jmsTemplate to set.
     */
    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    /**
     * @return Returns the receiveQueue.
     */
    public MQQueue getReceiveQueue() {
        return receiveQueue;
    }

    /**
     * @param receiveQueue The receiveQueue to set.
     */
    public void setReceiveQueue(MQQueue receiveQueue) {
        this.receiveQueue = receiveQueue;
    }

    public void onMessage(Message message) {
        try {
            System.out.println("reviced msg is:" + (new java.util.Date()) + ":" + ((TextMessage) message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    public void processMessage() {
        Message msg = jmsTemplate.receive(receiveQueue.getBaseQueueName());
        try {
            if (msg instanceof ObjectMessage) {
                ObjectMessage objMsg = (ObjectMessage) msg;
                try {
                    Person person = (Person) objMsg.getObject();
                    System.out.println("用户名：" + person.getName() + "年龄:"
                            + person.getAge());
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


