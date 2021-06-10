package com.zhidisoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhidisoft.entity.CrmBusiness;
import com.zhidisoft.mapper.CrmBusinessMapper;
import com.zhidisoft.vo.CrmBusinessVo;

@RequestMapping("/bus")
@Controller
public class CrmBusinessController {

	@Autowired
	CrmBusinessMapper crmBusinessMapper;
	
	@GetMapping("update/{id}")
	public ModelAndView updateUI(@PathVariable("id") Long id){
		ModelAndView mav = new ModelAndView("bus/form","user",crmBusinessMapper.selectByPrimaryKey(id));
		mav.addObject("method","update");
		return mav;
	}
	
	@PostMapping("update/{id}")
	public ModelAndView update(@PathVariable("id") Long id,CrmBusinessVo vo){
		CrmBusiness cb = vo;
		crmBusinessMapper.updateByPrimaryKeySelective(cb);
		return new ModelAndView("redirect:/bus");
	}
	
}
