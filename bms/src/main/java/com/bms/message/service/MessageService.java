package com.bms.message.service;

import java.util.List;
import java.util.Map;

import com.bms.goods.dto.GoodsDTO;
import com.bms.message.dto.MessageDTO;

public interface MessageService {
	
//	public Map<String,List<GoodsDTO>> listSteadyGoods() throws Exception;
//	public Map<String,List<GoodsDTO>> listNewGoods() throws Exception;
//	public Map<String,List<GoodsDTO>> listBestGoods() throws Exception;
//	public Map<String,List<GoodsDTO>> listGoods() throws Exception;
//	public Map<String,Object> goodsDetail(String goodsId) throws Exception;
//	public List<String> keywordSearch(String keyword) throws Exception;
	public void insertNewMessage(MessageDTO mdto) throws Exception;
	public Map<String,List<MessageDTO>> getMessageList() throws Exception;
	public Map<String,List<MessageDTO>> selectOneMessage(String id) throws Exception;
	
}
