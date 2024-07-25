package com.ust.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Apple {
	private double price;
    private String type;
    private int shelfLife;
    private String expiry;
    private double quantity;
}
