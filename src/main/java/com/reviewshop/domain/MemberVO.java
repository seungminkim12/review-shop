package com.reviewshop.domain;

import java.util.Date;

public class MemberVO {
	
	/*create table TBL_MEMBER (
		    userId varchar2(50) not null,
		    userPass varchar2(100) not null,
		    userName varchar2(30) not null,
		    userhPhone varchar2(20) not null,
		    userAddr1 varchar2(500) null,
		    userAddr2 varchar2(500) null,
		    userAddr3 varchar2(500) null,
		    regiDate date default sysdate,
		    verify number default 0,
		    primary key(userId)
		);*/
	
	private String userId;
	private String userPass;
	private String userName;
	private String userPhone;
	private String userAdd1;
	private String userAddr2;
	private String userAddr3;
	private Date regDate;
	private int verify;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAdd1() {
		return userAdd1;
	}
	public void setUserAdd1(String userAdd1) {
		this.userAdd1 = userAdd1;
	}
	public String getUserAddr2() {
		return userAddr2;
	}
	public void setUserAddr2(String userAddr2) {
		this.userAddr2 = userAddr2;
	}
	public String getUserAddr3() {
		return userAddr3;
	}
	public void setUserAddr3(String userAddr3) {
		this.userAddr3 = userAddr3;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getVerify() {
		return verify;
	}
	public void setVerify(int verify) {
		this.verify = verify;
	}
	
}
