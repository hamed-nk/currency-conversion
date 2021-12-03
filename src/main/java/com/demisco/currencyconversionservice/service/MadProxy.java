package com.demisco.currencyconversionservice.service;

import com.demisco.currencyconversionservice.request.MadCashBoxRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "vbn", url = "https://madev.demisco.com:30110/vbn")
public interface MadProxy {

    @PostMapping("/cashbox/registerCashBox")
    public Object registerCashBox(@RequestBody MadCashBoxRequest madCashBoxRequest);
}
