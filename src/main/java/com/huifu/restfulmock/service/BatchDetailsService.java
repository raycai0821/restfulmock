package com.huifu.restfulmock.service;

import com.huifu.restfulmock.entity.BatchDetailsEntity;

import java.util.List;

public interface BatchDetailsService {

    void addDetails(BatchDetailsEntity batchDetailsEntity);
    void delDetails(Integer inquiry_id);
    void updateDetail(Integer inquiry_id);
    BatchDetailsEntity findDetail(Integer inquiry_id);
    List<BatchDetailsEntity> findAllDetails();
}
