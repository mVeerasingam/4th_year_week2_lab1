package ie.atu.week2.lab1_week2_refresher;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProductList(){
        return productService.getProductList();
    }

    @PostMapping("/products")
    public Product addProduct(@Valid @RequestBody Product product){
        return productService.addProduct(product);
    }

}
