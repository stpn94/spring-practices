package com.douzone.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.guestbook.repository.GuestBookRepository;
import com.douzone.guestbook.vo.GuestBookVo;

/**
 * Servlet implementation class GuestBookController
 */
@Controller
public class GuestBookController {

	@Autowired
	GuestBookRepository guestBookRepository;

	@RequestMapping("")
	public String index(Model model) {
		List<GuestBookVo> list = guestBookRepository.findAll();
		model.addAttribute("list", list);
		return "/WEB-INF/views/index.jsp";
	}

	@RequestMapping("add")
	public String add(GuestBookVo vo) {

		guestBookRepository.insert(vo);
		return "redirect:/";
	}

	@RequestMapping(value = "delete/{no}", method = RequestMethod.GET)
	public String delete(@PathVariable("no") int no, Model model) {
		model.addAttribute("no", no);
		return "/WEB-INF/views/deleteform.jsp";
	}

	@RequestMapping(value = "delete/{no}", method = RequestMethod.POST)
	public String delete(@PathVariable("no") int no, String password) {

		if (guestBookRepository.Delete(no, password)) {
			return "redirect:/";
		} else {
			return "/WEB-INF/views/delete/{no}";
		}
	}

}