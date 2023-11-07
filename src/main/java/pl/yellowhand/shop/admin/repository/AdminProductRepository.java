package pl.yellowhand.shop.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.yellowhand.shop.admin.model.AdminProduct;

public interface AdminProductRepository extends JpaRepository<AdminProduct, Long> {
}
