package com.healthdekho.backend.product.service;

import com.healthdekho.backend.product.entity.InsuranceProduct;
import com.healthdekho.backend.product.repository.InsuranceProductRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InsuranceProductService {

    private final InsuranceProductRepository productRepository;

    public InsuranceProductService(InsuranceProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = true)
    public List<InsuranceProduct> getActiveProducts() {
        return productRepository.findAllByActiveTrueOrderByProductCodeAsc();
    }
}
