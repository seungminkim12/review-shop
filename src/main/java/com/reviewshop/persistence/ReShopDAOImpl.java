package com.reviewshop.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.reviewshop.domain.MemberVO;

@Repository
public class ReShopDAOImpl implements ReShopDAO {
	
	@Inject
	private SqlSession sql;
	
	//매퍼
	private static String namespace = "com.reviewshop.mappers.memberMapper";
	
	//회원가입
	@Override
	public void signup(MemberVO member) throws Exception {
		sql.insert(namespace + ".signup",member);
	}
	
	//로그인
	@Override
	public MemberVO signin(MemberVO member) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".signin",member); 
	}
	
	
	
}
