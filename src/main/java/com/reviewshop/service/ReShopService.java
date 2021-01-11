package com.reviewshop.service;

import javax.servlet.http.HttpSession;

import com.reviewshop.domain.MemberVO;

public interface ReShopService {
	
	//회원가입
	public void signup(MemberVO member) throws Exception;
	
	//로그인
	public MemberVO signin(MemberVO member) throws Exception;
	
	//로그아웃
	public void signout(HttpSession session) throws Exception;
}
