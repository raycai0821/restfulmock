package com.huifu.restfulmock.dao;

import com.huifu.restfulmock.entity.FxConversionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FxConversionDetailsDao extends JpaRepository<FxConversionEntity, Integer> {
}
