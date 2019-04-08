package com.zaver.dubbo.api.model;

import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String userName;
	private String passWord;
	private String nickName;
	private Long createTime;

	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getPassWord(){
		return passWord;
	}
	public void setPassWord(String passWord){
		this.passWord = passWord;
	}
	public String getNickName(){
		return nickName;
	}
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
	public Long getCreateTime(){
		return createTime;
	}
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}
}