/**
 * 
 */
package cn.edu.neusoft.parttime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * cn.edu.neusoft.parttime.controller
 *
 */
@RequestMapping("/admin")
@Controller
public class AdminController {
	
	@RequestMapping("/index")
	public String index() {
		return "admin/adminIndex";
	}
	
	@RequestMapping("/repastAdminFront")
	public String repastAdminFront() {
		return "admin/repastAdmin";
	}
	
	
	@RequestMapping("/tutorAdminFront")
	public String tutorAdminFront() {
		return "admin/tutorAdmin";
	}
	@RequestMapping("/supermarketAdminFront")
	public String supermarketAdminFront() {
		return "admin/supermarketAdmin";
	}
	@RequestMapping("/flyerAdminFront")
	public String flyerAdminFront() {
		return "admin/flyerAdmin";
	}
	@RequestMapping("/userAdminFront")
	public String userAdminFront() {
		return "admin/userAdmin";
	}
}
