package com.muke.ssh.action;

import com.muke.ssh.entity.Product;
import com.muke.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * ��Ʒ�����Action��
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product> {

	// ģ������ʹ�õ���
	private Product product = new Product();

	@Override
	public Product getModel() {
		return product;
	}

	// Struts��Spring���Ϲ����а������Զ�ע���ҵ������
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	/**
	 * ������Ʒ��ִ�еķ�����save
	 */
	public String save() {
		System.out.println("Action�е�save����ִ���ˡ�����");
		productService.save(product);
		return NONE;
	}
}
