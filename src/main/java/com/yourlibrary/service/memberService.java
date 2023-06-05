package com.yourlibrary.service;

import com.yourlibrary.domain.AuthVO;
import com.yourlibrary.domain.MemberVO;

public interface memberService {
	public void joinMember(MemberVO mvo, AuthVO avo);
}
