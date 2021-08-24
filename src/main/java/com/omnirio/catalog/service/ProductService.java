package com.omnirio.catalog.service;

import com.omnirio.catalog.wapper.ProductRequest;
import com.omnirio.catalog.wapper.ProductResponse;

public interface ProductService {

	ProductResponse insertProduct(ProductRequest productRequest);

	ProductResponse getProduct(Long productId);
}
