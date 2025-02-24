package com.avia.sales.model.purchase;

import com.avia.sales.model.offer.Offer;
import com.avia.sales.model.passenger.Passenger;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Entity
public class Purchase {
    @Id
    private Long id;
    @OneToOne
    private Offer offer;
    private Timestamp purchaseDateTime;
    private BigDecimal purchasePrice;
    @ManyToOne
    private Passenger passenger;
}
