/**
 * 
 */
package cn.edu.neusoft.parttime.model.dto;

import java.util.HashMap;

/**
 *
 *
 */
public class PageModel {
	private HashMap<String, Object> maps = new HashMap<String, Object>();
	
	public PageModel(Long total,Iterable<?> rows) {
		maps.put("total", total);
		maps.put("rows", rows);
	}
	
	public PageModel() {
		
	}
	
	public void setTotal(long total) {
		maps.put("total", total);
	}
	
	public void setRows(Iterable<?> rows) {
		maps.put("rows", rows);
	}
	
	public HashMap<String, Object> get() {
		return maps;
	}
}
