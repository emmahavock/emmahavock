package com.Examen.Test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Examen.Test.Repository.ProductRepository;
import com.Examen.Test.model.Producto;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	 public Producto saveProducto(Producto producto) {
		return 		 repository.save(producto);
	 }
	 
	
	 public List<Producto> saveProducts(List<Producto> products) {
	        return repository.saveAll(products);
	    }

	    public List<Producto> getProducts() {
	        return repository.findAll();
	    }

	    public Producto getProductById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    public Producto getProductByName(String name) {
	        return repository.findByName(name);
	    }

	    public String deleteProduct(int id) {
	        repository.deleteById(id);
	        return "product removed !! " + id;
	    }

//	    public Producto updateProducto (Producto producto) {
//	    	Producto existingProduct =  repository.findById(producto.getClass()).orElse(null);
//	        existingProduct.setName(product.);
//	        existingProduct.setQuantity(product);
//	        existingProduct.setPrice(product.getPrice());
//	        return repository.save(existingProduct);
//	    }

}
