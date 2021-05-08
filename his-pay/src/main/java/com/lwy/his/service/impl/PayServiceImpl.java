package com.lwy.his.service.impl;

import com.lwy.his.dao.PayMapper;
import com.lwy.his.entity.assets.Pay;
import com.lwy.his.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentMap;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private PayMapper mapper;

    @Override
    public void insertPay(Pay pay) {
        mapper.insertPay(pay);
    }

    @Override
    public void insertPayfromdrug(Pay pay) {
        mapper.insertPayfromdrug(pay);
    }

    @Override
    public int countPay() {
        return mapper.countPay();
    }

    @Override
    public void updatepayalive(ConcurrentMap map) {
        mapper.updatepayalive(map);
    }
}
