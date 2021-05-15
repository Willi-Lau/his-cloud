package com.lwy.his.feign;

import com.lwy.his.entity.assets.Pay;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.ConcurrentMap;

@Component
@FeignClient(value = "his-pay")
public interface DoctorHomeFeignPay {

    @PostMapping("Pay/insertPay")
    void insertPay(@RequestBody Pay pay);

    @PostMapping("Pay/insertPayfromdrug")
    void insertPayfromdrug(@RequestBody Pay pay);

    @PostMapping("Pay/countPay")
    int countPay();

    @PostMapping("Pay/updatepayalive")
    void updatepayalive(@RequestBody ConcurrentMap map);

    @PostMapping("Pay/selectpayid")
    int selectpayid();

    @PostMapping("Pay/deleteHandle")
    void deletepaybyhandle(@RequestParam("hid") String hid);
}
