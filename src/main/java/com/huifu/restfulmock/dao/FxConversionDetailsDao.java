package com.huifu.restfulmock.dao;

import com.huifu.restfulmock.entity.BatchDetailsEntity;
import com.huifu.restfulmock.entity.ChannelDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FxConversionDetailsDao extends JpaRepository<ChannelDetailsEntity, Integer> {
}
