package com.huifu.restfulmock.service;

import com.huifu.restfulmock.entity.BatchDetailsEntity;
import com.huifu.restfulmock.entity.ChannelDetailsEntity;

import java.util.List;

public interface FxConversionService {

    void addDetails(BatchDetailsEntity batchDetailsEntity);

    void delDetails(Integer inquiry_id);

    void updateDetail(Integer inquiry_id);

    ChannelDetailsEntity findDetail(Integer inquiry_id);

    List<ChannelDetailsEntity> findAllDetails();

}
