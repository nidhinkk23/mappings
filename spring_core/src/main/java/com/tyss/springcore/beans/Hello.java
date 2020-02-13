package com.tyss.springcore.beans;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

public class Hello implements InitializingBean,DisposableBean {
	public Hello() {
		System.out.println("Hello object created");
	}
	
	public Hello(String message) {
		super();
		this.message = message;
	}
	@PostConstruct
	public void init() {
		System.out.println("init ()");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy ()");
	}
	private String message;
	private Map<Integer, String> map;
	private List<Integer> list;

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet ie init()");
	}
	
}
