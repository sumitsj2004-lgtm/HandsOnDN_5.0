package org.example;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    public void displayProduct() {
        System.out.println("Product Loaded");
    }
}
