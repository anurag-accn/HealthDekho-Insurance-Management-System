package com.healthdekho.backend.product.dto;

import java.math.BigDecimal;

public record InsuranceProductResponse(
        String productCode,
        String policyName,
        String policyType,
        Integer termMonths,
        String premiumFrequency,
        BigDecimal premiumAmount,
        BigDecimal sumInsured,
        Integer minEntryAge,
        Integer maxEntryAge) {
}
