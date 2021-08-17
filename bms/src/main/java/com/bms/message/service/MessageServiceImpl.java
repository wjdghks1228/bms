package com.bms.message.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bms.goods.dao.GoodsDAO;
import com.bms.goods.dto.GoodsDTO;
import com.bms.goods.dto.ImageFileDTO;
import com.bms.message.dao.MessageDAO;
import com.bms.message.dto.MessageDTO;

@Service("messageService")
@Transactional(propagation=Propagation.REQUIRED)
public class MessageServiceImpl implements MessageService{
	
	@Autowired
	private MessageDAO messageDAO;

	@Override
	public void insertNewMessage(MessageDTO mdto) throws Exception {
		messageDAO.insertNewMessage(mdto);
	}

	@Override
	public Map<String, List<MessageDTO>> getMessageList() throws Exception {
		Map<String,List<MessageDTO>> messageMap = new HashMap<String,List<MessageDTO>>();
		messageMap.put("messageList", messageDAO.getMessageList());
		return messageMap;
	}

	@Override
	public Map<String, List<MessageDTO>> selectOneMessage(String id) throws Exception {
		Map<String,List<MessageDTO>> messageOne = new HashMap<String,List<MessageDTO>>();
		messageOne.put("messageOne", messageDAO.selectOneMessage(id));
		return null;
	}


	
	
}
