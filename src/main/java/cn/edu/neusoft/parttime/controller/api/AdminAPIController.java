/**
 * 
 */
package cn.edu.neusoft.parttime.controller.api;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.neusoft.parttime.model.FlyerManagement;
import cn.edu.neusoft.parttime.model.RepastManagement;
import cn.edu.neusoft.parttime.model.SupermarketManagement;
import cn.edu.neusoft.parttime.model.TutorManagement;
import cn.edu.neusoft.parttime.model.User;
import cn.edu.neusoft.parttime.model.dto.PageModel;
import cn.edu.neusoft.parttime.model.dto.Status;
import cn.edu.neusoft.parttime.service.FlyerManagementService;
import cn.edu.neusoft.parttime.service.RepastManagementService;
import cn.edu.neusoft.parttime.service.SupermarketManagementService;
import cn.edu.neusoft.parttime.service.TutorManagementService;
import cn.edu.neusoft.parttime.service.UserService;

/**
 * @author <a href="mailto:jason19659@163.com">jason19659</a>
 *
 *         cn.edu.neusoft.parttime.controller
 *
 *         2019年3月7日
 */
@RequestMapping("/admin")
@Controller
public class AdminAPIController extends APIExceptionHandlerController {

	@Autowired
	private RepastManagementService repastManagementService;
	@Autowired
	private TutorManagementService tutorManagementService;
	@Autowired
	private FlyerManagementService flyerManagementService;
	@Autowired
	private SupermarketManagementService  supermarketManagementService;
	@Autowired
	private UserService  userService;

	@RequestMapping("/saveOrEditRepast")
	@ResponseBody
	public Status saveOrEditRepast(RepastManagement repastManagement) {
		
		if (repastManagement.getId() != null) {
			repastManagementService.updateByPrimaryKeySelective(repastManagement);
		} else {
			repastManagement.setPubDate(new Date());
			repastManagementService.insert(repastManagement);
		}

		return Status.SUCCESSED;
	}

	@RequestMapping("/getAllRepast")
	@ResponseBody
	public Map<String, Object> getAllRepast(@RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer rows) {
		if (page != null && rows != null) {
			PageHelper.startPage(page, rows);
		}
		List<RepastManagement> repastManagements = repastManagementService.selectAll();
		PageInfo<RepastManagement> pageinfo = new PageInfo<RepastManagement>(repastManagements);
		PageModel pageModel = new PageModel(pageinfo.getTotal(), repastManagements);
		return pageModel.get();
	}

	@RequestMapping("/deleteRepast")
	@ResponseBody
	public Status deleteRepast(Integer id) {
		repastManagementService.deleteByPrimaryKey(id);
		return Status.SUCCESSED;
	}
	
	
	@RequestMapping("/saveOrEditTutor")
	@ResponseBody
	public Status saveOrEditTutor(TutorManagement TutorManagement) {
		if (TutorManagement.getId() != null) {
			tutorManagementService.updateByPrimaryKeySelective(TutorManagement);
		} else {
			TutorManagement.setPubDate(new Date());
			tutorManagementService.insert(TutorManagement);
		}

		return Status.SUCCESSED;
	}

	@RequestMapping("/getAllTutor")
	@ResponseBody
	public Map<String, Object> getAllTutor(@RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer rows) {
		if (page != null && rows != null) {
			PageHelper.startPage(page, rows);
		}
		List<TutorManagement> TutorManagements = tutorManagementService.selectAll();
		PageInfo<TutorManagement> pageinfo = new PageInfo<TutorManagement>(TutorManagements);
		PageModel pageModel = new PageModel(pageinfo.getTotal(), TutorManagements);
		return pageModel.get();
	}

