package com.huanacoquispe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.huanacoquispe.models.Personal;
import com.huanacoquispe.services.AreaService;
import com.huanacoquispe.services.PersonalService;

@Controller
@RequestMapping("")
public class MainController {
	
	@Autowired
	private PersonalService personalService;
	
	@Autowired
	private AreaService areaService;
	
	@GetMapping({"/lista"})
	public String listaPersonal(@RequestParam(name="area_id", required=false, defaultValue = "-1") Long area_id, Model model) {
		List<Personal> personalList;
		if(area_id == -1) {
			personalList = personalService.getAll();
		}else {
			personalList = personalService.findByAreaId(area_id);
		}
		model.addAttribute("personalList", personalList);
		return "listaPersonal";
	}
	
	@GetMapping({"/"})
	public String index(Model model) {
		model.addAttribute("areaList", areaService.getAll());
		return "index";
	}
	
}
