package com.yourlibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yourlibrary.domain.boardVO;
import com.yourlibrary.mapper.boardMapper;

import lombok.Setter;

@Service
public class boardServiceImpl implements boardService {
	@Setter(onMethod_ = @Autowired)
	private boardMapper bmapper;
	
	@Override
	public List<boardVO> boardSelectUserAll(String userid) {
		// TODO Auto-generated method stub
		return bmapper.boardSelectUserAll(userid);
	}

}
