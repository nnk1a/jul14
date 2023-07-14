package com.malrang.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	
	// 1. boardlist 출력 화면 = board.jsp
	@GetMapping("/board")
	public String board(Model model) {
		//데이터 붙이기
		model.addAttribute("name", "1234");//name, value
		
		List<BoardDTO> list = service.boardList();
		if (list.size() > 1) {
			model.addAttribute("list", list);
			return "board";
		} else {
			return "redirect:/"; //리다이렉트(다시 컨트롤러 지나감)
		}
	}
	// 2. detail 상세보기 화면 = detail.jsp
	@GetMapping("/detail")
	public String detail(HttpServletRequest request) {
		String bno = request.getParameter("bno");
		try {
			int no = Integer.parseInt(bno);
			System.out.println("숫자입니다.");
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다.");
		}		
		/*if () {
			int no = Integer.parseInt(request.getParameter("bno"));
		}*/
		return "detail";
	}
}
