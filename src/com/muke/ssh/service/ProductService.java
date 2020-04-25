package com.muke.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.muke.ssh.dao.ProductDao;
import com.muke.ssh.entity.Product;

/**
 * ��Ʒ�����ҵ������
 */
@Transactional
public class ProductService {

	// ҵ���ע��DAO����
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	/**
	 * ҵ��㱣����Ʒ�ķ���
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("Service�е�save����ִ���ˡ�����");
		productDao.save(product);
	}
}
