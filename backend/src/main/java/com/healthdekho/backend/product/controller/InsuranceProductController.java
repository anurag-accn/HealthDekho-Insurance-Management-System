package com.healthdekho.backend.product.controller;

import com.healthdekho.backend.product.dto.InsuranceProductResponse;
import com.healthdekho.backend.product.entity.InsuranceProduct;
import com.healthdekho.backend.product.service.InsuranceProductService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class InsuranceProductController {

    private final InsuranceProductService productService;

    public InsuranceProductController(InsuranceProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<InsuranceProductResponse> getActiveProducts() {
        return productService.getActiveProducts().stream()
                .map(this::toResponse)
                .toList();
    }

    private InsuranceProductResponse toResponse(InsuranceProduct product) {
        return new InsuranceProductResponse(
                product.getProductCode(),
                product.getPolicyName(),
                product.getPolicyType(),
                product.getTermMonths(),
                product.getPremiumFrequency(),
                product.getPremiumAmount(),
                product.getSumInsured(),
                product.getMinEntryAge(),
                product.getMaxEntryAge());
    }
}
