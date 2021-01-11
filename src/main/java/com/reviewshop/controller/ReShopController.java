package com.reviewshop.controller;


import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public void getSignup() throws Exception{
		logger.info("get singup");
	}
	
	//회원가입 POST
	@RequestMapping(value="/signup",method = RequestMethod.POST)
	public String postSignup(MemberVO member) throws Exception{
		logger.info("POST singup");
		
		String inputPass = member.getUserPass();
		String pass = passEncoder.encode(inputPass);
		member.setUserPass(pass);
		
		service.signup(member);
		
		return "redirect:/";
				
		
	}
	
	//로그인 get
	@RequestMapping(value="/signin",method = RequestMethod.GET)
	public void getSignin() throws Exception {
		logger.info("get signin");
	}
	
	//로그인 POST
	@RequestMapping(value="/signin",method = RequestMethod.POST)
	public String postSignin(MemberVO member,HttpServletRequest req, RedirectAttributes rttr) throws Exception {
		logger.info("post signin");
		
		MemberVO login = service.signin(member);
		HttpSession session = req.getSession();
		
		boolean passMatch = passEncoder.matches(member.getUserPass(), login.getUserPass());
		
		if(login != null && passMatch) {
			session.setAttribute("member", login);
		} else {
			session.setAttribute("member",null);
			rttr.addFlashAttribute("msg", false);
			return "redirect:/member/signin";
		}
		return "redirect:/";
	}
	
	//로그아웃
	@RequestMapping(value="/signout",method = RequestMethod.GET)
	public String signout(HttpSession session) throws Exception {
		logger.info("get logout");
		
		service.signout(session);
		
		return "redirect:/";
	}
			
}


