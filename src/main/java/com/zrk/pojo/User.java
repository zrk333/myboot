package com.zrk.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: zrk
 * @Date: 2019/5/4
 */
@Data
public class User implements Serializable{

    private static final long serialVersionUID = -659122186312533781L;

    private Integer id;
    private String name;
    private String password;
}
