package com.huanacoquispe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huanacoquispe.models.Area;
import com.huanacoquispe.repositories.IAreaRepository;

@Service
public class AreaService {

	@Autowired
	private IAreaRepository areaRepository;
	
	public List<Area> getAll(){
		return areaRepository.findAll();
	}
	
	
}
