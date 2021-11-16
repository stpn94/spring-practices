package com.douzone.emaillist.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.emaillist.repository.EmaillistRepository;
import com.douzone.emaillist.vo.EmaillistVo;

@Controller
public class EmaillistController {

	@Autowired
	private EmaillistRepository emaillistRepository;
	
	@RequestMapping("")
	public String index(Model model) {
		
		List<EmaillistVo> list = emaillistRepository.findAll();	
		model.addAttribute("list", list);
		  return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping("/form")
	public String form() {
		return "/WEB-INF/views/form.jsp";
	}
	
	@RequestMapping(value ="/add"  , method = RequestMethod.POST )
	public ResponseEntity<String> add(HttpServletRequest request ,EmaillistVo vo)  {
		String categoryName ="ca";
		String categoryNameCheck= "ca";
		
		if(categoryName == categoryNameCheck ) {
			return ResponseEntity.ok("<script>alert('경고');</script>");
		}

	    emaillistRepository.insert(vo);
	    
		return ResponseEntity.ok("<script>alert('경고');</script>");
		
	}
	
	

}
