package com.huifu.restfulmock.controller;


import com.huifu.restfulmock.entity.BatchDetailsEntity;
import com.huifu.restfulmock.service.BatchDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/mock")
@RestController

public class MockServerTest {

    @Autowired
    private BatchDetailsService batchDetailsService;

    @RequestMapping("/fxAll")
    public List<BatchDetailsEntity> test(){
        return batchDetailsService.findAllDetails();
    }

    @GetMapping("/fx/{id}")
    public BatchDetailsEntity findDetailByid(@PathVariable("id") Integer inquiry_id){
        return batchDetailsService.findDetail(inquiry_id);
    }
}
