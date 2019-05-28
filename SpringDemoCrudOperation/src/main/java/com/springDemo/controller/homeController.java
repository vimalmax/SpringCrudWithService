package com.springDemo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springDemo.model.EmployeeModel;
import com.springDemo.services.services;

@Controller
public class homeController {

	@Autowired
	services services;

	@RequestMapping(value = "index.aspx", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "registration.aspx", method = RequestMethod.GET)
	public String registration() {
		return "registration";
	}

	@RequestMapping(value = "registration.aspx", method = RequestMethod.POST)
	public String registrationSave(@RequestParam("eid") int eid, @RequestParam("emp_name") String name,
			@RequestParam("email") String email) {
		EmployeeModel emp = null;
		if (eid == 0) {
			emp = new EmployeeModel(eid, name, email);
		} else {

			emp = new EmployeeModel(name, email);
		}

		services.save(emp);
		return "index";
	}

	@RequestMapping(value = "registrationview.aspx", method = RequestMethod.GET)
	public String registrationSaveDiaplay(Model m) {
		List list = services.display(new EmployeeModel());
		m.addAttribute("datalist", list);
		return "viewData";
	}

	@RequestMapping(value = "registrationDelate.aspx", method = RequestMethod.GET)
	public String registrationSaveDelated(@PathParam("id") int id) {
		EmployeeModel em=new EmployeeModel(id);
		services.delateById(em);
		return "index";
	}

	@RequestMapping(value = "registrationUpdate.aspx", method = RequestMethod.GET)
	public String registrationSaveUpdate(@PathParam("id") int id, Model m) {
		System.out.println(id);
		EmployeeModel em = services.update(new EmployeeModel(), id);
		m.addAttribute("result", em);
		return "registration";
	}
}
