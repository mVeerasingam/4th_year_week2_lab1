package ie.atu.week2.lab1_week2_refresher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private List<Product> productList = new ArrayList<Product>();

    @GetMapping("/products")
    public List<Product> getProductList(){
        return productList;
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        productList.add(product);
        return product;
    }
}
