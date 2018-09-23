package com.resume.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ResumeController 
{
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public ModelAndView index()
	{
		ModelAndView indexView = new ModelAndView();
			indexView.setViewName("index");
		return indexView;
	}
}
