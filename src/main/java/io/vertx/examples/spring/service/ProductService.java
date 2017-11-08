package io.vertx.examples.spring.service;

import io.vertx.examples.spring.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Simple Spring service bean to expose the results of a trivial database call
 */
@Service
public class ProductService {

//  @Autowired
//  private ProductRepository repo;
	@Autowired
	

  public List<Product> getAllProducts() {
//    return repo.findAll();
	  return null;
  }

	public void saveProduct(Product p) {
		/*System.out.println("保存产品...,模拟阻塞5秒...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
//		repo.save(p);
//		return p.getProductId();
	}

}
