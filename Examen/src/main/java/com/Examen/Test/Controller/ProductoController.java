package com.Examen.Test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Examen.Test.Service.ProductService;
import com.Examen.Test.model.Producto;

@CrossOrigin(origins ="http://localhost:4200",maxAge= 3600)
@RestController
@RequestMapping({"Product"})
public class ProductoController {


	@Autowired
	private  ProductService productService;

	@PostMapping("/saveProduct")
	public Producto addProduct(@RequestBody Producto producto) {
		return productService.saveProducto(producto);
	}
	@PostMapping("/saveProducts")
	public List<Producto> addProducts(@RequestBody List<Producto> productList){
		return productService.saveProducts(productList);
	}

	@GetMapping("/getProduct")
	public List<Producto>findProducts(){
		return productService.getProducts();
	}
	@GetMapping("/getProductById/{id}")
	public Producto findProductById (@PathVariable int  id) {
		return productService.getProductById(id);

	}
	@GetMapping("/getProductByName/{name}")
	public Producto findProductByName (@PathVariable    String name) {
		return productService.getProductByName(name);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productService.deleteProduct(id);
	}



}
