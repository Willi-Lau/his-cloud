package com.lwy.his.controller;

import com.lwy.his.entity.assets.Pay;
import com.lwy.his.service.PayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentMap;

@RestController
@Slf4j
public class PayController {

    @Autowired
    private PayService service;

    @ApiOperation(" 把检查检验项目提交到  缴费表 ")
    @PostMapping("Pay/insertPay")
    void insertPay(@RequestBody Pay pay){
         service.insertPay(pay);
    }

    @PostMapping("Pay/insertPayfromdrug")
    @ApiOperation(" 提交药品到支付记录 ")
    void insertPayfromdrug(@RequestBody Pay pay){
        service.insertPayfromdrug(pay);
    }

    @PostMapping("Pay/countPay")
    @ApiOperation(" 统计Pay 条数 ")
    public int countPay() {
        return service.countPay();
    }

    @PostMapping("Pay/updatepayalive")
    @ApiOperation(" 将付款表相关信息设置为停用")
    public void updatepayalive(@RequestBody ConcurrentMap map) {
        service.updatepayalive(map);
    }
}
