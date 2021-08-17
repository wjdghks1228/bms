package com.bms.message.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.bms.goods.dto.GoodsDTO;
import com.bms.message.dto.MessageDTO;

public interface MessageDAO {
	
	public void insertNewMessage(MessageDTO mdto) throws DataAccessException;
	public List<MessageDTO> getMessageList() throws DataAccessException;
	public List<MessageDTO> selectOneMessage(String id) throws DataAccessException;

}
