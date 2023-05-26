package com.huanacoquispe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.huanacoquispe.models.Area;

@Repository
public interface IAreaRepository extends JpaRepository<Area, Long>{

	public List<Area> findAll();
	
}
