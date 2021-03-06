package com.reviewshop.persistence;

import com.reviewshop.domain.MemberVO;

public interface ReShopDAO {

	//회원가입
	public void signup(MemberVO member) throws Exception;
	
	//로그인
	public MemberVO signin(MemberVO member) throws Exception;
	
}
