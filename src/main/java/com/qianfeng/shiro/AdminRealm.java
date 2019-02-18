package com.qianfeng.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.qianfeng.pojo.User;


public class AdminRealm extends AuthorizingRealm{
	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//查询当前用户的权限
		//User user = (User)SecurityUtils.getSubject().getSession().getAttribute("admin");
		//设置权限
		//info.addStringPermission(null);
		 
		return null;
	}

	/**
	 * 登录
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		if (upToken.getUsername() != null) {
			return new SimpleAuthenticationInfo(upToken.getUsername(),upToken.getPassword(),getName());
		}
		return null;
	}


}
