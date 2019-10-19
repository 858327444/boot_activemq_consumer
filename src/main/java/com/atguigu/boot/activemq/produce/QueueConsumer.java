package com.atguigu.boot.activemq.produce;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * 队列 消费者
 * Program Name: activemq
 * Created by yanlp on 2019-10-19
 *
 * @author yanlp
 * @version 1.0
 */
@Component
public class QueueConsumer {

    @JmsListener(destination = "${myqueue}")
    public void receive(TextMessage textMessage) throws JMSException {
        if (null != textMessage) {
            System.out.println("********消费者收到消息: " + textMessage.getText());
        }
    }

}
