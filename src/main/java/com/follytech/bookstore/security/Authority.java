package com.follytech.bookstore.security;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority{
	
	private static final long serialVersionUID = 6171037820361325217L;
	private final String authority;

	
	public Authority(String authority) {
		this.authority = authority;
	}


	@Override
	public String getAuthority() {
		return authority;
	}

}
