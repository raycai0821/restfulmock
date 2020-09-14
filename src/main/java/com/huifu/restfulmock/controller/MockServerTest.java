package com.huifu.restfulmock.controller;


import com.huifu.restfulmock.entity.BatchDetailsEntity;
import com.huifu.restfulmock.entity.FxConversionEntity;
import com.huifu.restfulmock.enums.ResultCode;
import com.huifu.restfulmock.serviceimpl.BatchDetailsServiceImpl;
import com.huifu.restfulmock.serviceimpl.FxConversionServiceImpl;
import com.huifu.restfulmock.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//requestMapping注释用于定义访问REST端点的Request URI
@RequestMapping("/mock")
//定义RESTFUL格式，有了该注解，在响应返回的是json格式的数据
@RestController

public class MockServerTest {

    @Autowired
    private BatchDetailsServiceImpl batchDetailsService;

    @Autowired
    private FxConversionServiceImpl fxConversionService;

    @RequestMapping("/fxAll")
    public List<BatchDetailsEntity> findAllDetails() {
        return batchDetailsService.findAllDetails();
    }

    @GetMapping("/fx/{id}")
    public BatchDetailsEntity findDetailByid(@PathVariable("id") Integer inquiry_id) {
        return batchDetailsService.findDetail(inquiry_id);
    }
    @RequestMapping("/conversion/create")
    @ExceptionHandler
    public ResultVO createConversion(@RequestBody FxConversionEntity fxConversionEntity){

//        if (fxConversionService.addDetails(fxConversionEntity)){
//            return new ResultVO(fxConversionEntity);
//        }
        return new ResultVO(ResultCode.ERROR);
    }
}
