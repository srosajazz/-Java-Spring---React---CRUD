package com.sergiorosa.crudcatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sergiorosa.crudcatalog.DTO.CategoryDTO;
import com.sergiorosa.crudcatalog.entities.Category;
import com.sergiorosa.crudcatalog.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll(){
		List<Category> list = repository.findAll();
		//Lambda expression
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	}
}
