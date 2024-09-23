package ie.atu.week2.lab1_week2_refresher;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductInterface extends JpaRepository<Product, Long> {
}
