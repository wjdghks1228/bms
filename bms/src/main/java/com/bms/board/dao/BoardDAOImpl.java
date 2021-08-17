package com.bms.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bms.board.dto.BoardDTO;

@Repository("boardDao")
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<BoardDTO> selectAll() throws Exception {
		return sqlSession.selectList("com.bms.mapper.BoardMapper.getAllBoard");
	}


	@Override
	public void insert(BoardDTO bdto) throws Exception {
		sqlSession.insert("com.bms.mapper.BoardMapper.insertBoard", bdto);
	}


	@Override
	public BoardDTO selectOne(int num) throws Exception {
		return sqlSession.selectOne("com.bms.mapper.BoardMapper.getOneBoard", num);
	}


	@Override
	public void increaseReadCount(int num) throws Exception {
		sqlSession.update("com.bms.mapper.BoardMapper.increaseReadCount", num);
	}


	@Override
	public BoardDTO validateUserCheck(BoardDTO bdto) throws Exception {
		return sqlSession.selectOne("com.bms.mapper.BoardMapper.validateUserCheck", bdto);
	}


	@Override
	public void update(BoardDTO bdto) throws Exception {
		sqlSession.update("com.bms.mapper.BoardMapper.updateBoard", bdto);
	}


	@Override
	public void delete(int num) throws Exception {
		sqlSession.delete("com.bms.mapper.BoardMapper.deleteBoard", num);
	}


}
