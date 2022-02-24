package com.yashu.product.bo;

import com.yashu.product.dao.ProductDAO;
import com.yashu.product.dao.ProductDAOImpl;
import com.yashu.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
