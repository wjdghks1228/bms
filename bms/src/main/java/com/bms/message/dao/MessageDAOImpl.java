package com.bms.message.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.bms.goods.dto.GoodsDTO;
import com.bms.goods.dto.ImageFileDTO;
import com.bms.message.dto.MessageDTO;

@Repository("messageDAO")
public class MessageDAOImpl  implements MessageDAO{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<MessageDTO> selectOneMessage(String id) throws DataAccessException{
		return sqlSession.selectList("mapper.admin.message.selectOneMessage",id);
	}

	@Override
	public void insertNewMessage(MessageDTO mdto) throws DataAccessException {
		sqlSession.insert("mapper.admin.message.insertNewMessage", mdto);
	}

	@Override
	public List<MessageDTO> getMessageList() throws DataAccessException {
		return sqlSession.selectList("mapper.admin.message.getMessageList");
	}
	
}
