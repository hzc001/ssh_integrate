package com.muke.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.muke.ssh.dao.ProductDao;
import com.muke.ssh.entity.Product;

/**
 * 商品管理的业务层的类
 */
@Transactional
public class ProductService {

	// 业务层注入DAO的类
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	/**
	 * 业务层保存商品的方法
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("Service中的save方法执行了。。。");
		productDao.save(product);
	}
}
