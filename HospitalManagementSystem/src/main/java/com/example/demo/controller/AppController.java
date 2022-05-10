package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Appointment;
import com.example.demo.service.AppointmentService;

@Controller
public class AppController {
	@Autowired
	private AppointmentService service;
	@RequestMapping("/")
	public String viewHome(Model model) {
		List<Appointment> listAppointments = service.listAll();
		model.addAttribute("listAppointments", listAppointments);
		return "index";

	}

	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Appointment appointment = new Appointment();
		model.addAttribute("appointment", appointment);
		return "new_appointment";

	}

@RequestMapping(value="/save",method=RequestMethod.POST)
public String saveAppointment(@ModelAttribute("appointment")Appointment appointment) {
	service.save(appointment);
	return "redirect:/";
}

@RequestMapping("/confirm/{id}")
public ModelAndView showConformPage(@PathVariable(name="id")int id )
{
	ModelAndView mav=new ModelAndView("confirm");
	Appointment appointment=service.get(id);
	mav.addObject("appointment",appointment);
	return mav;
}
@RequestMapping("/cancel/{id}")
public  String cancelAppointment(@PathVariable(name="id")int id) {
	service.cancel(id);
	return "redirect:/";
}
}
