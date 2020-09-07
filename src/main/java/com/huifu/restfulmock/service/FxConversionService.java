package com.huifu.restfulmock.service;

import com.huifu.restfulmock.entity.BatchDetailsEntity;
import com.huifu.restfulmock.entity.FxConversionEntity;

import java.util.List;

public interface FxConversionService {

    void addDetails(FxConversionEntity fxConversionEntity);

    void delDetails(Integer inquiry_id);

    void updateDetail(Integer inquiry_id);

    FxConversionEntity findDetail(Integer inquiry_id);

    List<FxConversionEntity> findAllDetails();

}
