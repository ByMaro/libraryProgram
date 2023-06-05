package com.yourlibrary.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.yourlibrary.domain.MemberVO;
import com.yourlibrary.mapper.MemberMapper;
import com.yourlibrary.security.domain.CustomUser;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailService implements UserDetailsService {
	@Setter(onMethod_ = @Autowired)
	private MemberMapper mapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		log.warn("load user by username : "+username);
		
		MemberVO vo = mapper.read(username);
	
		log.warn("queried by member mapper : "+vo);
		
		return vo == null? null:new CustomUser(vo);
	}

}
