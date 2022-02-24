package com.yashu.product.bo;

import com.yashu.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
