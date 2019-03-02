package com.employee.crud;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.employee.dao.EmployeeDao;
import com.employee.entity.EmployeeEntity;
import com.employee.form.EmployeeForm;

@Controller
@RequestMapping("/jsp/main/*")
public class UpdateController {
	
	@Inject
	EmployeeDao employeeDao;
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value="/update/update_input", method=RequestMethod.GET)
	public void updateView(Model model) {
		logger.info("update");
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		EmployeeForm employeeList = employeeDao.searchEmloyee(employeeEntity);
		
		model.addAttribute("employeeList", employeeList);
	}
	
	@RequestMapping(value="/update/updateCheck", method=RequestMethod.POST)
	public String updateCheck(EmployeeForm employeeForm, HttpSession httpSession, Model model) {
		httpSession.setAttribute("updateCheck", employeeForm);
		
		model.addAttribute("employeeList", employeeForm);
		
		return "/jsp/main/update/update_check";
	}
}
