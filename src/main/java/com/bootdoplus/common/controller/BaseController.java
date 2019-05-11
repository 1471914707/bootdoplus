package com.bootdoplus.common.controller;

import org.springframework.stereotype.Controller;
import com.bootdoplus.common.utils.ShiroUtils;
import com.bootdoplus.system.domain.UserDO;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}