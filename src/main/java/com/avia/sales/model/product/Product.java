package com.avia.sales.model.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;
    @OneToOne
    private ProductType productType;
}
