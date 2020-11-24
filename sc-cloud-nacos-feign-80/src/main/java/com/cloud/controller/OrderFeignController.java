package com.cloud.controller;

import com.cloud.service.OrderFeignService;
import com.example.cloudaipcommons.entity.CommonResult;
import com.example.cloudaipcommons.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("consumer")
public class OrderFeignController {
    @Resource
    private OrderFeignService orderFeignService;

    @GetMapping("get/{id}")
    public String getPaymentById(@PathVariable("id") Long id){
        return orderFeignService.getPaymentById(id);
    }

    @GetMapping("get/findAll")
    public CommonResult<List<Payment>> getPaymentFindAll(){
        return  orderFeignService.getPaymentFindAll();
    }

}