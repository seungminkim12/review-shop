package com.reviewshop.controller;


import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.reviewshop.domain.MemberVO;
import com.reviewshop.service.ReShopService;

@Controller
@RequestMapping("/member/*")
public class ReShopController {
	/*
	 * private static final Logger Logger =
	 * LoggerFactory.getLogger(ReShopController.class);
	 */
	
	private static final Logger logger = LoggerFactory.getLogger(ReShopController.class);
	
	@Inject
	ReShopService service;
	
	@Autowired
	BCryptPasswordEncoder passEncoder;
	
	@RequestMapping(value="/signup",method = RequestMethod.GET)
	public void signup() throws Exception{
		logger.info("get singup");
	}
	
	//회원가입 POST
	@RequestMapping(value="/signup",method = RequestMethod.POST)
	public String signup(MemberVO member) throws Exception{
		logger.info("POST singup");
		
		String inputPass = member.getUserPass();
		String pass = passEncoder.encode(inputPass);
		member.setUserPass(pass);
		
		service.signup(member);
		
		return "redirect:/";
				
		
	}
	
	
			
}
