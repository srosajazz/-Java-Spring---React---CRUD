package com.sergiorosa.crudcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sergiorosa.crudcatalog.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
