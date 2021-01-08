package com.reviewshop.service;

import com.reviewshop.domain.MemberVO;

public interface ReShopService {
	
	//회원가입
	public void signup(MemberVO member) throws Exception;
}
