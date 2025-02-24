package com.avia.sales.model.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductType {
    @Id
    private Long id;
    private String typeName;
}
