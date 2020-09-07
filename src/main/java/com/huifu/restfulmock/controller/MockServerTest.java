package com.huifu.restfulmock.controller;


import com.huifu.restfulmock.entity.BatchDetailsEntity;
import com.huifu.restfulmock.entity.FxConversionEntity;
import com.huifu.restfulmock.service.BatchDetailsService;
import com.huifu.restfulmock.service.FxConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//requestMapping注释用于定义访问REST端点的Request URI
@RequestMapping("/mock")
//定义RESTFUL格式，有了该注解，在响应返回的是json格式的数据
@RestController

public class MockServerTest {

    @Autowired
    private BatchDetailsService batchDetailsService;

    @Autowired
    private FxConversionService fxConversionService;

    @RequestMapping("/fxAll")
    public List<BatchDetailsEntity> findAllDetails() {
        return batchDetailsService.findAllDetails();
    }

    @GetMapping("/fx/{id}")
    public BatchDetailsEntity findDetailByid(@PathVariable("id") Integer inquiry_id) {
        return batchDetailsService.findDetail(inquiry_id);
    }
    @RequestMapping("/conversion/create")
    public void createConversion(FxConversionEntity fxConversionEntity){
        fxConversionEntity.setChannel_code("test");
        fxConversionService.addDetails(fxConversionEntity);
    }
}
