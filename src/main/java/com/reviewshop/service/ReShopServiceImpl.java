package com.reviewshop.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

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
	
	//로그인
	@Override
	public MemberVO signin(MemberVO member) throws Exception {
		// TODO Auto-generated method stub
		return dao.signin(member);
	}
	
	//로그아웃
	@Override
	public void signout(HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		session.invalidate();
	}
	
	
	
	
}
