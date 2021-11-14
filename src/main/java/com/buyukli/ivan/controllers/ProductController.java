package com.buyukli.ivan.controllers;

import com.buyukli.ivan.data.Product;
import com.buyukli.ivan.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String showProductsPage(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products_page";
    }

    @GetMapping("/products/{id}")
    public String showProductPage(Model model, @PathVariable Long id) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product_info_page";
    }
}
