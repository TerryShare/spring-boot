package com.liu.spring_boot_mybatis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liu.spring_boot_mybatis.bean.Userinfo;
import com.liu.spring_boot_mybatis.service.UserinfoService;

@Controller
public class UserinfoController {

	@Autowired
	private UserinfoService usService;

	//查询全部
	@RequestMapping(value="/Finduser")
	public String Finduser(Model model, Userinfo userinfo) {
		List<Userinfo> list = new ArrayList<>();
		list = usService.Finduser(userinfo);
		model.addAttribute("list", list);
		model.addAttribute("contens",usService.Finduser(userinfo));
		return "list";

	}


	@RequestMapping(value="getid")
	public String getid(Model model, int id) {
		Userinfo Userinfo = usService.getid(id);
		model.addAttribute("user",Userinfo);
		return "userEdit";
	}

	@RequestMapping(value="edit")
	public  String update(Userinfo user){
		this.usService.update(user);
		return "redirect:/Finduser";
	}

	@RequestMapping(value="delete")
	public  String delete(int id){
		this.usService.delete(id);
		return "redirect:/Finduser";
	}

	//增加跳转
	@RequestMapping(value="toAdd")
	public String  add()
	{
		return  "userAdd";
	}

	@RequestMapping(value="/insert")
	public String insert(Model model,Userinfo userinfo) {
		this.usService.insert(userinfo);
		return "redirect:/Finduser";
	}
}
