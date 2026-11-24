package com.healthdekho.backend.product.repository;

import com.healthdekho.backend.product.entity.InsuranceProduct;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceProductRepository extends JpaRepository<InsuranceProduct, Long> {

    List<InsuranceProduct> findAllByActiveTrueOrderByProductCodeAsc();
}
