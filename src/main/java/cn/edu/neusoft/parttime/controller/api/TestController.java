/**
 * 
 */
package cn.edu.neusoft.parttime.controller.api;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.neusoft.parttime.service.FlyerManagementService;
import cn.edu.neusoft.parttime.service.RepastManagementService;
import cn.edu.neusoft.parttime.service.SupermarketManagementService;
import cn.edu.neusoft.parttime.service.TutorManagementService;
import cn.edu.neusoft.parttime.service.WebService;

/**
 *
 * cn.edu.neusoft.parttime.controller.api
 *	
 * 2019年3月12日
 */

@Controller
public class TestController {
	@Autowired
	private RepastManagementService repastManagementService;
	@Autowired
	private TutorManagementService tutorManagementService;
	@Autowired
	private FlyerManagementService flyerManagementService;
	@Autowired
	private SupermarketManagementService  supermarketManagementService;
	@Autowired
	private WebService  webService;
	
	@RequestMapping("/test")
	@ResponseBody
	public TreeMap<String, Object> test() {
		TreeMap<String, Object> maps = new TreeMap<>();
		maps.put("1",repastManagementService.selectLatest(5));
		maps.put("2",tutorManagementService.selectLatest(5));
		maps.put("3",flyerManagementService.selectLatest(5));
		maps.put("4",supermarketManagementService.selectLatest(5));
		return maps;
	}
	
	@RequestMapping("/test2")
	@ResponseBody
	public List<HashMap<String, Object>> test2() {
		List<HashMap<String, Object>> selectTopAll = webService.selectTopAll(20);
		return selectTopAll;
	}
}
