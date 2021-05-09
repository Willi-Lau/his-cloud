package com.lwy.his.entity.assets;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Api("药品非药品和Pay表对应的信息")
@NoArgsConstructor
@AllArgsConstructor
public class DrugOrHandleWithPayRecord implements Serializable {
    private int dhprid;
    private String pid;
    private String dhid;
}
