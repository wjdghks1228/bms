package com.bms.main;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bms.common.util.CommonUtil;
import com.bms.goods.dto.GoodsDTO;
import com.bms.goods.service.GoodsService;

@Controller("mainController")
@EnableAspectJAutoProxy
public class MainController {
	
	@Autowired
	private GoodsService goodsService;

	@RequestMapping(value= "/")
	public ModelAndView home() throws Exception{
		return new ModelAndView("redirect:/main/main.do");
	}
	
	
	@RequestMapping(value= "/main/main.do")
	public ModelAndView main(HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("/main/main");
		
		HttpSession session = request.getSession();
		session.setAttribute("side_menu", "user");
		Map<String,List<GoodsDTO>> goodsMap = goodsService.listGoods();
		mv.addObject("goodsMap", goodsMap);
		
		return mv;
		
	}
	
	@RequestMapping(value= "/member/bestGood.do")
	public ModelAndView bestSeller(HttpServletRequest request) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/member/bestGood");
		
		HttpSession session = request.getSession();
		session.setAttribute("side_menu", "user");
		
		Map<String,List<GoodsDTO>> goodsMap = goodsService.listBestGoods();
		mv.addObject("goodsMap", goodsMap);
		
		return mv;
		
	}
	@RequestMapping(value= "/member/steadyGood.do")
	public ModelAndView steadySeller(HttpServletRequest request) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/member/steadyGood");
		
		HttpSession session = request.getSession();
		session.setAttribute("side_menu", "user");
		
		Map<String,List<GoodsDTO>> goodsMap = goodsService.listSteadyGoods();
		mv.addObject("goodsMap", goodsMap);
		
		return mv;
		
	}
	@RequestMapping(value= "/member/newGood.do")
	public ModelAndView newBook(HttpServletRequest request) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/member/newGood");
		
		HttpSession session = request.getSession();
		session.setAttribute("side_menu", "user");
		
		Map<String,List<GoodsDTO>> goodsMap = goodsService.listNewGoods();
		mv.addObject("goodsMap", goodsMap);
		
		return mv;
		
	}
}
