package com.acrabsoft.web.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Value("${user.userName}")
	private String userName;
	@Value("${user.sex}")
	private Integer sex;
	@Value("${user.age}")
	private Integer age;
	@RequestMapping("/user")
	public String getUser() {
		return this.userName + " is " + this.sex + " age:" + this.age;
	}
}
