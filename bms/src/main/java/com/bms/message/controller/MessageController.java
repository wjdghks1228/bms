package com.bms.message.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bms.goods.dto.GoodsDTO;
import com.bms.message.dto.MessageDTO;
import com.bms.message.service.MessageService;


@Controller("messageController")
@RequestMapping(value="/message")
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping(value= "/message/getMessageList.do")
	public String getMessageList(Model model) throws Exception{
		Map<String, List<MessageDTO>> messageList = messageService.getMessageList();
		model.addAttribute("messageList", messageList);
		return "/message/mList";
		
	}
	
//	@RequestMapping(value= "/message/getMessageList.do")
//	public ModelAndView getMessageList(HttpServletRequest request) throws Exception{
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("/message/messageList");
//		
//		HttpSession session = request.getSession();
//		session.setAttribute("side_menu", "user");
//		
//		Map<String,List<MessageDTO>> messageMap = messageService.getMessageList();
//		mv.addObject("messageMap", messageMap);
//		
//		return mv;
//		
//	}
	
	@RequestMapping(value="/message/selectOneMessage.do")
	public ModelAndView selectOneMessage(@RequestParam("id") String id)  throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/message/selectOneMessage");
		mv.addObject("id" , messageService.selectOneMessage(id));
		
		return mv;
		
	}
	
//	@RequestMapping(value="/goodsDetail.do" ,method = RequestMethod.GET)
//	public ModelAndView goodsDetail(@RequestParam("goodsId") String goodsId) throws Exception {
//		
//		Map<String,Object> goodsMap = goodsService.goodsDetail(goodsId);
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("/goods/goodsDetail");
//		mv.addObject("goodsMap", goodsMap);
//		
//		return mv;
//		
//	}
//	
//	
//	
//	@RequestMapping(value="/searchGoods.do" ,method = RequestMethod.GET)
//	public ModelAndView searchGoods(@RequestParam("searchWord") String searchWord) throws Exception{
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("/goods/searchGoods");
//		mv.addObject("goodsList", goodsService.searchGoods(searchWord));
//		
//		return mv;
//		
//	}
	
}
