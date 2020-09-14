package com.huifu.restfulmock.serviceimpl;

import com.huifu.restfulmock.dao.FxConversionDetailsDao;
import com.huifu.restfulmock.entity.FxConversionEntity;
import com.huifu.restfulmock.service.FxConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leifeng.cai
 **/
@Service
public class FxConversionServiceImpl implements FxConversionService {

    @Autowired
    private FxConversionDetailsDao fxConversionDetailsDao;

    @Override
    public String addDetails(FxConversionEntity fxConversionEntity) {
        fxConversionDetailsDao.save(fxConversionEntity);
        return "success";
    }

    @Override
    public void delDetails(Integer id) {

    }

    @Override
    public void updateDetail(Integer id) {

    }

    @Override
    public FxConversionEntity findDetail(Integer id) {
        return fxConversionDetailsDao.getOne(id);
    }

    @Override
    public List<FxConversionEntity> findAllDetails() {
        return null;
    }
}
