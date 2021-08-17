package com.bms.goods.service;

import java.util.List;
import java.util.Map;

import com.bms.goods.dto.GoodsDTO;

public interface GoodsService {
	
	public Map<String,List<GoodsDTO>> listSteadyGoods() throws Exception;
	public Map<String,List<GoodsDTO>> listNewGoods() throws Exception;
	public Map<String,List<GoodsDTO>> listBestGoods() throws Exception;
	public Map<String,List<GoodsDTO>> listGoods() throws Exception;
	public Map<String,Object> goodsDetail(String goodsId) throws Exception;
	public List<String> keywordSearch(String keyword) throws Exception;
	public List<GoodsDTO> searchGoods(String searchWord) throws Exception;
	
}
