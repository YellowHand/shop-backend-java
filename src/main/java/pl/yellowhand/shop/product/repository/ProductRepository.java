package pl.yellowhand.shop.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.yellowhand.shop.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
