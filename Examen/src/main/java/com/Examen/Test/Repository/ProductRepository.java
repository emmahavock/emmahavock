package com.Examen.Test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Examen.Test.model.Producto;

public interface ProductRepository extends JpaRepository<Producto, Integer> {

	Producto  findByName(String name);
	
}
