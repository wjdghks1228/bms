package com.bms.board.dao;

import java.util.List;

import com.bms.board.dto.BoardDTO;

public interface BoardDAO {
	//GET LIST FROM MAPPER
	public List<BoardDTO> selectAll() throws Exception;
	public void insert(BoardDTO bdto) throws Exception;
	public BoardDTO selectOne(int num) throws Exception;
	public void increaseReadCount(int num) throws Exception;
	public BoardDTO validateUserCheck(BoardDTO bdto) throws Exception;
	public void update(BoardDTO bdto) throws Exception;
	public void delete(int num) throws Exception;
}
