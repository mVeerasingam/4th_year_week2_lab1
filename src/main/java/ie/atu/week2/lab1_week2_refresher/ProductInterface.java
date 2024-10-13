package ie.atu.week2.lab1_week2_refresher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductInterface extends JpaRepository<Product, Long> {
}
