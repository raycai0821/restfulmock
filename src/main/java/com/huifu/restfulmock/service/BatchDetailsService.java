package com.huifu.restfulmock.service;

import com.huifu.restfulmock.entity.BatchDetailsEntity;

import java.util.List;

public interface BatchDetailsService {

    public void addDetails(BatchDetailsEntity batchDetailsEntity);
    public void delDetails(Integer inquiry_id);
    public void updateDetail(Integer inquiry_id);
    public BatchDetailsEntity findDetail(Integer inquiry_id);
    public List<BatchDetailsEntity> findAllDetails();
}
