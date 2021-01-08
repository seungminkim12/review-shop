package com.reviewshop.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.reviewshop.domain.MemberVO;
import com.reviewshop.persistence.ReShopDAO;

@Service
public class ReShopServiceImpl implements ReShopService{

	@Inject
	private ReShopDAO dao;
	
	//회원가입
	@Override
	public void signup(MemberVO member)throws Exception {
		dao.signup(member);
	}
	
	
}
