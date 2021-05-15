package com.lwy.his.mq;

import com.lwy.his.entity.assets.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class PayProduceMQ {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    /**
     * 执行支付 发送到pay模块下
     * @param pay
     */
    public void produceMsgPay(Pay pay){
        jmsMessagingTemplate.convertAndSend(queue,pay);
    }
}
