package com.bms.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bms.board.dto.BoardDTO;
import com.bms.board.service.BoardService;
import com.bms.member.dto.MemberDTO;

@Controller("boardController")
@RequestMapping("/board")// 컨트롤러임을 명시 (controller bean에 등록시킴)
public class BoardController {

	@Autowired							// DI(의존성 주입) : BoardService 객체를 스프링에서 생성하여 주입시킴
	private BoardService boardService;  // Service 로직을 호출하기 위한 객체 생성
	
	// value : url 주소를 명시
	// method : 요청타입을 명시
//	@RequestMapping(value="/boardWrite.do" , method=RequestMethod.GET)
//	public String boardWrite() {
//		return "/board/bWrite"; // servet-context.xml에 명시된 대로 포워딩할 jsp파일을 작성해 준다.
//	}
//	
//	
//	@RequestMapping(value="/boardWrite.do" , method=RequestMethod.POST)
//	public String boardWrite(BoardDTO bdto) throws Exception {
//		boardService.insertBoard(bdto);
//		return "/board/bList";
//	}
	
	@RequestMapping(value = "/boardWrite" , method = RequestMethod.GET)
	public String boardWrite() throws Exception{
		return "/board/bWrite";
	}
	
	@RequestMapping(value = "/boardWrite" , method = RequestMethod.POST)
	public String boardWrite(BoardDTO bdto) throws Exception{
		boardService.insertBoard(bdto);
		return "redirect:/board/boardList.do";	
	}
	
//	public String addMember(@ModelAttribute("boardDTO") BoardDTO bdto,
//            HttpServletRequest request, HttpServletResponse response) throws Exception {
//		response.setContentType("text/html; charset=UTF-8");
//		request.setCharacterEncoding("utf-8");
//		
//		boardService.insertBoard(bdto);
//		return "/board/bList";
//	}
	
	
	@RequestMapping (value = "/main.do")
	public String main() throws Exception{
		return "/board/main";
	}
	
	
	@RequestMapping(value="/boardList.do")
	public String boardList(Model model) throws Exception {
		
		List<BoardDTO> boardList = boardService.getBoardList();
		
		// 메서드의 매개변수에 Model 인터페이스를 선언하고
		// model.addAttribute(키,벨류) 형태로 데이터를 view로 전송한다.
		model.addAttribute("boardList" , boardList);
		return "/board/bList";
	}	
	
	@RequestMapping(value="/boardInfo.do")
	public String boardInfo(@RequestParam("num") int num , Model model) throws Exception{
		
		BoardDTO bdto = boardService.getOneBoard(num);
		
		model.addAttribute("bdto" , bdto);
		return "/board/bInfo";
	
	}
	@RequestMapping(value="/boardDelete.do")
	public String boardDelete(@RequestParam("num") int num ) throws Exception{
		boardService.deleteBoard(num);
		return "/board/main";
	}
	
	
	
	@RequestMapping(value="/boardFormUpdate.do", method=RequestMethod.GET)
	public String boardUpdate(@RequestParam("num") int num, Model model ) throws Exception{
		BoardDTO bdto = boardService.getOneBoard(num);
		model.addAttribute("bdto", bdto);
		return "/board/bUpdate";
	}
	
	@RequestMapping(value="/boardUpdate.do", method=RequestMethod.POST)
	public String boardUpdate(@RequestParam("bdto") BoardDTO bdto) throws Exception{
		boardService.updateBoard(bdto);
		return "/board/bList";
	}
	
	
	
	
	
	
}


