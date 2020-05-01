/**
 * 
 */
package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.service.EmpService;
import com.example.demo.service.EmpServiceImpl;

/**
 * @author ram
 *
 */
@Controller
public class DemoController {

	@Autowired
	EmpService eService;

	/*
	 * @RequestMapping("/employees") public List<Employee> getEmployeeList() {
	 * List<Employee> empList = new ArrayList<Employee>(); empList.add(new
	 * Employee(10, "Mike", 2300,23)); empList.add(new Employee(11,"Hai",2500,35));
	 * return empList; }
	 */

	@RequestMapping("/employees")
	@ResponseBody
	public ModelAndView getEmployeeList() {
		List<Employee> empList = new ArrayList<Employee>();
		// empList.add(new Employee(10, "Mike", 2300, 23));
		// empList.add(new Employee(11, "Hai", 2500, 35));
		empList = eService.getEmployees();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("empList", empList);
		return mv;
	}

	@RequestMapping("/myData")
	@ResponseBody
	public List<Employee> myEmpData() {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "Mike", 2300, 23));
		empList.add(new Employee(11, "Hai", 2500, 35));
		return empList;
	}

	@RequestMapping("/newemployee")
	public ModelAndView newEmployee(ModelAndView mv) {
		
		Employee e = new Employee();
		mv.setViewName("newemp");
		mv.addObject("e", e);
		return mv;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("e") Employee e1) {
		
		try {
		eService.insertEmployee(e1);
		}
		catch(Exception e) {
			System.out.println("error occured");
		}
		List<Employee> empList = new ArrayList<Employee>();
		empList = eService.getEmployees();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("empList", empList);
		System.out.println("before save method return");
		return mv;
	}

	@RequestMapping(value="/edit/{id}")
	public ModelAndView editEmployee(@PathVariable(name = "id") int id) {
	
	ModelAndView mv = new ModelAndView("editemployee");
	Employee e2 = eService.getEmployeeById(id);
	mv.addObject("e2", e2);
	return mv;
	}
	
	//http://localhost:8080/delete/100?pageNo=asc
	@RequestMapping(value = "/delete/{id}")
	public ModelAndView deleteEmployee(@PathVariable(name = "id") int id,@RequestParam(value="pageNo",required=false) String pageNo) {
		
		System.out.println("PathVariable:"+id);
		System.out.println("Request Paramaeter:"+pageNo);
		eService.deleteEmployee(id);
		List<Employee> empList = new ArrayList<Employee>();
		empList = eService.getEmployees();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("empList", empList);
		System.out.println("before editsave method return");
		return mv;
	}

	@RequestMapping(value = "editsave",method = RequestMethod.POST)
	public ModelAndView editSaveEmployee(@ModelAttribute("e2") Employee e2) {
		
		eService.update(e2);
		List<Employee> empList = new ArrayList<Employee>();
		empList = eService.getEmployees();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("empList", empList);
		System.out.println("before editsave method return");
		return mv;
	}
	
	

}