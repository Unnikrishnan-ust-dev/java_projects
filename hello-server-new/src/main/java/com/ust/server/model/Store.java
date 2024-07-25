package com.ust.server.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Store {

	private ArrayList<Egg> eggs = new ArrayList<>();
    private HashSet<Milk> milks = new HashSet<>();
    private LinkedList<Chocolate> chocolates = new LinkedList<>();
    TreeSet<Apple> apples = new TreeSet<>();
    Queue<Bread> breads = new PriorityQueue<>();
}
