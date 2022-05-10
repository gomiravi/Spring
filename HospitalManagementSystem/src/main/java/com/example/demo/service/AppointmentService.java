package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Appointment;
import com.example.demo.repository.AppointmentRepository;


@Transactional
@Service
public class AppointmentService {
@Autowired
private AppointmentRepository repo;
public List<Appointment>listAll(){
	return repo.findAll();
}
public void save(Appointment appointment) {
	repo.save(appointment);
}
public Appointment get(long id) {
	return repo.findById(id).get();
	
	
}
public void cancel(long id) {
	repo.deleteById(id);
}
}
