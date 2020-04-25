package com.muke.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.muke.ssh.entity.Product;

/**
 * 商品管理的DAO类
 */
public class ProductDao extends HibernateDaoSupport {

	/**
	 * DAO保存商品的方法
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("DAO中的save方法执行了。。。");
		this.getHibernateTemplate().save(product);
	}

}
