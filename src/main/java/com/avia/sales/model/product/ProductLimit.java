package com.avia.sales.model.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class ProductLimit {

    @Id
    private Long id;
    @OneToOne
    private ProductType productType;
    private Integer limit;
}
