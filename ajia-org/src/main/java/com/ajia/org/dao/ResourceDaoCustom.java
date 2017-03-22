package com.ajia.org.dao;

import java.util.List;
import java.util.Map;

import com.ajia.org.entity.Resource;


public interface ResourceDaoCustom {

	public List<Resource> findMenuResource(Map<String, Object> params);
	
}
