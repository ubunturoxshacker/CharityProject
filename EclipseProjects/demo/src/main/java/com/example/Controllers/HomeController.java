package com.example.Controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Service.MongoDBService;


@Controller
public class HomeController {
   
	private MongoDBService mongoservice;
	private String view;
	@RequestMapping(value="/")
	public String welcome(Model m){
		m.addAttribute("msg", "Welcome!");
		return "login";
		
	}
	@RequestMapping(value="/userWelcome", method = RequestMethod.POST)
	public String welcomeUser(HttpServletRequest req){
		
		if(mongoservice.check(req.getParameter("Username"),req.getParameter("Password"))==true){
			view="userWelcome";
			
		}
		else
		{
			view="error";
		 }
		return view;
	}
}
