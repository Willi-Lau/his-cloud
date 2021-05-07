package com.lwy.his.entity.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用返回给前端的状态码 来判断返回的信息是否有错误等
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T>
{
    private Integer code;  //状态码 200 404 500等
    private String message;  //错误日志
    private T      data;      //不同类型 <T> T 表示“返回值”是一个泛型，传递什么类型，就返回什么类型；而单独的“T”表示限制传递的参数类型。
    /**
     * 两个参数的构造方法
     */
    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }
}
