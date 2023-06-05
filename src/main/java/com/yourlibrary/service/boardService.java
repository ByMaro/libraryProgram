package com.yourlibrary.service;

import java.util.List;

import com.yourlibrary.domain.boardVO;

public interface boardService {
	public List<boardVO> boardSelectUserAll(String userid);
}
