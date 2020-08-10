package com.huifu.restfulmock.serviceimpl;

import com.huifu.restfulmock.dao.BatchDetailsDao;
import com.huifu.restfulmock.entity.BatchDetailsEntity;
import com.huifu.restfulmock.service.BatchDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchDetailsServiceImpl implements BatchDetailsService {

    @Autowired
    private BatchDetailsDao batchDetailsDao;

    @Override
    public void addDetails(BatchDetailsEntity batchDetailsEntity) {

    }

    @Override
    public void delDetails(Integer inquiry_id) {

    }

    @Override
    public void updateDetail(Integer inquiry_id) {

    }

    @Override
    public BatchDetailsEntity findDetail(Integer inquiry_id) {
        return batchDetailsDao.getOne(inquiry_id);
    }

    @Override
    public List<BatchDetailsEntity> findAllDetails() {
        return batchDetailsDao.findAll();
    }
}
