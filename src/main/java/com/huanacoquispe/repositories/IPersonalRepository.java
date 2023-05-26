package com.huanacoquispe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.huanacoquispe.models.Personal;

@Repository
public interface IPersonalRepository extends JpaRepository<Personal, Long> {

	public List<Personal> findAll();
	List<Personal> findByAreaId(Long id);
	
}
