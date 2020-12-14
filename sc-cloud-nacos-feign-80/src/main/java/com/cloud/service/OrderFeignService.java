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
//调用其他服务的方法不用实现接口，自己调用自己需要实现本地接口，public class AbilityRestController extends BaseRestController implements AbilityFeignClient
public interface OrderFeignService {
    @GetMapping("/nacos/{id}")
    public String getPaymentById(@PathVariable("id") Long id);

    @GetMapping("findAll")
    public CommonResult<List<Payment>> getPaymentFindAll();
}
