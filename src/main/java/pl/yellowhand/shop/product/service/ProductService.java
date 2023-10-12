package pl.yellowhand.shop.product.service;

import org.springframework.stereotype.Service;
import pl.yellowhand.shop.product.model.Product;
import pl.yellowhand.shop.product.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