	@RequestMapping("/deleteTutor")
	@ResponseBody
	public Status deleteTutor(Integer id) {
		tutorManagementService.deleteByPrimaryKey(id);
		return Status.SUCCESSED;
	}
	
	
	@RequestMapping("/saveOrEditFlyer")
	@ResponseBody
	public Status saveOrEditFlyer(FlyerManagement FlyerManagement) {
		if (FlyerManagement.getId() != null) {
			flyerManagementService.updateByPrimaryKeySelective(FlyerManagement);
		} else {
			FlyerManagement.setPubDate(new Date());
			flyerManagementService.insert(FlyerManagement);
		}

		return Status.SUCCESSED;
	}

	@RequestMapping("/getAllFlyer")
	@ResponseBody
	public Map<String, Object> getAllFlyer(@RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer rows) {
		if (page != null && rows != null) {
			PageHelper.startPage(page, rows);
		}
		List<FlyerManagement> FlyerManagements = flyerManagementService.selectAll();
		PageInfo<FlyerManagement> pageinfo = new PageInfo<FlyerManagement>(FlyerManagements);
		PageModel pageModel = new PageModel(pageinfo.getTotal(), FlyerManagements);
		return pageModel.get();
	}

	@RequestMapping("/deleteFlyer")
	@ResponseBody
	public Status deleteFlyer(Integer id) {
		flyerManagementService.deleteByPrimaryKey(id);
		return Status.SUCCESSED;
	}
	
	
	@RequestMapping("/saveOrEditSupermarket")
	@ResponseBody
	public Status saveOrEditSupermarket(SupermarketManagement SupermarketManagement) {
		if (SupermarketManagement.getId() != null) {
			supermarketManagementService.updateByPrimaryKeySelective(SupermarketManagement);
		} else {
			SupermarketManagement.setPubDate(new Date());
			supermarketManagementService.insert(SupermarketManagement);
		}

		return Status.SUCCESSED;
	}

	@RequestMapping("/getAllSupermarket")
	@ResponseBody
	public Map<String, Object> getAllSupermarket(@RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer rows) {
		if (page != null && rows != null) {
			PageHelper.startPage(page, rows);
		}
		List<SupermarketManagement> SupermarketManagements = supermarketManagementService.selectAll();
		PageInfo<SupermarketManagement> pageinfo = new PageInfo<SupermarketManagement>(SupermarketManagements);
		PageModel pageModel = new PageModel(pageinfo.getTotal(), SupermarketManagements);
		return pageModel.get();
	}

	@RequestMapping("/deleteSupermarket")
	@ResponseBody
	public Status deleteSupermarket(Integer id) {
		supermarketManagementService.deleteByPrimaryKey(id);
		return Status.SUCCESSED;
	}
	
	
	@RequestMapping("/saveOrEditUser")
	@ResponseBody
	public Status saveOrEditUser(User SupermarketManagement) {
		if (SupermarketManagement.getId() != null) {
			int updateByPrimaryKeySelective = userService.updateByPrimaryKeySelective(SupermarketManagement);
			if (updateByPrimaryKeySelective == -1) {
				return Status.getFailed("用户名已存在");
			}
		} else {
			int insert = userService.insert(SupermarketManagement);
			if (insert == -1) {
				return Status.getFailed("用户名已存在");
			}
		}

		return Status.SUCCESSED;
	}

	@RequestMapping("/getAllUser")
	@ResponseBody
	public Map<String, Object> getAllUser(@RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer rows) {
		if (page != null && rows != null) {
			PageHelper.startPage(page, rows);
		}
		List<User> SupermarketManagements = userService.selectAll();
		PageInfo<User> pageinfo = new PageInfo<User>(SupermarketManagements);
		PageModel pageModel = new PageModel(pageinfo.getTotal(), SupermarketManagements);
		return pageModel.get();
	}

	@RequestMapping("/deleteUser")
	@ResponseBody
	public Status deleteUser(Integer id) {
		int deleteByPrimaryKey = userService.deleteByPrimaryKey(id);
		if (deleteByPrimaryKey == 0) {
			return Status.getFailed("删除失败");
		}
		return Status.SUCCESSED;
	}
	
	



}
