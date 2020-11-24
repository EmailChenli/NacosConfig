package com.cloud.service;

import com.example.cloudaipcommons.entity.CommonResult;
import com.example.cloudaipcommons.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@FeignClient(value = "nacos-payment-provider")
@RequestMapping("payment")
public interface OrderFeignService {
    @GetMapping("/nacos/{id}")
    public String getPaymentById(@PathVariable("id") Long id);

    @GetMapping("findAll")
    public CommonResult<List<Payment>> getPaymentFindAll();
}
