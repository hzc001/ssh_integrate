package com.muke.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.muke.ssh.entity.Product;

/**
 * ��Ʒ�����DAO��
 */
public class ProductDao extends HibernateDaoSupport {

	/**
	 * DAO������Ʒ�ķ���
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("DAO�е�save����ִ���ˡ�����");
		this.getHibernateTemplate().save(product);
	}

}
