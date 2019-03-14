/**
 * 
 */
package cn.edu.neusoft.parttime.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.neusoft.parttime.model.FlyerManagement;
import cn.edu.neusoft.parttime.model.RepastManagement;
import cn.edu.neusoft.parttime.model.SupermarketManagement;
import cn.edu.neusoft.parttime.model.TutorManagement;
import cn.edu.neusoft.parttime.model.User;
import cn.edu.neusoft.parttime.model.dto.PageModel;
import cn.edu.neusoft.parttime.service.FlyerManagementService;
import cn.edu.neusoft.parttime.service.RepastManagementService;
import cn.edu.neusoft.parttime.service.SupermarketManagementService;
import cn.edu.neusoft.parttime.service.TutorManagementService;
import cn.edu.neusoft.parttime.service.UserService;
import cn.edu.neusoft.parttime.service.WebService;

/**
 *
 * cn.edu.neusoft.parttime.controller
 *
 */
@Controller
public class IndexController {
	@Autowired
	private RepastManagementService repastManagementService;
	@Autowired
	private TutorManagementService tutorManagementService;
	@Autowired
	private FlyerManagementService flyerManagementService;
	@Autowired
	private SupermarketManagementService supermarketManagementService;
	@Autowired
	private WebService webService;
	@Autowired
	private UserService userService;

	@RequestMapping({ "/index", "/" })
	public String index(HttpServletRequest request) {
		List<HashMap<String, Object>> selectTopAll = webService.selectTopAll(20);
		request.setAttribute("data", selectTopAll);
		return "index";
	}

	@RequestMapping("/repast")
	public String repast(HttpServletRequest request, @RequestParam(required = false) Integer page) {
		if (page == null) {
			page = 1;
		}
		PageHelper.startPage(page, 15);
		List<RepastManagement> repastManagements = repastManagementService.selectAll();
		PageInfo<RepastManagement> pageinfo = new PageInfo<RepastManagement>(repastManagements);
		PageModel pageModel = new PageModel(pageinfo.getTotal(), repastManagements);
		request.setAttribute("data", pageModel.get());
		request.setAttribute("current", page);
		return "repast";
	}

	@RequestMapping("/flyer")
	public String flyer(HttpServletRequest request, @RequestParam(required = false) Integer page) {
		if (page == null) {
			page = 1;
		}
		PageHelper.startPage(page, 15);
		List<FlyerManagement> selectAll = flyerManagementService.selectAll();
		PageInfo<FlyerManagement> pageinfo = new PageInfo<FlyerManagement>(selectAll);
		PageModel pageModel = new PageModel(pageinfo.getTotal(), selectAll);
		request.setAttribute("data", pageModel.get());
		request.setAttribute("current", page);
		return "flyer";
	}

	@RequestMapping("/supermarket")
	public String supermarket(HttpServletRequest request, @RequestParam(required = false) Integer page) {
		if (page == null) {
			page = 1;
		}
		PageHelper.startPage(page, 15);
		List<SupermarketManagement> selectAll = supermarketManagementService.selectAll();
		PageInfo<SupermarketManagement> pageinfo = new PageInfo<SupermarketManagement>(selectAll);
		PageModel pageModel = new PageModel(pageinfo.getTotal(), selectAll);
		request.setAttribute("data", pageModel.get());
		request.setAttribute("current", page);
		return "supermarket";
	}

	@RequestMapping("/tutor")
	public String tutor(HttpServletRequest request, @RequestParam(required = false) Integer page) {
		if (page == null) {
			page = 1;
		}
		PageHelper.startPage(page, 15);
		List<TutorManagement> selectAll = tutorManagementService.selectAll();
		PageInfo<TutorManagement> pageinfo = new PageInfo<TutorManagement>(selectAll);
		PageModel pageModel = new PageModel(pageinfo.getTotal(), selectAll);
		request.setAttribute("data", pageModel.get());
		request.setAttribute("current", page);
		return "tutor";
	}

	@RequestMapping("/job/{type}/{id}")
	public String detail(HttpServletRequest request, @PathVariable String type, @PathVariable Integer id) {
		JSONObject selectByIdAndType = webService.selectByIdAndType(type, id);
		for (String key : selectByIdAndType.keySet()) {
			request.setAttribute(key, selectByIdAndType.getString(key));
		}
		return "detail";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/loginRequest")
	public String loginRequest(String username, String password, HttpSession session, HttpServletRequest request) {
		User user = userService.login(username, password);
		if (user == null) {
			request.setAttribute("errMsg", "用户名或者密码错误");
		} else {
			session.setAttribute("username", user.getUsername());
			session.setAttribute("role", user.getRole());
			request.setAttribute("errMsg", null);
			if (user.getRole().equals("admin")) {
				return "redirect:admin/index";
			}
			return "redirect:index";
		}
		return "login";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session, HttpServletRequest request) {
		session.setAttribute("username", null);
		session.setAttribute("role",null);
		request.setAttribute("errMsg", null);
		return "redirect:index";
	}
}
