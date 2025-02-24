package com.avia.sales.service;

import com.avia.sales.model.purchase.Purchase;
import com.avia.sales.repository.FlightRepository;
import com.avia.sales.repository.OfferRepository;
import com.avia.sales.repository.PassengerRepository;
import com.avia.sales.repository.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final PassengerRepository passengerRepository;
    private final OfferRepository offerRepository;
    private final FlightRepository flightRepository;
    private final PurchaseRepository purchaseRepository;

    public void purchase(Long passengerId, Long offerId, Long flightId, BigDecimal price) {

        //TODO check if the flight has capacity for this purchase (atomic operation)

        Purchase purchase = new Purchase();
        purchase.setPurchasePrice(price);
        purchase.setPassenger(passengerRepository.findById(passengerId).orElseThrow());
        purchase.setOffer(offerRepository.findById(offerId).orElseThrow());
        purchase.setPurchaseDateTime(new java.sql.Timestamp(System.currentTimeMillis()));
        purchaseRepository.save(purchase);
        flightRepository.findById(flightId).ifPresent(flight -> {
            flight.getFlightPurchases().add(purchase);
            flightRepository.save(flight);
        });
    }
}
