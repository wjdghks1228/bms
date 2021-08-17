package com.bms.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.board.dao.BoardDAO;
import com.bms.board.dto.BoardDTO;

@Service("boardService") 
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List<BoardDTO> getBoardList() throws Exception {
		return boardDAO.selectAll();
	}

	@Override
	public void insertBoard(BoardDTO bdto) throws Exception {
		boardDAO.insert(bdto);
	}

	@Override
	public BoardDTO getOneBoard(int num) throws Exception {
		boardDAO.increaseReadCount(num);
		return boardDAO.selectOne(num);
	}

	@Override
	public boolean updateBoard(BoardDTO bdto) throws Exception {
		boolean isSucceed = false;
		
		if(boardDAO.validateUserCheck(bdto)!= null) {
			boardDAO.update(bdto);
			isSucceed = true;
		}
		return isSucceed;
	}

//	public boolean deleteBoard(BoardDTO bdto) throws Exception {
//		boolean isSucceed = false;
//		if(boardDAO.validateUserCheck(bdto)!=null) {
//			boardDAO.delete(bdto.getNum());
//			isSucceed = true;
//		}
//		return isSucceed;
//	}
	@Override
	public void deleteBoard(int num) throws Exception {
		boardDAO.delete(num);
	}
	
}
