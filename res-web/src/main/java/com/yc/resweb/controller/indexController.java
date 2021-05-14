package com.yc.resweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: cloud-res
 * @description:
 * @author: 作者
 * @create: 2021-05-13 19:18
 */
@RestController
public class indexController {

    @Resource
    private RestTemplate template;
    @Resource
    private IServiceController serviceController;

    @GetMapping(value = "service")
    public String getService() {
        String url = "http://res-service-9200/service";
        return template.getForObject(url, String.class);
    }

    @GetMapping(value = "feign/service")
    public String getSer() {
        return serviceController.getSer();
    }

}
