package ie.atu.week2.lab1_week2_refresher;

import ie.atu.week2.lab1_week2_refresher.notificationRequest.NotificationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ProductInterface productInterface;
    private final ProductClient productClient;

    @Autowired
    public ProductService(ProductInterface productInterface, ProductClient productClient) {
        this.productInterface = productInterface;
        this.productClient = productClient;
    }

    // find all products by using the ProductDataAccess interface
    public List<Product> getProductList() {
        return productInterface.findAll();
    }

    // add product + save it to the embedded db
    public Product addProduct(Product product) {
        Product savedProduct = productInterface.save(product);

        NotificationRequest notificationRequest = new NotificationRequest(
                "Created",
                savedProduct.getId(),
                savedProduct.getName(),
                savedProduct.getPrice()
        );
        productClient.sendNotification(notificationRequest);

        return savedProduct;
    }

    public Product findById(Long id) {
        return productInterface.findById(id)
                .orElseThrow(() -> new RuntimeException("Product with ID " + id + " not found"));
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        Product product = findById(id);

        product.setName(updatedProduct.getName());
        product.setPrice(updatedProduct.getPrice());

        NotificationRequest notificationRequest = new NotificationRequest(
                "Updated",
                product.getId(),
                product.getName(),
                product.getPrice()
        );
        productClient.sendNotification((notificationRequest));

        return productInterface.save(product);
    }

    public void deleteProduct(Long id) {
        Product product = findById(id);

        productInterface.deleteById(id);

        NotificationRequest notificationRequest = new NotificationRequest(
                "Deleted",
                product.getId(),
                product.getName(),
                product.getPrice()
        );
        productClient.sendNotification((notificationRequest));
    }
}
