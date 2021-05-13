package com.lwy.his.service;


import com.lwy.his.entity.assets.Pay;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.concurrent.ConcurrentMap;

public interface PayService {
    /**
     * 把检查检验项目提交到  缴费表
     */
    void insertPay(Pay pay);
    /**
     * 提交药品到支付记录
     */
    void insertPayfromdrug( Pay pay);
    /**
     * 统计pay 表数据个数
     */
    int countPay();
    /**
     * 将付款表相关信息设置为停用
     */
    void updatepayalive(ConcurrentMap map);
    /**
     * 返回pay 表上一个添加的id id 倒叙第一个就是最后一个添加的id
     */
    int selectpayid();
    /**
     * 退回药品
     */
    void deletepaybyhandle(String hid);
}
