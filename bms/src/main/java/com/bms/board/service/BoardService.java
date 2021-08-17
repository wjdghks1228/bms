package com.bms.board.service;

import java.util.List;

import com.bms.board.dto.BoardDTO;

public interface BoardService {
	public List<BoardDTO> getBoardList() throws Exception;
	public void insertBoard(BoardDTO bdto) throws Exception;
	public BoardDTO getOneBoard(int num) throws Exception;
	public boolean updateBoard(BoardDTO bdto) throws Exception;
//	public boolean deleteBoard(BoardDTO bdto) throws Exception;
	public void deleteBoard(int num) throws Exception;
	
}
