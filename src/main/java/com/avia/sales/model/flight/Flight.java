package com.avia.sales.model.flight;

import com.avia.sales.model.offer.Offer;
import com.avia.sales.model.purchase.Purchase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Flight {
    @Id
    private Long id;
    private String number;
    @OneToOne
    private BoardType boardType;
    @OneToMany
    private List<Purchase> flightPurchases;
    @OneToMany
    private List<Offer> flightOffers;
}
