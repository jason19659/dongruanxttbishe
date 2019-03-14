/**
 * 
 */
package cn.edu.neusoft.parttime.dao;

import java.util.HashMap;
import java.util.List;

/**
 * @author <a href="mailto:jason19659@163.com">jason19659</a>
 *
 * cn.edu.neusoft.parttime.dao
 *
 * 2019年3月12日
 */
public interface WebMapper {
	List<HashMap<String, Object>> selectTopAll(int number);
}
