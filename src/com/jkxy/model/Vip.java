package com.jkxy.model;

import java.sql.Date;
import java.util.Set;

public class Vip {

	private int vipId;
	private Date joinTime;
	private String name;
	private int age;
	private String profession;
	private Set<Consume> consumes;
	
	public Vip() {
		
	}

	public int getVipId() {
		return vipId;
	}

	public void setVipId(int vipId) {
		this.vipId = vipId;
	}

	public Date getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Set<Consume> getConsumes() {
		return consumes;
	}

	public void setConsumes(Set<Consume> consumes) {
		this.consumes = consumes;
	}
	
	
}
