package com.yourlibrary.mapper;

import com.yourlibrary.domain.AuthVO;
import com.yourlibrary.domain.MemberVO;

public interface MemberMapper {
	public MemberVO read(String userid);
	public int join_member(MemberVO mvo);
	public int join_member_auth(AuthVO avo);
}
