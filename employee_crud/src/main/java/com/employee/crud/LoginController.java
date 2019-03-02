package com.employee.crud;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.employee.dao.EmployeeDao;
import com.employee.entity.EmployeeEntity;

@Controller
@RequestMapping("/jsp/main/*")
public class LoginController {
	
	@Inject
	EmployeeDao employeeDao;
	

	@RequestMapping(value="/index/loginCheck", method=RequestMethod.POST)
	public String searchLogin(EmployeeEntity employeeEntity) {
			List<String> loginList = employeeDao.searchEmpEmail(employeeEntity);
			
			if(loginList.isEmpty()) {
				System.out.println("fail");
			}
			else if(!loginList.isEmpty()) {
				System.out.println("good");
			}
			
			return "redirect:/jsp/main/list/list";
	}
	
	
}
