package com.yourlibrary.mapper;

import java.util.List;

import com.yourlibrary.domain.boardVO;

public interface boardMapper {
	public List<boardVO> boardSelectUserAll(String userid);
}
