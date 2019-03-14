/**
 * 
 */
package cn.edu.neusoft.parttime.service;

import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * cn.edu.neusoft.parttime.service
 *
 */
public interface WebService {
	List<HashMap<String, Object>> selectTopAll(int number);
	JSONObject selectByIdAndType(String type,Integer id);
}
