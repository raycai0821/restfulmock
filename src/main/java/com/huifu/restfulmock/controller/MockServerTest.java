package com.huifu.restfulmock.controller;


import com.huifu.restfulmock.entity.BatchDetailsEntity;
import com.huifu.restfulmock.entity.ChannelDetailsEntity;
import com.huifu.restfulmock.service.BatchDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/mock") //requestMapping注释用于定义访问REST端点的Request URI
@RestController //定义RESTFUL格式，有了该注解，在响应返回的是json格式的数据

public class MockServerTest {

    @Autowired
    private BatchDetailsService batchDetailsService;

    @RequestMapping("/fxAll")
    public List<BatchDetailsEntity> findAllDetails() {
        return batchDetailsService.findAllDetails();
    }

    @GetMapping("/fx/{id}")
    public BatchDetailsEntity findDetailByid(@PathVariable("id") Integer inquiry_id) {
        return batchDetailsService.findDetail(inquiry_id);
    }

    public ChannelDetailsEntity updateConversionById(){
        return null;
    }
}
