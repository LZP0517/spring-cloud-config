package com.yc.resweb.controller;

import org.springframework.stereotype.Component;

/**
 * @program: cloud-res
 * @description:
 * @author: 作者
 * @create: 2021-05-13 20:34
 */
@Component
public class ServiceController implements IServiceController {

    @Override
    public String getSer() {
        return "hyservice";
    }
}
