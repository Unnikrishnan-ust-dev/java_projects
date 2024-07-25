package com.ust.server.model;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bread {

	private double price;
    private String type;
    private int shelfLife;
    private String expiry;
    private List<String> ingredients;
    private int slices;
    private double quanity;
}
