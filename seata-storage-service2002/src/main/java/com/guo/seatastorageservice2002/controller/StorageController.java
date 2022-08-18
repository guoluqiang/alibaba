package com.guo.seatastorageservice2002.controller;

import com.guo.seatastorageservice2002.domain.CommonResult;
import com.guo.seatastorageservice2002.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    private Logger log = LoggerFactory.getLogger(StorageController.class);

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }

    @RequestMapping("/zipkin")
    public CommonResult zipkin(){
        log.info("进入ping");
        return new CommonResult(200,"成功！");
    }
}
