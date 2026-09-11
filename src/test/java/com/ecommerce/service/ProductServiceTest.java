package com.ecommerce.service;

import com.ecommerce.model.Product;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class ProductServiceTest {
    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    @Test
    void testCreateProduct() {
        Product product = new Product();
        Mockito.when(productRepository.save(product)).thenReturn(product);
        productService.createProduct(product);
        Mockito.verify(productRepository, Mockito.times(1)).save(product);
    }
}