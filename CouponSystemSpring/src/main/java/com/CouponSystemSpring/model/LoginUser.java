package com.CouponSystemSpring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUser {
	
	private String username;
	private String password;
	private String clientType;
	
	

}