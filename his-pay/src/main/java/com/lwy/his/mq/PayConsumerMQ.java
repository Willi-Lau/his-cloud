package com.lwy.his.mq;

import com.lwy.his.entity.assets.Pay;
import com.lwy.his.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class PayConsumerMQ {

    @Autowired
    private PayService service;

    @JmsListener(destination = "${myqueuepay}")
    void insertPay(Pay pay){
        log.info("my success"+pay.toString());
        service.insertPay(pay);
    }
}
