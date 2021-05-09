package com.lwy.his.dao;

import com.lwy.his.entity.assets.Pay;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentMap;

@Repository
public interface PayMapper {
    /**
     * 把检查检验项目提交到  缴费表
     */
    @Insert("insert into Pay(pmrid,proid,pmoney,pnum,pallmoney,ptime,ptype,pgivemoney,palive)" +
            "values(#{pmrid},#{proid},#{pmoney},#{pnum},#{pallmoney},#{ptime},#{ptype},#{pgivemoney},#{palive})")
    void insertPay(Pay pay);

    /**
     * 提交药品到支付记录
     */
    @Insert("insert into pay (pmrid,proid,pmoney,pnum,pallmoney,ptime,ptype,pgivemoney,palive) " +
            "values(#{pmrid},#{proid},#{pmoney},#{pnum},#{pallmoney},#{ptime},#{ptype},#{pgivemoney},#{palive})")
    void insertPayfromdrug(Pay pay);

    /**
     * 统计pay 表数据个数
     */
    @Select("select count(*) from pay")
    int countPay();

    /**
     * 将付款表相关信息设置为停用
     */
    @Update("update pay set palive = 1 where pmrid = #{mrid} and proid = #{id} limit 1 and palive = 0")
    void updatepayalive(ConcurrentMap map);
    /**
     * 返回pay 表上一个添加的id id 倒叙第一个就是最后一个添加的id
     */
    @Select("select pid from pay order by pid desc limit 1")
    int selectpayid();
}
