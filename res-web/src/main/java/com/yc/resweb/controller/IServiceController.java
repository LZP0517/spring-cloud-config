package com.yc.resweb.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: cloud-res
 * @description:
 * @author: 作者
 * @create: 2021-05-13 19:37
 */
@FeignClient(value = "res-service-9200", fallback = ServiceController.class)
public interface IServiceController {

    @GetMapping(value = "feign/service")
    public String getSer();

}
