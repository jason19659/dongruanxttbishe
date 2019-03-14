/**
 * 
 */
package cn.edu.neusoft.parttime.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.edu.neusoft.parttime.dao.WebMapper;
import cn.edu.neusoft.parttime.service.FlyerManagementService;
import cn.edu.neusoft.parttime.service.RepastManagementService;
import cn.edu.neusoft.parttime.service.SupermarketManagementService;
import cn.edu.neusoft.parttime.service.TutorManagementService;
import cn.edu.neusoft.parttime.service.WebService;

/**
 *
 * cn.edu.neusoft.parttime.service.impl
 *
 */
@Service
@Transactional
public class WebServiceImpl implements WebService{
	@Autowired
	private WebMapper webMapper	;
	@Autowired
	private RepastManagementService repastManagementService;
	@Autowired
	private TutorManagementService tutorManagementService;
	@Autowired
	private FlyerManagementService flyerManagementService;
	@Autowired
	private SupermarketManagementService  supermarketManagementService;
	/* 
	 * @see cn.edu.neusoft.parttime.service.webService#selectTopAll(int)
	 */
	@Override
	public List<HashMap<String, Object>> selectTopAll(int number) {
		return webMapper.selectTopAll(number);
	}
	/* 
	 * @see cn.edu.neusoft.parttime.service.WebService#selectByIdAndType(java.lang.String, java.lang.String)
	 */
	@Override
	public JSONObject selectByIdAndType(String type, Integer id) {
		JSONObject jsonObject = null;
		if ("repast".equals(type)) {
			jsonObject = JSON.parseObject(JSON.toJSONString(repastManagementService.selectByPrimaryKey(id)));
			jsonObject.put("ctype", "餐饮兼职");
		} else if ("tutor".equals(type)) {
			jsonObject = JSON.parseObject(JSON.toJSONString(tutorManagementService.selectByPrimaryKey(id)));
			jsonObject.put("ctype", "家教兼职");
		} else if ("supermarket".equals(type)) {
			jsonObject = JSON.parseObject(JSON.toJSONString(supermarketManagementService.selectByPrimaryKey(id)));
			jsonObject.put("ctype", "超市兼职");
		} else if ("flyer".equals(type)) {
			jsonObject = JSON.parseObject(JSON.toJSONString(flyerManagementService.selectByPrimaryKey(id)));
			jsonObject.put("ctype", "传单兼职");
		} 
		return jsonObject;
	}

}
