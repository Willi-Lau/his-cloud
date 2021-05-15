package com.lwy.his.sentinelHandle;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class SentinelHandle {

    public static String handlerException(BlockException exception)
    {
        return "no";
    }
}
