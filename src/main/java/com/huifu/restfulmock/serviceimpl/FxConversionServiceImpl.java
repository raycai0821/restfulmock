package com.huifu.restfulmock.serviceimpl;

import com.huifu.restfulmock.dao.FxConversionDetailsDao;
import com.huifu.restfulmock.entity.BatchDetailsEntity;
import com.huifu.restfulmock.entity.ChannelDetailsEntity;
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
    private FxConversionDetailsDao channelDetailsDao;

    @Override
    public void addDetails(BatchDetailsEntity batchDetailsEntity) {

    }

    @Override
    public void delDetails(Integer id) {

    }

    @Override
    public void updateDetail(Integer id) {

    }

    @Override
    public ChannelDetailsEntity findDetail(Integer id) {
        return channelDetailsDao.getOne(id);
    }

    @Override
    public List<ChannelDetailsEntity> findAllDetails() {
        return null;
    }
}
