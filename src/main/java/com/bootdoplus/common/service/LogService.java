package com.bootdoplus.common.service;

import org.springframework.stereotype.Service;

import com.bootdoplus.common.domain.LogDO;
import com.bootdoplus.common.domain.PageDO;
import com.bootdoplus.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
