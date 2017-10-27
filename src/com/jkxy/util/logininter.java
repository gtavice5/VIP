package com.jkxy.util;

import java.util.Map;

import com.jkxy.model.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class logininter extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Map session=(Map)arg0.getInvocationContext().get("session");
		User user=(User)session.get("user");
		if (user==null) {
			System.out.println("===============user不存在被拦截==========================");
			return Action.LOGIN;
		}
		return arg0.invoke();
	}
	
}
