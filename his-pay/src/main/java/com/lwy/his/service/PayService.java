package com.lwy.his.service;


import com.lwy.his.entity.assets.Pay;

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
}
