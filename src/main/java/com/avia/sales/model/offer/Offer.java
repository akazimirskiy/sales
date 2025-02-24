package com.avia.sales.model.offer;

import com.avia.sales.model.product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Offer {
    @Id
    private Long id;
    private String name;
    @OneToOne
    private Product product;
    private BigDecimal price;
}
