package com.ajia.org.dao;


import java.util.List;
import java.util.Map;

import com.ajia.common.entity.PageModel;
import com.ajia.org.dto.UserQueryDTO;
import com.ajia.org.entity.User;

public interface SystemUserDao {
	
	public List<User> findUsers(Map<String, Object> params);
	
	/**
	 * 根据用户信息查询分页信息
	 * @param userQueryDTO
	 * @return
	 */
	PageModel<User> queryUserPage(UserQueryDTO userQueryDTO);
	
}
