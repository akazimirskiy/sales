package com.avia.sales.model.flight;

import com.avia.sales.model.product.ProductLimit;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class BoardType {
    @Id
    private Long id;
    private String name;
    private String description;
    @OneToMany
    private List<ProductLimit> prodcutLimitList;
}
