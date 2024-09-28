package ie.atu.week2.lab1_week2_refresher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private ProductInterface productInterface;
    @Autowired
    public ProductService(ProductInterface productInterface) {
        this.productInterface = productInterface;
    }

    // find all products by using the ProductDataAccess interface
    public List<Product> getProductList() {
        return productInterface.findAll();
    }

    // add product + save it to the embedded db
    public Product addProduct(Product product) {
        return productInterface.save(product);
    }

    public Product findById(Long id) {
        return productInterface.findById(id)
                .orElseThrow(() -> new RuntimeException("Product with ID " + id + " not found"));
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        Product product = findById(id);

        product.setName(updatedProduct.getName());
        product.setPrice(updatedProduct.getPrice());

        return productInterface.save(product);
    }

    public void deleteProduct(Long id) {
        productInterface.deleteById(id);
    }
}
