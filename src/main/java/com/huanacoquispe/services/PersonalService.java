package com.huanacoquispe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huanacoquispe.models.Personal;
import com.huanacoquispe.repositories.IPersonalRepository;

@Service
public class PersonalService  {
	
	@Autowired
	private IPersonalRepository personalRepository;
	
	public List<Personal> getAll(){
		return personalRepository.findAll();
	}
	
	public List<Personal> findByAreaId(Long id){
		return personalRepository.findByAreaId(id);
	}
	
}
