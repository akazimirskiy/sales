package com.avia.sales.model.passenger;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Passenger {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}
