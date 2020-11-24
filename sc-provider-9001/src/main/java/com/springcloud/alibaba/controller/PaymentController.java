package com.springcloud.alibaba.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
@Api(value = "支付模块Controller")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/nacos/{id}")
    public String getPayment(@ApiParam(name = "id",value = "查询ID") @PathVariable("id") String id){
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }

}

